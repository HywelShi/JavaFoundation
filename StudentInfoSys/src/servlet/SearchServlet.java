package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.DBUtil;

public class SearchServlet extends HttpServlet{
	public void service(HttpServletRequest request,
			HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=UTF-8");
		String username = request.getParameter("username");
		PrintWriter pw = response.getWriter();
		pw.print("<h1>ËÑË÷½á¹û</h1>");
		pw.print("<table border='1' cellspacing='0' width='400px'>");
		pw.println("<tr align='center'><td>±àºÅ</td><td>ÐÕÃû</td><td>ÄêÁä</td><td>µØÖ·</td></tr>");
		DBUtil db = new DBUtil();
		Connection conn = db.createConnection();
		String sql = "select * from student where name like '%"+username+"%'";
		try {
			Statement state = conn.createStatement();
			ResultSet rs = state.executeQuery(sql);
			while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String address = rs.getString("address");
				pw.println("<tr align='center'><td>"+id+"</td><td>"+name+"</td><td>"+age+"</td><td>"+address+"</td></tr>");
			}
		} catch (SQLException e) {
			pw.print("ËÑË÷Ê§°Ü!");
			e.printStackTrace();
		}
		
		
		
		pw.print("</table>");
		pw.print("<a href='search.html'>·µ»ØËÑË÷</a>");
	}
}

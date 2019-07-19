package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.DBUtil;

public class InputServlet extends HttpServlet{
	public void service(HttpServletRequest request,
			HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=UTF-8");
		String name = request.getParameter("name");
		String age =  request.getParameter("age");
		String address = request.getParameter("address");
		PrintWriter pw = response.getWriter();
		if(name=="" || age=="" || address==""){
			pw.print("录入失败,数据不能为空!<a href='input.html'>返回</a>");
		}else{
			DBUtil db = new DBUtil();
			Connection conn = db.createConnection();
			//页面获取的年龄为字符串,需要利用Integer.parseInt()转换为整型
			String sql = "insert into student(name,age,address,create_time,modify_time)"
					+ "values('"+name+"',"+Integer.parseInt(age)+",'"+address+"',(select current_timestamp),(select current_timestamp));";
			try {
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.execute();
				pw.print("录入成功!<a href='input.html'>继续录入</a>");
				pw.print("<a href='search.html'>前往搜索</a>");
			} catch (SQLException e) {
				pw.print("录入失败!<a href='input.html'>返回</a>");
				e.printStackTrace();
			}
			
			
			
		}
	}
}

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
			pw.print("¼��ʧ��,���ݲ���Ϊ��!<a href='input.html'>����</a>");
		}else{
			DBUtil db = new DBUtil();
			Connection conn = db.createConnection();
			//ҳ���ȡ������Ϊ�ַ���,��Ҫ����Integer.parseInt()ת��Ϊ����
			String sql = "insert into student(name,age,address,create_time,modify_time)"
					+ "values('"+name+"',"+Integer.parseInt(age)+",'"+address+"',(select current_timestamp),(select current_timestamp));";
			try {
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.execute();
				pw.print("¼��ɹ�!<a href='input.html'>����¼��</a>");
				pw.print("<a href='search.html'>ǰ������</a>");
			} catch (SQLException e) {
				pw.print("¼��ʧ��!<a href='input.html'>����</a>");
				e.printStackTrace();
			}
			
			
			
		}
	}
}

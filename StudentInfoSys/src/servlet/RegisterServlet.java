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

public class RegisterServlet extends  HttpServlet{
	public void service(HttpServletRequest request,
			HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		PrintWriter pw = response.getWriter();
		
		//ע��ɹ��Զ���ת����¼ҳ�� ʧ�ܻ���ʾ����
		if(username==""||password==""){
			pw.print("ע��ʧ��,�˺����벻��Ϊ��!<a href='register.html'>����</a>");
		}else{
			DBUtil db = new DBUtil();
			Connection conn = db.createConnection();
			String sql = "insert into user(username,password,create_time,modify_time)"
					+ "values('"+username+"','"+password+"',(select current_timestamp),(select current_timestamp));";
			try {
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.execute();
				System.out.println("ע��ɹ�!");
				//ע��ɹ��Զ���ת����¼ҳ��
				response.sendRedirect("/StudentInfoSys/login.html");
			} catch (SQLException e) {
				pw.print("ע��ʧ��,������ע��!<a href='register.html'>����</a>");
				System.out.println("ע��ʧ��");
				e.printStackTrace();
			}
			
			
			
		}
		
	}
}

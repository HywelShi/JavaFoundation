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

public class LoginServlet extends HttpServlet{
	public void service(HttpServletRequest request,
			HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		PrintWriter pw = response.getWriter();
		if(username==""||password==""){
			pw.print("��¼ʧ��,�˺����벻��Ϊ��!<a href='login.html'>����</a>");
		}else{
			DBUtil db = new DBUtil();
			Connection conn = db.createConnection();
			String sql = "select * from user "
					+ "where username='"+username+"' and password='"+password+"';";
			
			try {
				Statement state = conn.createStatement();
				ResultSet rs  = state.executeQuery(sql);
				if(rs.next()){
					System.out.println("��¼�ɹ�!");
					//��ת��¼��ѧ����Ϣ����
					response.sendRedirect("/StudentInfoSys/input.html");
				}else{
					pw.print("��¼ʧ��!<a href='login.html'>����</a>");
				}
			} catch (SQLException e) {
				pw.print("��¼ʧ��!<a href='login.html'>����</a>");
				e.printStackTrace();
			}
			
		}
	}
}











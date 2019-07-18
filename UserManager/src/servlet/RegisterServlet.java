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

public class RegisterServlet extends HttpServlet {
	public void service(HttpServletRequest request,
			HttpServletResponse response) throws IOException{
		//1.�����������
		response.setContentType("text/html;charset=UTF-8");
		//2.��ȡ�˺ź�����
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//3.��������PrintWriter����
		PrintWriter pw = response.getWriter();
		//4.�ж��˺ź������Ƿ�Ϊ��
		//5.ҳ��������
		if(username=="" || password==""){
			System.out.println("�˺Ż����벻��Ϊ�գ�");
			//6.ע��ʧ�� ��Ҫ����ע��ҳ��
			pw.print("�˺������벻��Ϊ�գ�"
					+ "<a href='register.html'>����</a>");
			
		}else{
			
			//7.ע��ɹ�֮����Ҫ�����ݴ������ݿ�
			DBUtil db = new DBUtil();
			Connection conn = db.createConnection();
			//8.����sql���
			String sql = "insert into user"
					+ "(username,password,create_time,modify_time)"
					+ "values('"+username+"','"+password+"',"
					+ "(select current_timestamp),"
					+ "(select current_timestamp));";
			//9.ִ��sql��� �������ݿ�
			try {
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.execute();//ִ�в���
				System.out.println("ע��ɹ���");
				pw.print("ע��ɹ���");
				System.out.println("�������ݿ�ɹ���");
				pw.print("�������ݿ�ɹ���");
				pw.print("<br><a href='register.html'>����ע��</a>");
				pw.print("<a href='login.html'>���ص�½</a>");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("�������ݿ�ʧ�ܣ�");
				pw.print("�������ݿ�ʧ�ܣ�");
			}
			
		}
		
		
		
		
	}
}

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

/*
 * 1.�̳�
 * 2.дservice����
 * 3.��������
 * 4.��ȡ��½ҳ����û�������
 * 5.����PrintWriter����
 * 6.�������ݿ�
 * 7.����sql��ѯ���
 * 8.ִ��sql������ɽ����
 * 9.�жϽ����������û������
 * 10.�����ʾ����
 */
public class LoginServlet extends HttpServlet{
	public void service(HttpServletRequest request,
			HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter pw = response.getWriter();
		
	
		//���ж��Ƿ��п�ֵ ��ȥ���ݿ��������
		if(username=="" || password==""){
			pw.print("�˺Ż�����Ϊ�գ�"
					+ "<a href='login.html'>���ص�½</a>");
		}else{
			//�������ݿ��ѯ���ݲ��ж�
			DBUtil db = new DBUtil();
			Connection conn = db.createConnection();
			String sql = "select * from user where "
					+ "username='"+username+"' "
					+ "and password='"+password+"';";
			//ִ��sql���
			try {
				Statement state = conn.createStatement();
				ResultSet rs = state.executeQuery(sql);
				if(rs.next()){
					pw.print("��½�ɹ���");
					//��ת����ҳ
					response.sendRedirect("/UserManager/index.html");
				}else{
					pw.print("��½ʧ�ܣ�");
					pw.print("<a href='login.html'>���ص�½</a>");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
}






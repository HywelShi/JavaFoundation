package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	public void service(HttpServletRequest request,
			HttpServletResponse response) throws IOException{
		
		//1.�����������
		//�����Ӧ����
		response.setContentType("text/html;charset=UTF-8");
		//2.��ȡǰ�˱��ύ�������˺ź�����
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//��̨����̨�������
		System.out.println("�˺�Ϊ��"+username);
		System.out.println("����Ϊ��"+password);
		
		//3.�ж��Ƿ�Ϊ��
		//4.����������ҳ����
		//��Ҫ������Ӧ���������PrintWriter
		//������껮��ȥѡ��һ���׳����Լ���
		PrintWriter pw = response.getWriter();
		if(username=="" || password==""){
			System.out.println("�˺Ż����벻��Ϊ�գ�");
			pw.print("�˺Ż����벻��Ϊ�գ�");
		}else{
			System.out.println("ע��ɹ���");
			pw.print("ע��ɹ���");
			//5.ע��ɹ�֮�����ݴ������ݿ�
			//5.1 ����һ���û���user��
			// id int ���� 
			// username varchar(100)
			// password varchar(100)
			// create_time datetime
			// modify_time datetime
			//5.2 ��DBUtil������servlet����
			//5.3 ��������
			//5.4 ����sql���
			//5.5 ִ��sql����
			
		}
		
	}
}






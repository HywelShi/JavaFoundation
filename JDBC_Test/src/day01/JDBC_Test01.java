package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Test01 {

	public static void main(String[] args) {
		
		//1.������ز���
		String driver = "com.mysql.jdbc.Driver";//����
		//��ַ��ʽ jdbc:mysql://������ip��ַ:3306/���ݿ�����
		String url = "jdbc:mysql://localhost:3306/java1907";//���ӵ�ַ
		String username = "root";//�û���
		String password = "123456";//����
		
		//2.��������
		//try{}catch(){}
		//�Զ����try�����Ƿ��ܹ���������
		//��������쳣��catch���Զ������쳣�����
		//�쳣���֮�󣬷�����Դ���
		
		try {
			Class.forName(driver);
			System.out.println("���������ɹ���");
			
			//3.��������
			try {
				Connection conn = DriverManager.getConnection(url,username,password);
				System.out.println("�������ӳɹ���");
				
				//4.����sql���
				String sql = "select * from emp;";
				//5.������ع���ִ��sql���
				//5.1 ��������
				Statement state = conn.createStatement();
				//5.2 ִ��sql��� �õ�һ�������
				ResultSet rs = state.executeQuery(sql);
				
				//6.������
				while(rs.next()){
					int id = rs.getInt("id");
					String name = rs.getString("name");
					int age = rs.getInt("age");
					double salary = rs.getDouble("salary");
					System.out.println(
							id+"\t"+name+"\t"+age+"\t"+salary);
				}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("��������ʧ�ܣ�");
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("��������ʧ�ܣ�");
		}
		
		
		
		
		
		
		

	}

}

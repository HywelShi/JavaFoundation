package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBUtil {
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/StudentInfoSys";
	String username = "root";
	String password = "123456";
	Connection conn = null;
	
	public Connection createConnection(){
		try {
			Class.forName(driver);
			
			try {
				conn = DriverManager.getConnection(url,username,password);
				System.out.println("�������ݿ�ɹ�!");
			} catch (SQLException e) {
				System.out.println("�������ݿ�ʧ��!");
				e.printStackTrace();
			}
			
			System.out.println("���������ɹ�!");
		} catch (ClassNotFoundException e) {
			System.out.println("��������ʧ��!");
			e.printStackTrace();
		}
		return conn;
	}
	
}

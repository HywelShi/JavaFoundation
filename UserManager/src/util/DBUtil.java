package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * ����Ĺ��ܣ����ݿ����ӹ�����
 * ר�������������ݿ�����
 * @author Administrator
 *
 */
public class DBUtil {
	String driver = "com.mysql.jdbc.Driver";//����
	String url = "jdbc:mysql://localhost:3306/java1907";//���ӵ�ַ
	String username = "root";//�û���
	String password = "123456";//����
	Connection conn = null;//�������� Ĭ��Ϊ�ձ�ʾ��δ����
	//����һ���������ӵķ���
	public Connection createConnection(){
		try {
			Class.forName(driver);
			System.out.println("���������ɹ���");
			try {
				//�������� ����Ϊconn
				conn = DriverManager.getConnection(url,username,password);
				System.out.println("�������ݿ�ɹ���");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("�������ݿ�ʧ�ܣ�");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("���������ɹ���");
		}
		return conn;
	}
	
}








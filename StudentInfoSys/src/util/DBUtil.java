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
				System.out.println("链接数据库成功!");
			} catch (SQLException e) {
				System.out.println("链接数据库失败!");
				e.printStackTrace();
			}
			
			System.out.println("加载驱动成功!");
		} catch (ClassNotFoundException e) {
			System.out.println("加载驱动失败!");
			e.printStackTrace();
		}
		return conn;
	}
	
}

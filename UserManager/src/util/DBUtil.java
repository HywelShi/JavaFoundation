package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 此类的功能：数据库链接工具类
 * 专门用来创建数据库链接
 * @author Administrator
 *
 */
public class DBUtil {
	String driver = "com.mysql.jdbc.Driver";//驱动
	String url = "jdbc:mysql://localhost:3306/java1907";//链接地址
	String username = "root";//用户名
	String password = "123456";//密码
	Connection conn = null;//定义链接 默认为空表示还未链接
	//定义一个创建链接的方法
	public Connection createConnection(){
		try {
			Class.forName(driver);
			System.out.println("加载驱动成功！");
			try {
				//创建链接 起名为conn
				conn = DriverManager.getConnection(url,username,password);
				System.out.println("链接数据库成功！");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("链接数据库失败！");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("加载驱动成功！");
		}
		return conn;
	}
	
}








package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Test01 {

	public static void main(String[] args) {
		
		//1.设置相关参数
		String driver = "com.mysql.jdbc.Driver";//驱动
		//地址格式 jdbc:mysql://服务器ip地址:3306/数据库名字
		String url = "jdbc:mysql://localhost:3306/java1907";//链接地址
		String username = "root";//用户名
		String password = "123456";//密码
		
		//2.加载驱动
		//try{}catch(){}
		//自动检测try里面是否能够正常运行
		//如果出现异常，catch会自动捕获异常并输出
		//异常输出之后，方便调试代码
		
		try {
			Class.forName(driver);
			System.out.println("加载驱动成功！");
			
			//3.创建链接
			try {
				Connection conn = DriverManager.getConnection(url,username,password);
				System.out.println("创建链接成功！");
				
				//4.定义sql语句
				String sql = "select * from emp;";
				//5.利用相关工具执行sql语句
				//5.1 创建工具
				Statement state = conn.createStatement();
				//5.2 执行sql语句 得到一个结果集
				ResultSet rs = state.executeQuery(sql);
				
				//6.处理结果
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
				System.out.println("创建链接失败！");
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("加载驱动失败！");
		}
		
		
		
		
		
		
		

	}

}

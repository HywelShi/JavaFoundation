package day02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * 利用JDBC实现插入操作
 * 案例：往test中手动录入信息
 * 输入exit退出
 *
 * @author Administrator
 *
 */
public class JDBC_Test05_emp {

	public static void main(String[] args) {
		//1.获取链接
		DBUtil db = new DBUtil();
		Connection conn = db.createConnection();
		//2.定义sql
		String sql = "insert into emp"
				+ "(name,age,salary,address,create_time,modify_time)"
				+ "values(?,?,?,?,"
				+ "(select current_timestamp),"
				+ "(select current_timestamp));";
		try {
			//3.创建工具类并执行sql语句
			//PreparedStatement称为预处理工具，
			//先将sql语句执行
			//但是并没有真正的执行到数据库当中
			//需要调用execute()方法
			PreparedStatement ps = conn.prepareStatement(sql);
			
			//手动输入
			Scanner scan = new Scanner(System.in);
			//死循环 可以实现一直录入 直到输入exit退出
			System.out.println("开始录入...");
			while(true){
				System.out.println("请输入姓名：");
				String name = scan.next();
				//输入姓名时如果输入的是exit 退出
				if(name.equals("exit")){
					System.out.println("录入完毕，已退出！");
					break;
				}
				System.out.println("请输入年龄：");
				int age = scan.nextInt();
				System.out.println("请输入工资：");
				double salary = scan.nextDouble();
				System.out.println("请输入地址：");
				String address = scan.next();
				
				//四个值输入后执行将sql语句中的?替代
				ps.setString(1, name);
				ps.setInt(2, age);
				ps.setDouble(3, salary);
				ps.setString(4, address);
				ps.execute();
				System.out.println("插入数据成功！");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("插入数据失败！");
		}
		
		

	}

}









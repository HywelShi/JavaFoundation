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
public class JDBC_Test07 {

	public static void main(String[] args) {
		//1.获取链接
		DBUtil db = new DBUtil();
		Connection conn = db.createConnection();
		/**
		 * 根据姓名更新年龄
		 * 用户输入姓名 更新对应的一条数据
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("更新的姓名：");
		String name = scan.next();
		System.out.println("更新的年龄：");
		int age = scan.nextInt();
		//2.定义sql
		String sql = "update test set age="+age+""
				+ " where name='"+name+"';";
		try {
			//3.创建工具类并执行sql语句
			//PreparedStatement称为预处理工具，
			//先将sql语句执行
			//但是并没有真正的执行到数据库当中
			//需要调用execute()方法
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.execute();
			System.out.println("更新数据成功！");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("更新数据失败！");
		}
		
		

	}

}









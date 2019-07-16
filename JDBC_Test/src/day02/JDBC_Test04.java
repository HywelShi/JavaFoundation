package day02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 利用JDBC实现插入操作
 * 案例：往测试表中插入100条数据 
 *
 * @author Administrator
 *
 */
public class JDBC_Test04 {

	public static void main(String[] args) {
		//1.获取链接
		DBUtil db = new DBUtil();
		Connection conn = db.createConnection();
		//2.定义sql
		String sql = "insert into test"
				+ "(name,age,salary,address)"
				+ "values(?,?,?,?);";
		try {
			//3.创建工具类并执行sql语句
			//PreparedStatement称为预处理工具，
			//先将sql语句执行
			//但是并没有真正的执行到数据库当中
			//需要调用execute()方法
			PreparedStatement ps = conn.prepareStatement(sql);
			
			for(int i=1;i<=100;i++){
				ps.setString(1,"Tom"+i);
				ps.setInt(2, i);
				ps.setDouble(3, 5000+i);
				ps.setString(4, "USA NO."+i);
				//4.真正的执行到数据库中
				ps.execute();
			}
			
			System.out.println("插入数据成功！");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("插入数据失败！");
		}
		
		

	}

}









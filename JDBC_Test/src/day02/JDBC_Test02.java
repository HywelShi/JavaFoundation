package day02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * 用户输入姓名，查找对应的信息
 * @author Administrator
 *
 */
public class JDBC_Test02 {

	public static void main(String[] args) {
		DBUtil db = new DBUtil();
		Connection conn = db.createConnection();
		System.out.println(conn);
		//手动输入姓名
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入查询的姓名：");
		String n = scan.next();//接收输入的姓名存入n
		//1.定义sql语句
		String sql = 
				"select * from test where name='"+n+"';";
		//2.创建工具 Statement一般情况下都是用来查询
		try {
			Statement state = conn.createStatement();
			//3.执行sql语句生成结果集
			ResultSet rs = state.executeQuery(sql);
			//4.从结果集里面取具体的内容
			//判断：rs.next()是判断结果集有没有下一条数据
			if(rs.next()==false){
				System.out.println("查无此人！");
			}else{
				System.out.println("详细信息如下：");
				/*通过rs的get方法，找到对应列的具体信息*/
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				double salary = rs.getDouble("salary");
				String address = rs.getString("address");
				//输出结果
				System.out.println(
					id+"\t"+name+"\t"+
					age+"\t"+salary+"\t"+address);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}







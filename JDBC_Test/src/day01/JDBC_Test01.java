package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import day02.DBUtil;

public class JDBC_Test01 {

	public static void main(String[] args) {
		DBUtil db = new DBUtil();
		Connection conn = db.createConnection();
		
		//4.����sql���
				String sql = "select * from emp;";
				//5.������ع���ִ��sql���
				//5.1 ��������
				try{
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
				}catch(Exception e){
					e.printStackTrace();
				}
						
				
		
			
			
		
		
		
		
		
		
		
		

	}

}

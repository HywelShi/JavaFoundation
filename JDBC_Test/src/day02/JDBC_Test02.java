package day02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * �û��������������Ҷ�Ӧ����Ϣ
 * @author Administrator
 *
 */
public class JDBC_Test02 {

	public static void main(String[] args) {
		DBUtil db = new DBUtil();
		Connection conn = db.createConnection();
		System.out.println(conn);
		//�ֶ���������
		Scanner scan = new Scanner(System.in);
		System.out.println("�������ѯ��������");
		String n = scan.next();//�����������������n
		//1.����sql���
		String sql = 
				"select * from test where name='"+n+"';";
		//2.�������� Statementһ������¶���������ѯ
		try {
			Statement state = conn.createStatement();
			//3.ִ��sql������ɽ����
			ResultSet rs = state.executeQuery(sql);
			//4.�ӽ��������ȡ���������
			//�жϣ�rs.next()���жϽ������û����һ������
			if(rs.next()==false){
				System.out.println("���޴��ˣ�");
			}else{
				System.out.println("��ϸ��Ϣ���£�");
				/*ͨ��rs��get�������ҵ���Ӧ�еľ�����Ϣ*/
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				double salary = rs.getDouble("salary");
				String address = rs.getString("address");
				//������
				System.out.println(
					id+"\t"+name+"\t"+
					age+"\t"+salary+"\t"+address);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}







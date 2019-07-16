package day02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * ����JDBCʵ�ֲ������
 * ��������test���ֶ�¼����Ϣ
 * ����exit�˳�
 *
 * @author Administrator
 *
 */
public class JDBC_Test05_emp {

	public static void main(String[] args) {
		//1.��ȡ����
		DBUtil db = new DBUtil();
		Connection conn = db.createConnection();
		//2.����sql
		String sql = "insert into emp"
				+ "(name,age,salary,address,create_time,modify_time)"
				+ "values(?,?,?,?,"
				+ "(select current_timestamp),"
				+ "(select current_timestamp));";
		try {
			//3.���������ಢִ��sql���
			//PreparedStatement��ΪԤ�����ߣ�
			//�Ƚ�sql���ִ��
			//���ǲ�û��������ִ�е����ݿ⵱��
			//��Ҫ����execute()����
			PreparedStatement ps = conn.prepareStatement(sql);
			
			//�ֶ�����
			Scanner scan = new Scanner(System.in);
			//��ѭ�� ����ʵ��һֱ¼�� ֱ������exit�˳�
			System.out.println("��ʼ¼��...");
			while(true){
				System.out.println("������������");
				String name = scan.next();
				//��������ʱ����������exit �˳�
				if(name.equals("exit")){
					System.out.println("¼����ϣ����˳���");
					break;
				}
				System.out.println("���������䣺");
				int age = scan.nextInt();
				System.out.println("�����빤�ʣ�");
				double salary = scan.nextDouble();
				System.out.println("�������ַ��");
				String address = scan.next();
				
				//�ĸ�ֵ�����ִ�н�sql����е�?���
				ps.setString(1, name);
				ps.setInt(2, age);
				ps.setDouble(3, salary);
				ps.setString(4, address);
				ps.execute();
				System.out.println("�������ݳɹ���");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("��������ʧ�ܣ�");
		}
		
		

	}

}









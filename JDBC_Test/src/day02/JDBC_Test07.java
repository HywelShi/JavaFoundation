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
public class JDBC_Test07 {

	public static void main(String[] args) {
		//1.��ȡ����
		DBUtil db = new DBUtil();
		Connection conn = db.createConnection();
		/**
		 * ����������������
		 * �û��������� ���¶�Ӧ��һ������
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("���µ�������");
		String name = scan.next();
		System.out.println("���µ����䣺");
		int age = scan.nextInt();
		//2.����sql
		String sql = "update test set age="+age+""
				+ " where name='"+name+"';";
		try {
			//3.���������ಢִ��sql���
			//PreparedStatement��ΪԤ�����ߣ�
			//�Ƚ�sql���ִ��
			//���ǲ�û��������ִ�е����ݿ⵱��
			//��Ҫ����execute()����
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.execute();
			System.out.println("�������ݳɹ���");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("��������ʧ�ܣ�");
		}
		
		

	}

}









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
public class JDBC_Test06 {

	public static void main(String[] args) {
		//1.��ȡ����
		DBUtil db = new DBUtil();
		Connection conn = db.createConnection();
		/**
		 * ��������ɾ��
		 * �û��������� ɾ����Ӧ��һ������
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("������ɾ�����ݵ�������");
		String name  = scan.next();
		
		//2.����sql
		String sql = "delete from test "
				+ "where name='"+name+"';";
		try {
			//3.���������ಢִ��sql���
			//PreparedStatement��ΪԤ�����ߣ�
			//�Ƚ�sql���ִ��
			//���ǲ�û��������ִ�е����ݿ⵱��
			//��Ҫ����execute()����
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.execute();
			System.out.println("ɾ�����ݳɹ���");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ɾ������ʧ�ܣ�");
		}
		
		

	}

}









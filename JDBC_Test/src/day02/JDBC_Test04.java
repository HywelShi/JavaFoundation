package day02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * ����JDBCʵ�ֲ������
 * �����������Ա��в���100������ 
 *
 * @author Administrator
 *
 */
public class JDBC_Test04 {

	public static void main(String[] args) {
		//1.��ȡ����
		DBUtil db = new DBUtil();
		Connection conn = db.createConnection();
		//2.����sql
		String sql = "insert into test"
				+ "(name,age,salary,address)"
				+ "values(?,?,?,?);";
		try {
			//3.���������ಢִ��sql���
			//PreparedStatement��ΪԤ�����ߣ�
			//�Ƚ�sql���ִ��
			//���ǲ�û��������ִ�е����ݿ⵱��
			//��Ҫ����execute()����
			PreparedStatement ps = conn.prepareStatement(sql);
			
			for(int i=1;i<=100;i++){
				ps.setString(1,"Tom"+i);
				ps.setInt(2, i);
				ps.setDouble(3, 5000+i);
				ps.setString(4, "USA NO."+i);
				//4.������ִ�е����ݿ���
				ps.execute();
			}
			
			System.out.println("�������ݳɹ���");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("��������ʧ�ܣ�");
		}
		
		

	}

}









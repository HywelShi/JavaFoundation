package day03;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// �û�ע�� ���û�����������뼯��
		// �������� Ҫ���û�ѡ���� 1 ע�� 2��½ 3�˳�
		// Ҫ���û���ע����½
		System.out.println("��ѡ���ܣ�1ע�� 2��½ 3�˳�");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		//�����������ϴ洢�û���������
		ArrayList<String> username = new ArrayList<String>();
		ArrayList<String> password = new ArrayList<String>();
		t://break���t
		switch(num){
		case 1:
			System.out.println("��ӭע�ᣡ");
			//Ҫ�������û��������� ���뵽���ϵ���
			while(true){
				System.out.println("�������û�����");
				String name = scan.next();
				if(name.equals("exit")){
					System.out.println("ע����ϣ���ʼ��½");
					break;
				}
				System.out.println("���������룺");
				String pwd = scan.next();
				username.add(MD5(name));
				password.add(MD5(pwd));
				System.out.println("ע��ɹ���");
			}
		case 2:
			System.out.println("��ӭ��½��");
			System.out.println("�������û�����");
			String user_name = scan.next();
			System.out.println("���������룺");
			String pass_word = scan.next();
			for(int i=0;i<username.size();i++){
				if(username.get(i).equals(MD5(user_name))
						&& password.get(i).equals(MD5(pass_word))){
					System.out.println("��½�ɹ���");
					break t;//��� ����½�ɹ�֮������ָ����t��Ǵ�
				}
			}
			System.out.println("��½ʧ�ܣ�");
			break;
		case 3:
			System.out.println("���˳���");
			break;
		}
	}
	//����һ��md5�����㷨
	public static String MD5(String msg){
			String msg_md5 = null;
			try {
				MessageDigest md =
						MessageDigest.getInstance("MD5");
				byte[] bts = msg.getBytes();
				md.update(bts);
				BigInteger big = new BigInteger(md.digest());
				msg_md5 = big.toString(16);
				System.out.println("���ܳɹ���");
			} catch (NoSuchAlgorithmException e) {
				System.out.println("����ʧ�ܣ�");
				e.printStackTrace();
			}
				return msg_md5;
	}
	
}








package day04;

import java.util.Scanner;

public class RegRegister {

	public static void main(String[] args) {
		/**
		 * ��������
		 * Ҫ�����������û��� ��֤ 
		 * �����֤ʧ������������
		 * ��֤�ɹ�����������
		 * ���������ֻ���
		 * ����ȫ��֤�ɹ���ʾע��ɹ�
		 */
		//�ƶ�����
		//�û���5-15λ�����ֻ�����ĸ
		String reg_username = "^[\\w]{5,15}$";
		//����6-18λ���ֺ���ĸ�����
		String reg_password = "^(?![\\d]+$)(?![a-zA-Z]+$)[\\w]{6,18}$";
		String reg_phone = "^1[3|4|5|7|8|9][0-9]{9}$";
		Scanner scan = new Scanner(System.in);
		t://��� ��������ѭ��
		while(true){
			System.out.println("�������û�����"
					+ "5-15λ�����ֻ�����ĸ");
			String username = scan.next();
			if(username.matches(reg_username)){
				System.out.println("�û����Ϸ���");
				//�������� ����Ϸ�֮�������ֻ���
				while(true){
					//��ʾ��������
					System.out.println("���������룺8-16λ");
					String password = scan.next();
					//�ж�����
					if(password.matches(reg_password)){
						System.out.println("����Ϸ���");
						while(true){
							//��ʾ�����ֻ���
							System.out.println("�������ֻ��ţ�");
							String phone = scan.next();
							//�ж��ֻ���
							if(phone.matches(reg_phone)){
								System.out.println("�ֻ��źϷ���");
								System.out.println("ע��ɹ���");
								break t;//һ������������ѭ�� ��������
							}else{
								System.out.println("�ֻ��Ų��Ϸ������������룡");
							}
						}
					}else{
						System.out.println("���벻�Ϸ������������룡");
					}
				}
				
				
				
			}else{
				System.out.println("�û������Ϸ�,����������");
			}
		}
		
		
		
		
		

	}

}

package day03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1.Ҫ���û���������
 * ������ܺ������
 * 2.Ҫ���û�������ܵ�����
 * ������ܺ������
 * 
 * ���ܽ��ܹ���
 * ����ÿ���ַ��ı����5
 * 
 * @author Administrator
 *
 */
public class Test03 {
	//main Alt+? �س�
	public static void main(String[] args) {
		System.out.println("----��ӭ������ܽ���ϵͳ----");
		System.out.println("��ѡ���ܣ�1 ���� 2 ���� 0 �˳�");
		//���빤��
		Scanner scan = new Scanner(System.in);
		//ʹ�ù���
		int num = scan.nextInt();
		//����num���뵽��ͬ�Ĺ���
		switch(num){
		case 0:
			System.out.println("�˳���");
			break;
		case 1:
			System.out.println("----��ӭʹ�ü��ܹ���----");
			System.out.println("������������");
			//String�ַ���
			String name = scan.next();
			//���ַ������Ϊ�ַ�
			char[] names = name.toCharArray();
			//�ֱ�����������ÿһ���ַ�
			//�������
			for (int i = 0; i < names.length; i++) {
				//(char)(names[i]+5)
				//ȡ�������ÿһ���� �����5 Ȼ����ת��Ϊ�ַ�
				System.out.print((char)(names[i]+5));
			}
			break;
		case 2:
			System.out.println("----��ӭʹ�ý��ܹ���----");
			System.out.println("������������");
			//String�ַ���
			String name1 = scan.next();
			//���ַ������Ϊ�ַ�
			char[] names1 = name1.toCharArray();
			//�ֱ�����������ÿһ���ַ�
			//�������
			for (int i = 0; i < names1.length; i++) {
				//(char)(names[i]+5)
				//ȡ�������ÿһ���� �����5 Ȼ����ת��Ϊ�ַ�
				System.out.print((char)(names1[i]-5));
			}
			
			break;
		default:
			System.out.println("��������");
		}
	}

}








package day01;

import java.util.Scanner;

/**
 * �������û�������ݣ��ж��Ƿ�Ϊ����
 * @author shihongwei
 * 
 */
public class Test01 {
	//��ݷ�ʽ���ɳ�������  main Alt+? �س�
	public static void main(String[] args) {
		//ʵ���������̨���� 
		//Scanner��һ���û����빤�� JRE�ṩ��
		Scanner scan = new Scanner(System.in);
		System.out.println("��������ݣ�");
		//������������-���� int ��year����������
		int year = scan.nextInt();
		System.out.println("����������Ϊ��"+year);
		//�ж�
		if((year%400==0)||(year%4==0&&year%100!=0)){
			System.out.println("����������꣡");
		}else{
			System.out.println("����ݲ������꣡");
		}
		
		
	}
}

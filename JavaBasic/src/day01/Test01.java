package day01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args){
		//1.�û�����
		//��ϵͳ����Ĺ������뵽���뵱��
		Scanner scan = new Scanner(System.in);
		//while true��ʾ��ѭ��
		while(true){
			System.out.println("��������ݣ�");
			int year = scan.nextInt();//�����������������
			//2.�ж�
			if((year%400==0)||(year%4==0&&year%100!=0)){
				System.out.println("�����꣡");
			}else{
				System.out.println("�������꣡");
			}
		}
		
		
	}

}






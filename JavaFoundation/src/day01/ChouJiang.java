package day01;

import java.util.Scanner;

public class ChouJiang {

	public static void main(String[] args) {
		System.out.println("---��ӭ�����Ա�ճ齱ϵͳ---");
		//1.�������0-9֮������һ������
		int num = (int)(Math.random()*10);
		System.out.println(num);
		//2.Ҫ���û������Ա��
		Scanner scan = new Scanner(System.in);
		System.out.println("�������Ա�ţ�");
		int vip = scan.nextInt();
		//3.��ȡ��Ա�ŵ����һλ�͵����ڶ�λ
		int num1 = vip%10;
		int num2 = vip/10%10;
		
		//4.�жϽ�Ʒ
		if(num1==num&&num2==num){
			System.out.println("��������һ�䣡");
		}else{
			if(num1==num){
				System.out.println("������ֽһ����");
			}
			if(num2==num){
				System.out.println("����ϴ��Һһƿ��");
			}
		}
		
	}

}

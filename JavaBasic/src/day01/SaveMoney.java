package day01;

import java.util.Scanner;

public class SaveMoney {

	public static void main(String[] args) {
		System.out.println("��ӭʹ�ÿι������д洢ϵͳ");
		System.out.println("��ѡ��洢��ʽ 1 ���� 2���� 3�ͷ� 0 �˳�");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		switch(num){
		case 1:
			System.out.println("���ѽ��붨�ڴ�");
			System.out.println("�������");
			double money1 = scan.nextDouble();
			System.out.println("���������ޣ�");
			int year1 = scan.nextInt();
			for(int i=1;i<=year1;i++){
				money1 *= 1.005;
			}
			System.out.println("���Ϊ��"+money1);
			break;
		case 2:
			System.out.println("���ѽ�����ڴ�");
			System.out.println("�������");
			double money2 = scan.nextDouble();
			System.out.println("���������ޣ�");
			int year2 = scan.nextInt();
			for(int i=1;i<=year2;i++){
				money2 *= 1.003;
			}
			System.out.println("���Ϊ��"+money2);
			break;
		case 3:
			System.out.println("���пͷ���");
			break;
		case 0:
			System.out.println("�����˳���");
			break;
		default:
			System.out.println("�����������������룡");
		}
		
	}

}

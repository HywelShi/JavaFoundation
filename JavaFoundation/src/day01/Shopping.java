package day01;

import java.util.Scanner;

/**
 * ����3��ģ�ⳬ�н���ϵͳ
 * @author Administrator
 *
 */
public class Shopping {

	public static void main(String[] args) {
		System.out.println("---��ӭʹ�ó��й���ϵͳ---");
		System.out.println("��ѡ���ܣ�1 ���� 2 ��ѯ 0 �˳�");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		switch(num){
		case 1:
			System.out.println("---��ӭʹ�ý���ϵͳ---");
			//while��ʾѭ��()����
			//while(true){}��ʾ��ѭ�����᲻ͣ��ִ��
			while(true){
				//1�����뵥��price������amount ʵ��money
				//�����ܼ�total������change
				System.out.println("�����뵥�ۣ�");
				double price  = scan.nextDouble();
				System.out.println("������������");
				double amount  = scan.nextDouble();
				System.out.println("������ʵ����");
				double money  = scan.nextDouble();
				//2�������ܼ�
				double total = price*amount;
				//3����������
				double change = money-total;
				//4���ж������Ƿ�Ϊ����
				//Ϊ���� ����ʾ����Ҫ����Ǯ
				//��Ϊ���� ������ܼۺ�����
				if(change<0){
					System.out.println("����������Ҫ"+(-change));
				}else{
					System.out.println("�ܼ�Ϊ��"+total);
					System.out.println("����Ϊ��"+change);
				}
			}
		
		case 2:
			System.out.println("---��ӭʹ�ò�ѯϵͳ---");
			System.out.println("��������Ʒ��ţ�");
			int n = scan.nextInt();
			switch(n){
			case 1001:
				System.out.println("��ɳ��������15Ԫ�������ز���");
				break;
			case 1002:
				System.out.println("����ѪѼ��30Ԫ���óԲ���");
				break;
			}
			break;
		case 0:
			System.out.println("���˳�����ӭ�´�ʹ�ã�");
			break;
		default:
			System.out.println("�����������������룡");
			
		}
	}

}










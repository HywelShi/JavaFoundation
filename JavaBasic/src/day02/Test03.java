package day02;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		//��������·ݺ����� �����������ݵĵڼ���
		//1.����
		Scanner scan = new Scanner(System.in);
		System.out.println("�������һ����ݣ�");
		int year1 = scan.nextInt();
		System.out.println("�������һ���·ݣ�");
		int month1 = scan.nextInt();
		System.out.println("�������һ�����ڣ�");
		int date1 = scan.nextInt();
		int sum1 = tianshu(year1,month1,date1);
		
		System.out.println("������ڶ�����ݣ�");
		int year2 = scan.nextInt();
		System.out.println("������ڶ����·ݣ�");
		int month2 = scan.nextInt();
		System.out.println("������ڶ������ڣ�");
		int date2 = scan.nextInt();
		int sum2 = tianshu(year2,month2,date2);
		System.out.println("�����������"+(sum2-sum1)+"�죡");
	}
	//������������װ��һ������ 
	//��Ҫ��������·ݺ����� ����������
	public static int tianshu(
			int year,int month,int date){
		int sum = 0;
		int days = 0;
		//2.�����·�֮ǰ�ļ����·ݵ�����֮��
		for(int i=1;i<=(month-1);i++){
			//3.����i���ж��·ݵ�����
			switch(i){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days=31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days=30;
				break;
			case 2:
				//��������Ƿ�Ϊ������ȷ������
				if((year%400==0)||(year%4==0 && year%100!=0))
				{days=29;}else{days=28;}
				break;
			}
			//�����ۼ� �·�֮ǰ������
			sum += days;
		}
		System.out.println("��"+(sum+date)+"��");
		return sum+date;
	}
}









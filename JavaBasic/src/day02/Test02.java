package day02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		//��������·ݺ����� �����������ݵĵڼ���
		//1.����
		Scanner scan = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = scan.nextInt();
		System.out.println("�������·ݣ�");
		int month = scan.nextInt();
		System.out.println("���������ڣ�");
		int date = scan.nextInt();
		
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
	}
}







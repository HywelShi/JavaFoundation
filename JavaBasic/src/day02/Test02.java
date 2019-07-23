package day02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		//输入年份月份和日期 计算是这个年份的第几天
		//1.输入
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scan.nextInt();
		System.out.println("请输入月份：");
		int month = scan.nextInt();
		System.out.println("请输入日期：");
		int date = scan.nextInt();
		
		int sum = 0;
		int days = 0;
		//2.计算月份之前的几个月份的天数之和
		for(int i=1;i<=(month-1);i++){
			//3.根据i来判断月份的天数
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
				//根据年份是否为闰年来确定天数
				if((year%400==0)||(year%4==0 && year%100!=0))
				{days=29;}else{days=28;}
				break;
			}
			//天数累加 月份之前的天数
			sum += days;
		}
		System.out.println("第"+(sum+date)+"天");
	}
}







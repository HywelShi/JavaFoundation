package day01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args){
		//1.用户输入
		//将系统输入的工具引入到代码当中
		Scanner scan = new Scanner(System.in);
		//while true表示死循环
		while(true){
			System.out.println("请输入年份：");
			int year = scan.nextInt();//用来接收输入的整数
			//2.判断
			if((year%400==0)||(year%4==0&&year%100!=0)){
				System.out.println("是闰年！");
			}else{
				System.out.println("不是闰年！");
			}
		}
		
		
	}

}






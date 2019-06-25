package day01;

import java.util.Scanner;

public class ChouJiang {

	public static void main(String[] args) {
		System.out.println("---欢迎进入会员日抽奖系统---");
		//1.随机生成0-9之间任意一个数字
		int num = (int)(Math.random()*10);
		System.out.println(num);
		//2.要求用户输入会员号
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入会员号：");
		int vip = scan.nextInt();
		//3.获取会员号的最后一位和倒数第二位
		int num1 = vip%10;
		int num2 = vip/10%10;
		
		//4.判断奖品
		if(num1==num&&num2==num){
			System.out.println("奖励泡面一箱！");
		}else{
			if(num1==num){
				System.out.println("奖励抽纸一包！");
			}
			if(num2==num){
				System.out.println("奖励洗衣液一瓶！");
			}
		}
		
	}

}

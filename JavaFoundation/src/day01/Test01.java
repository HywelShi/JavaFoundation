package day01;

import java.util.Scanner;

/**
 * 案例：用户输入年份，判断是否为闰年
 * @author shihongwei
 * 
 */
public class Test01 {
	//快捷方式生成程序的入口  main Alt+? 回车
	public static void main(String[] args) {
		//实现用输控制台输入 
		//Scanner是一个用户输入工具 JRE提供的
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份：");
		//接收输入的年份-整数 int 用year变量存起来
		int year = scan.nextInt();
		System.out.println("你输入的年份为："+year);
		//判断
		if((year%400==0)||(year%4==0&&year%100!=0)){
			System.out.println("此年份是闰年！");
		}else{
			System.out.println("此年份不是闰年！");
		}
		
		
	}
}

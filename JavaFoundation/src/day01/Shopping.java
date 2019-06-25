package day01;

import java.util.Scanner;

/**
 * 案例3：模拟超市结账系统
 * @author Administrator
 *
 */
public class Shopping {

	public static void main(String[] args) {
		System.out.println("---欢迎使用超市购物系统---");
		System.out.println("请选择功能：1 结账 2 查询 0 退出");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		switch(num){
		case 1:
			System.out.println("---欢迎使用结账系统---");
			//while表示循环()条件
			//while(true){}表示死循环，会不停的执行
			while(true){
				//1、输入单价price和数量amount 实付money
				//计算总价total和找零change
				System.out.println("请输入单价：");
				double price  = scan.nextDouble();
				System.out.println("请输入数量：");
				double amount  = scan.nextDouble();
				System.out.println("请输入实付：");
				double money  = scan.nextDouble();
				//2、计算总价
				double total = price*amount;
				//3、计算找零
				double change = money-total;
				//4、判断找零是否为负数
				//为负数 则提示还需要多少钱
				//不为负数 则输出总价和找零
				if(change<0){
					System.out.println("不够，还需要"+(-change));
				}else{
					System.out.println("总价为："+total);
					System.out.println("找零为："+change);
				}
			}
		
		case 2:
			System.out.println("---欢迎使用查询系统---");
			System.out.println("请输入商品编号：");
			int n = scan.nextInt();
			switch(n){
			case 1001:
				System.out.println("长沙臭豆腐，15元，湖南特产！");
				break;
			case 1002:
				System.out.println("永州血鸭，30元，好吃不贵！");
				break;
			}
			break;
		case 0:
			System.out.println("已退出，欢迎下次使用！");
			break;
		default:
			System.out.println("输入有误，请重新输入！");
			
		}
	}

}










package day01;

import java.util.Scanner;

public class SaveMoney {

	public static void main(String[] args) {
		System.out.println("欢迎使用课工厂银行存储系统");
		System.out.println("请选择存储方式 1 定期 2活期 3客服 0 退出");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		switch(num){
		case 1:
			System.out.println("您已进入定期存款！");
			System.out.println("输入存款金额：");
			double money1 = scan.nextDouble();
			System.out.println("输入存款年限：");
			int year1 = scan.nextInt();
			for(int i=1;i<=year1;i++){
				money1 *= 1.005;
			}
			System.out.println("金额为："+money1);
			break;
		case 2:
			System.out.println("您已进入活期存款！");
			System.out.println("输入存款金额：");
			double money2 = scan.nextDouble();
			System.out.println("输入存款年限：");
			int year2 = scan.nextInt();
			for(int i=1;i<=year2;i++){
				money2 *= 1.003;
			}
			System.out.println("金额为："+money2);
			break;
		case 3:
			System.out.println("呼叫客服！");
			break;
		case 0:
			System.out.println("您已退出！");
			break;
		default:
			System.out.println("输入有误，请重新输入！");
		}
		
	}

}

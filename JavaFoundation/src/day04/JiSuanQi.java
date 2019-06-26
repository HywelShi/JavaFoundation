package day04;

import java.util.Scanner;

public class JiSuanQi {

	public static void main(String[] args) {
		System.out.println("欢迎使用计算器");
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("请输入：");
			double a = scan.nextDouble();
			String f = scan.next();
			double b = scan.nextDouble();
			System.out.println(a+f+b+"=?");
			switch(f){
			case "+":
				System.out.println(a+b);
				break;
			case "-":
				System.out.println(a-b);
				break;
			case "*":
				System.out.println(a*b);
				break;
			case "/":
				System.out.println(a/b);
				break;
			case "%":
				System.out.println(a%b);
				break;
			}
		}
		
		
	}

}

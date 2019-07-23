package day02;

import java.util.Scanner;

public class JSQ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double num1 = scan.nextDouble();
		String fuhao = scan.next();
		double num2 = scan.nextDouble();
		
		double result = jisuan(num1,num2,fuhao);
		System.out.println(result);

	}
	public static double jisuan(
			double a,double b,String fuhao){
		double result = 0;
		switch (fuhao) {
		case "+":
			result = a+b;
			break;
		case "-":
			result = a-b;
			break;
		case "*":
			result = a*b;
			break;
		case "/":
			result = a/b;
			break;
		default:
			System.out.println(" ‰»Î”–ŒÛ£°");
			break;
		}
		return result;
	}

}

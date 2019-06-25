package day02;

import java.util.Scanner;

public class MathMul {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = 0;
		while(true){
			//刚刚写的
			
			System.out.println("是否进行新的一轮？yes/no");
			String msg = scan.next();
			if("yes".equals(msg)){
				System.out.println("开始新的一轮！");
				score=0;
			}else{
				System.out.println("欢迎下次使用！");
				break;
			}

		}

	}

}

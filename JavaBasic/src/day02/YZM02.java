package day02;

import java.util.Scanner;

public class YZM02 {

	public static void main(String[] args) {
		//随机生成2-10个数字相加
		int num = (int)(Math.random()*9+2);
		int sum = 0;//表示默认的和为0
		//num控制生成的数量
		for(int i=1;i<=num;i++){
			//随机生成1-100的数字
			int word = (int)(Math.random()*100+1);
			//生成一个数字累加到sum上
			sum += word;//+=表示在sum上面累加
			//按照一行输出 前面的输出带+ 最后一个输出带=?
			if(i!=num){
				System.out.print(word+"+");
			}else{
				System.out.print(word+"=?");
			}
		}
		//验证对比
		System.out.println("\n请输入验证答案：");
		Scanner scan = new Scanner(System.in);
		int answer = scan.nextInt();
		if(answer==sum){
			System.out.println("验证成功！");
		}else{
			System.out.println("验证失败！");
		}
		
		
		

	}

}

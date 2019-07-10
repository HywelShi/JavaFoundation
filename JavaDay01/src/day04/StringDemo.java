package day04;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		/**
		 * equals与==的区别
		 * ==：比较指向
		 * equals:比较内容
		 * 
		 * 案例：循环出5到题，题目100以内的乘法
		 * 答题完毕之后算分数
		 * 答对加10分，答错扣5分 然后提示是否继续
		 * 输入yes 继续重新出题
		 * 输入no 结束
		 * 1.出题 
		 * 		5道题 两个数都要随机产生 范围0-99
		 * 2.答题
		 * 3.算分
		 * 4.判断是否继续 
		 * 
		 */
		//4.利用死循环反复出题 每次出五道 while(true){}
		//判断输入的是yes还是no 如果是no只有利用break结束循环
		while(true){
			Scanner scan = new Scanner(System.in);
			int score = 0;//定义分数默认为0
			//1.出题
			for(int i=1;i<=5;i++){
				int num1 = (int)(Math.random()*100);
				int num2 = (int)(Math.random()*100);
				System.out.println(num1+"*"+num2+"=?");
				//2.答题
				System.out.println("请作答：");
				int answer = scan.nextInt();
				//3.判断对错并且统分
				if(answer==num1*num2){
					System.out.println("答对了！加十分！");
					score += 10;
				}else{
					System.out.println("答错了！扣五分！");
					score -= 5;
				}
			}
			System.out.println("你的总分为："+score);
			//5.判断是否继续
			System.out.println("是否继续？yes/no");
			String str = scan.next();
			if(str.toLowerCase().equals("yes")){
				System.out.println("开始下一轮！");
			}else{
				System.out.println("已结束，欢迎下次使用！");
				break;//跳出死循环
			}
		}
		
		
		
		

	}

}

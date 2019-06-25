package day02;

import java.util.Scanner;

/**
 * 猜数字游戏
 * 1-100随机生成一个数字
 * 用户输入猜测
 * @author Administrator
 *
 */
public class GuessNumber {

	public static void main(String[] args) {
		//1.生成1-100之间随机的正确答案数
		int result = (int)(Math.random()*100+1);
		//System.out.println(result);
		//2.调用输入方法
		Scanner scan = new Scanner(System.in);
		int max = 100;
		int min = 1;
		while(true){
			//3.获取猜测的数字
			System.out.println(
					"请输入猜测的数字："+min+"~"+max);
			int guess = scan.nextInt();
			//4.判断并提示
			if(guess<result){
				System.out.println("猜小了！");
				min = guess;
				
			}else if(guess>result){
				System.out.println("猜大了！");
				max = guess;
			}else{
				System.out.println("猜对了！");
				System.out.println("是否继续？yes/no");
				//接收字符串
				String msg = scan.next();
				if("yes".equals(msg)){
					System.out.println("继续游戏！");
					//重置max min
					max = 100;
					min = 1;
					//重新生成一个随机数
					result = (int)(Math.random()*100+1);
				}else{
					System.out.println("欢迎下次使用！");
					break;
				}
			}
		}

	}

}











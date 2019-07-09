package day03;

import java.util.Scanner;

//将jRE提供的Scanner工具类引入到该程序当中

public class Typing {

	public static void main(String[] args) {
		//**扩展功能：选择关卡
		System.out.println("请选择难度：1-20个 2-40个 3-60个");
		Scanner scan = new Scanner(System.in);
		int dif = scan.nextInt();
		/**
		 * 先判断不是123提示有误
		 * 否则再去判断123其中一种
		 * 再去生成对应数量的字母
		 * 输入内容判断并且得出结果
		 */
		//1.产生一定数量的小写英文字母97-122
		int count = 0;
		if(dif!=1 && dif!=2 && dif!=3){
			System.out.println("有误！");
		}else{
			if(dif==1){
				count=20;
			}else if(dif==2){
				count=40;
			}else{
				count=60;
			}
			//利用定义数组来存放多个字母
			//数组的下标从0开始
			char[] words = new char[count];
			//循环 从0开始到数组的长度-1停止
			for (int i = 0; i < words.length; i++) {
				words[i] = (char)(Math.random()*26+97);
				System.out.print(words[i]);
			}
			//\n可以实现换行
			System.out.println("\n请输入：");
			//2.输入内容 在控制台输入内容
			//快捷键快速引入工具类 ctrl+shift+O
			
			//工具类使用
			//2.1获取输入的整数scan.nextInt();
			//2.2获取输入的小数scan.nextDouble();
			//2.3获取输入的字符串scan.next();
			String str = scan.next();
			// syso Alt+? 回车
			System.out.println(str);
			//3.对比
			//3.1 现将输入的字符串拆分为字符数组
			char[] result = str.toCharArray();
			//3.2 利用循环对比两个字符数组
			int num = 0;//用来计数 
			for (int i = 0; i < result.length; i++) {
				//比较同样位置 一旦相同则计数+1
				if(words[i] == result[i]){
					num++;
				}
			}
			//4.得出结果
			System.out.println("对了"+num
					+"个！"+"错了"+(count-num)+"个！");
		
		}
		
	}

}

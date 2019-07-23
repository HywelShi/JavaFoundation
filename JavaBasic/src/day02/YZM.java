package day02;

import java.util.Scanner;

public class YZM {

	public static void main(String[] args) {
		String yzm = "";//空字符串
		//随机生成四个1-3的随机数
		for(int i=1;i<=4;i++){
			int a = (int)(Math.random()*3+1);
			char c = createWord(a);
			yzm += c;
		}
		System.out.println(yzm);
		//验证对比
		System.out.println("请输入验证码：");
		Scanner scan = new Scanner(System.in);
		String answer = scan.next();
		if(answer.equals(yzm)){
			System.out.println("验证成功!");
		}else{
			System.out.println("验证失败！");
		}
	}
	//定义一个生成字母的方法
	public static char createWord(int a){
		char c = 0;
		switch(a){
		case 1:
			//生成数字
			c = (char)(Math.random()*10+48);
			break;
		case 2:
			//生成大写字母
			c = (char)(Math.random()*26+65);
			break;
		case 3:
			//生成小写字母
			c = (char)(Math.random()*26+97);
			break;
		}
		return c;
	}
	
	

}

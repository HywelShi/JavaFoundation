package day03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1.要求用户输入姓名
 * 输出加密后的姓名
 * 2.要求用户输入加密的姓名
 * 输出解密后的姓名
 * 
 * 加密解密规则：
 * 姓名每个字符的编码加5
 * 
 * @author Administrator
 *
 */
public class Test03 {
	//main Alt+? 回车
	public static void main(String[] args) {
		System.out.println("----欢迎进入加密解密系统----");
		System.out.println("请选择功能：1 加密 2 解密 0 退出");
		//输入工具
		Scanner scan = new Scanner(System.in);
		//使用工具
		int num = scan.nextInt();
		//根据num进入到不同的功能
		switch(num){
		case 0:
			System.out.println("退出！");
			break;
		case 1:
			System.out.println("----欢迎使用加密功能----");
			System.out.println("请输入姓名：");
			//String字符串
			String name = scan.next();
			//将字符串拆分为字符
			char[] names = name.toCharArray();
			//分别访问组里面的每一个字符
			//将其加密
			for (int i = 0; i < names.length; i++) {
				//(char)(names[i]+5)
				//取组里面的每一个字 编码加5 然后再转换为字符
				System.out.print((char)(names[i]+5));
			}
			break;
		case 2:
			System.out.println("----欢迎使用解密功能----");
			System.out.println("请输入姓名：");
			//String字符串
			String name1 = scan.next();
			//将字符串拆分为字符
			char[] names1 = name1.toCharArray();
			//分别访问组里面的每一个字符
			//将其加密
			for (int i = 0; i < names1.length; i++) {
				//(char)(names[i]+5)
				//取组里面的每一个字 编码加5 然后再转换为字符
				System.out.print((char)(names1[i]-5));
			}
			
			break;
		default:
			System.out.println("输入有误！");
		}
	}

}








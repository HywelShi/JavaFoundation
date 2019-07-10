package day04;

import java.util.Scanner;

public class StringDemo02 {
	public static void main(String[] args) {
		/**
		 * 屏蔽敏感字
		 * 1.准备一下敏感字
		 * 2.输入一句话
		 * 3.检查是否有敏感字 有的话替换成*
		 */
		String[] words = {"爸","妈","菜","猪","驴"};
		Scanner scan = new Scanner(System.in);
		System.out.println("你说：");
		String str = scan.next();
		for (int i = 0; i < words.length; i++) {
			str = str.replaceAll(words[i], "*");
		}
		System.out.println(str);
		
	}
}








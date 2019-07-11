package day05;

import java.util.Scanner;

/**
 * 数据在网络中传递的过程并不是绝对安全的
 * 一般情况下都需要进行加密处理
 * 常用的加密算法MD5 BASE64...
 * 
 * 自定义加密解密过程:
 * 加密规则：每个字符的编码加10
 * 解密规则：每个字符的编码减10
 * 
 * @author Administrator
 *
 */
public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入内容：");
		String str = scan.next();
		//转换成字符数组
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			//数组里面每个编码都加10
			int num = (int)(c[i])+10;
			//编码再转换为字符输出
			System.out.print((char)num);
		}
				

	}
	
	
	
	
	

}

package day03;

import java.math.BigInteger;

/**
 * 数据类型取值范围
 * @author Administrator
 *
 */
public class Test02 {
	public static void main(String[] args) {
		char a = '史';
		char b = '宏';
		char c = '伟';
		//syso Alt+? 回车
		System.out.println((int)a);
		System.out.println((int)b);
		System.out.println((int)c);
		
		//加密
		a = (char) (a+1);
		b = (char) (b+1);
		c = (char) (c+1);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		double aa = 10;
		int bb = (int) 10.5;
		System.out.println(bb);
		
		
		
	}
}









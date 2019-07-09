package day03;

import java.util.Arrays;
import java.util.Scanner;

public class RollName {

	public static void main(String[] args) {
		//1.建数组
		String[] names = new String[10];
		//2.引入Scanner
		Scanner scan = new Scanner(System.in);
		//3.循环录入 for Alt+?回车
		for (int i = 0; i < names.length; i++) {
			System.out.println("请输入姓名：");
			names[i] = scan.next();
		}
		System.out.println(Arrays.toString(names));
		//4.随机数0-9
		int num = (int)(Math.random()*10);
		//5.取名字
		System.out.println(names[num]);
	}

}

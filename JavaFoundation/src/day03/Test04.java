package day03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 循环录入5个人的姓名
 * 随机点名一个同学
 * @author Administrator
 *
 */
public class Test04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入班级人数：");
		int count = scan.nextInt();
		//1.定义一个数组来存放5个人的姓名
		String[] names = new String[count];
		//2.利用循环录入姓名
		//数组名.length 表示的是数组的长度
		for(int i = 0;i < names.length ;i++){
			System.out.println("请输入姓名：");
			String name = scan.next();
			names[i] = name;
		}
		System.out.println("录入完毕！");
		//3.输出数组 检测是否录入成功
		System.out.println(Arrays.toString(names));
		//4.随机点名 0-9
		//随机整数公式 a-b之间的随机数 a<b 且a和b都是整数
		//(int)(Math.random()*(b-a+1)+a)
		int num = (int)(Math.random()*names.length);
		System.out.println(names[num]);
		

	}

}






package day03;

import java.util.Scanner;

/**
 * 录入十个学生姓名和成绩
 * 输入姓名查询对应的成绩
 * @author Administrator
 *
 */
public class Test06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] names = new String[10];
		double[] scores = new double[10];
		System.out.println("开始录入：");
		//录入姓名和成绩
		for(int i=0;i<10;i++){
			System.out.println("请输入姓名：");
			String name = scan.next();
			System.out.println("请输入成绩：");
			double score = scan.nextDouble();
			names[i] = name;
			scores[i] = score;
		}
		//输入姓名查询成绩
		for(int i=0;i<10;i++){
			System.out.println("请输入查询的姓名：");
			String name = scan.next();
			//equals方法是用来比较字符串
			if(name.equals(names[i])){
			  System.out.println(scores[i]);
			  break;
			}
		}
		
	}
}

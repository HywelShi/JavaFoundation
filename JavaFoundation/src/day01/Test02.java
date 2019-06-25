package day01;

import java.util.Scanner;

/**
 *  用户输入成绩0-100分
	判断成绩的等级
	85分以上为A
	70-84为B
	60-69为C
	0-59为D
 * @author Administrator
 *
 */
public class Test02 {
	public static void main(String[] args) {
		//double 表示小数
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入成绩：");
		double score = scan.nextDouble();
		System.out.println("你的等级为：");
		if(score<0 || score>100){
			System.out.println("分数输入不合法，请重新输入！");
		}else if(score>=85){
			System.out.println("");
		}
	}
}








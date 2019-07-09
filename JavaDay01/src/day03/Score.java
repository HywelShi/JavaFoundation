package day03;

import java.util.Arrays;
import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		//1.定义数组存成绩
		double[] scores = new double[10];
		//2.录入成绩 引入录入工具
		Scanner scan = new Scanner(System.in);
		//3.for循环录入
		for (int i = 0; i < scores.length; i++) {
			//4.将获取的成绩存入到数组当中
			//scan.nextDouble()可以获取输入的成绩
			System.out.println("请录入：");
			double score = scan.nextDouble();
			scores[i] =score;
		}
		System.out.println("录入完毕！");
		//输出成绩数组
		System.out.println(Arrays.toString(scores));
		
		//5.求最大值和最小值
		//思路：假定第一个为最大值 分别跟后面比较
		//一旦前面比后面小 则最大值发生改变
		//求最小值同理
		double max = scores[0];
		double min = scores[0];
		double sum = 0;//表示总分
		for (int i = 0; i < scores.length; i++) {
			//将成绩总数组里面取出累加到sum上
			sum = sum + scores[i];
			if(max<scores[i]){
				max = scores[i];
			}
			if(min>scores[i]){
				min = scores[i];
			}
		}
		System.out.println("最高分为："+max);
		System.out.println("最低分为："+min);
		System.out.println("平均分为："+sum/10);
		
		
		
		
		
		
		
		
		//6.求平均值：所有的成绩累加一起除以人数
		
		
		
		
	}

}

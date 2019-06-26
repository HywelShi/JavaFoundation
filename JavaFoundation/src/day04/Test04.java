package day04;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 定义一个整数数组 数组里面随机放入 
 * 10个1-100之间的随机数
 * 输出其中的最大值
 * 
 * @author Administrator
 *
 */
public class Test04 {
	public static void main(String[] args) {
		double[] nums = new double[10];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < nums.length; i++) {
			System.out.println("请输入成绩：");
			double score = scan.nextDouble();
			nums[i] = score;
		}
		System.out.println(Arrays.toString(nums));
		double max = 0;
		double min = 101;
		int count = 0;//表示不及格计数
		int c = 0;//表示70-85分之间的计数
		for (int i = 0; i < nums.length; i++) {
			//判断最大值 
			if(nums[i]>max){
				max = nums[i];
			}
			//判断最小值
			if(nums[i]<min){
				min = nums[i];
			}
			if(nums[i]<60){
				count++;//表示低于60分累加1
			}
			if(nums[i]<85 && nums[i]>=70){
				c++;
			}
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println("不及格的人数为："+count);
		System.out.println("70-85的人数为："+c);
	}
}











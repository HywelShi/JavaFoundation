package day04;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ����һ���������� ��������������� 
 * 10��1-100֮��������
 * ������е����ֵ
 * 
 * @author Administrator
 *
 */
public class Test04 {
	public static void main(String[] args) {
		double[] nums = new double[10];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < nums.length; i++) {
			System.out.println("������ɼ���");
			double score = scan.nextDouble();
			nums[i] = score;
		}
		System.out.println(Arrays.toString(nums));
		double max = 0;
		double min = 101;
		int count = 0;//��ʾ���������
		int c = 0;//��ʾ70-85��֮��ļ���
		for (int i = 0; i < nums.length; i++) {
			//�ж����ֵ 
			if(nums[i]>max){
				max = nums[i];
			}
			//�ж���Сֵ
			if(nums[i]<min){
				min = nums[i];
			}
			if(nums[i]<60){
				count++;//��ʾ����60���ۼ�1
			}
			if(nums[i]<85 && nums[i]>=70){
				c++;
			}
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println("�����������Ϊ��"+count);
		System.out.println("70-85������Ϊ��"+c);
	}
}











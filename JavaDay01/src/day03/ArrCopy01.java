package day03;

import java.util.Arrays;

public class ArrCopy01 {

	public static void main(String[] args) {
		//数组复制方法1：将num1内容复制到num2中
		int[] num1 = {1,2,35,4,3,1,23,4};
		int[] num2 = new int[num1.length];
		for (int i = 0; i < num2.length; i++) {
			num2[i] = num1[i];
		}
		System.out.println(Arrays.toString(num2));
		
		//数组复制方法2：将num1内容复制到num3中
		int[] num3 = new int[num1.length];
		num3 = Arrays.copyOf(num1, num1.length);
		System.out.println(Arrays.toString(num3));
		
		//数组复制方法3：将num1内容复制到num4当中
		int[] num4 = new int[num1.length];
		System.arraycopy(num1, 0, num4, 0, num1.length);
		System.out.println(Arrays.toString(num4));
		
		int[] num5 = new int[num1.length];
		System.arraycopy(num1, 1, num5, 2, 3);
		System.out.println(Arrays.toString(num5));
		
	}

}

package day03;

import java.util.Arrays;

public class ArrCopy01 {

	public static void main(String[] args) {
		//���鸴�Ʒ���1����num1���ݸ��Ƶ�num2��
		int[] num1 = {1,2,35,4,3,1,23,4};
		int[] num2 = new int[num1.length];
		for (int i = 0; i < num2.length; i++) {
			num2[i] = num1[i];
		}
		System.out.println(Arrays.toString(num2));
		
		//���鸴�Ʒ���2����num1���ݸ��Ƶ�num3��
		int[] num3 = new int[num1.length];
		num3 = Arrays.copyOf(num1, num1.length);
		System.out.println(Arrays.toString(num3));
		
		//���鸴�Ʒ���3����num1���ݸ��Ƶ�num4����
		int[] num4 = new int[num1.length];
		System.arraycopy(num1, 0, num4, 0, num1.length);
		System.out.println(Arrays.toString(num4));
		
		int[] num5 = new int[num1.length];
		System.arraycopy(num1, 1, num5, 2, 3);
		System.out.println(Arrays.toString(num5));
		
	}

}

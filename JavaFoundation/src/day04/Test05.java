package day04;

import java.util.Arrays;

/**
 * �������������մӴ�С����
 * ��β����������ʵ������
 * @author Administrator
 *
 */
public class Test05 {
	public static void main(String[] args) {
		
		int[] nums = {15,10,5,2,23,45,62,11,12};
		//��������������ݴ�С��������
		Arrays.sort(nums);
		//�����������
		System.out.println(Arrays.toString(nums));
		//�Ӵ�С����
		//�����µ����� ���ȸ���С����������numsһ��
		int[] arr = new int[nums.length];
		//����ѭ����nums�������ǰ���η����µ���������
		for (int i = 0; i < nums.length; i++) {
			arr[i] = nums[nums.length-1-i];
		}
		System.out.println(Arrays.toString(arr));
		
	}
}

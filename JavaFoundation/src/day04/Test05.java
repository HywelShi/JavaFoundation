package day04;

import java.util.Arrays;

/**
 * 输入三个数按照从大到小排序
 * 首尾相连交换发实现排序
 * @author Administrator
 *
 */
public class Test05 {
	public static void main(String[] args) {
		
		int[] nums = {15,10,5,2,23,45,62,11,12};
		//将数组里面的数据从小到大排序
		Arrays.sort(nums);
		//输出数组内容
		System.out.println(Arrays.toString(nums));
		//从大到小排序
		//定义新的数组 长度跟从小到大排序后的nums一致
		int[] arr = new int[nums.length];
		//利用循环将nums从最后往前依次放入新的数组里面
		for (int i = 0; i < nums.length; i++) {
			arr[i] = nums[nums.length-1-i];
		}
		System.out.println(Arrays.toString(arr));
		
	}
}

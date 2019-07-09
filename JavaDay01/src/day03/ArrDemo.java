package day03;

import java.util.Arrays;

public class ArrDemo {
	public static void main(String[] args) {
		/**
		 * 查询数组中是否包含某一个元素
		 * int num = Arrays.binarySearch
		 * (查询的数组，查询的元素);
		      如果返回值num为负数则没有
                      返回值num为一个正数则为查询元素的下标
		 */
		String[] names = {"张三","李四","王五","赵六"};
		String a = "李四四";
		int num = Arrays.binarySearch(names, a);
		if(num<0){
			System.out.println("没有这个人！");
		}else{
			System.out.println("有这个人！");
		}
	}
}

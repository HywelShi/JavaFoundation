package day03;

import java.util.ArrayList;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//集合 JDK内容提供好的，不需要规定长度 
		//会根据存入的内容自动调整长度
		ArrayList<String> list = 
				new ArrayList<String>(); 
		/**
		 * 不停的输入字符串存入集合，当输入exit时退出
		 * 并且把集合中所有的内容输出来
		 */
		//控制台输入方法
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("请输入：");
			String str = scan.next();
			if(str.equals("exit")){
				System.out.println("已退出！");
				break;//停止
			}
			list.add(str);
		}
		//输出
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}












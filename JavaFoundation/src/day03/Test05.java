package day03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 程序启动 提示欢迎进入课工厂打字王
 * 请选择难度 1 2 3
 * 1：生成15个字母
 * 2：生成20个字母
 * 3：生成30个字母
 * 0：退出
 * 其他提示没有此难度
 * 字母随机生成
 * 用户输入字母
 * 提示对了多少个错了多少个
 * @author Administrator
 *
 */
public class Test05 {

	public static void main(String[] args) {
		//1.选择难度
		System.out.println("----课工厂打字王----");
		System.out.println("请选择难度 1 2 3 0退出");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0;//数组的长度
		switch(num){
		case 1:count = 15;break;
		case 2:count = 20;break;
		case 3:count = 30;break;
		case 0:System.out.println("退出！");break;
		default:System.out.println("输入有误！");break;
		}
		//2.生成对应难度数量的小写字母
		//小写字母 字符编码97-122 a-z
		char[] results = new char[count];
		//System.out.println(results.length);
		for (int i = 0; i < results.length; i++) {
			char c = (char)(Math.random()*26+97);
			System.out.print(c);
			//存入results数组
			results[i] = c;
		}
		
		//3.输入你的答案 \n可以实现换行效果
		System.out.println("\n请输入：");
		String str = scan.next();
		char[] strs = str.toCharArray();
		//System.out.println(Arrays.toString(strs));
		
		//4.对比 计算出对的数量和错的数量
		int a = 0;//表示对的数量
		for (int i = 0; i < strs.length; i++) {
			if(results[i] == strs[i]){
				a++;//相同位置正确了 计数加1
			}
		}
		System.out.println("对了"+a+"个！"
				+ "错了"+(count-a)+"个!");
		
	}

}








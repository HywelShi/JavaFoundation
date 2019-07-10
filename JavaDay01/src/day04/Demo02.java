package day04;

public class Demo02 {
	public static void main(String[] args) {
		String str = "Java是一门面向对象编程语言，"
				+ "不仅吸收了C++语言的各种优点，"
				+ "还摒弃了C++里难以理解的多继承、"
				+ "指针等概念，因此Java语言具有功能强大和简单易用两个特征。"
				+ "Java语言作为静态面向对象编程语言的代表，"
				+ "极好地实现了面向对象理论，"
				+ "允许程序员以优雅的思维方式进行复杂的编程";
		String str_new = str.replaceAll("的", "");
		int l = str.length()-str_new.length();
		System.out.println(l/"的".length());
		/**
		 * 1.现将Java全部替换为空字符串""
		 * 2.计算替换前的长度减去替换后的长度
		 *  字符串.length();获取字符串长度
		 * 3.得到的是缩短的长度 除以Java的长度
		 */
	
	
	}
	
}

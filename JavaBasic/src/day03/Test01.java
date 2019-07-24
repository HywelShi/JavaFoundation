package day03;

public class Test01 {
	public static void main(String[] args) {
		//将十进制转换为二进制
		System.out.println
		(Integer.toBinaryString(10110111));
		//将十进制转换为八进制
		System.out.println
		(Integer.toOctalString(758977));
		//将十进制转换为十六进制
		System.out.println
		(Integer.toHexString(16170));
		
		//Integer.toString(十进制的数,进制);
		//将十进制的数转换为任意进制
		System.out.println(Integer.toString(16170,16));
		
		
	}
	
	
	
}

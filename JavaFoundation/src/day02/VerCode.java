package day02;

/**
 * 随机生成一个4位验证码 
 * 要求由数字大写英文字母小写英文字母组成
 * 
 * @author Administrator
 *
 */
public class VerCode {

	public static void main(String[] args) {
		//生成四位随机字符组成验证码
		for(int i=1;i<=8;i++){
			int num = (int)(Math.random()*3+1);
			create(num);
		}
	}
	//生成字符的方法
	public static void create(int num){
		char c = 0;//默认是空字符
		switch(num){
		case 1://生成数字
			c = (char)(Math.random()*10+48);
			System.out.print(c);
			break;
		case 2://生成大写字母
			c = (char)(Math.random()*26+65);
			System.out.print(c);
			break;
		case 3://生成小写字母
			c = (char)(Math.random()*26+97);
			System.out.print(c);
			break;
		}
	}
	
	

}








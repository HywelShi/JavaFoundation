package day02;
/**
 * 计算1+2+3+4+...+100的和
 * @author Administrator
 *
 */
public class WhileDemo01 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;//起始值
		while(i<=100){//结束条件
			sum = sum +i;//和累加
			i++;//自身基础上加一
		}
		System.out.println(sum);
		
		int sum2 = 0;
		int i2 = 1;
		do{
			sum2 = sum2+i2;
			i2++;
		}while(i2<=100);
		System.out.println(sum2);
	}
}









package day03;
/**
 * 1.计算1-100之间除了能被3整除的数之和
 * 2.计算1-100之间排除3的倍数 包含3的数字之和
 * 3.练习：计算1-1000之间除去尾数为5和百位为2的之和
 * @author Administrator
 * 
 */
public class Test01 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=100;i++){
			if(i%3==0 || i%10==3 || i/10==3){
				//跳过
				continue;
			}
			sum += i ;
		}
		System.out.println(sum);
	}
}










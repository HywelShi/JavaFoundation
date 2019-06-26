package day04;
/**
 * 1 2 3 4 5
 * 组成一个四位数 要求四位互相都不相同
 * 输出结果
 * i j m n &&
 * @author Administrator
 *
 */
public class Test03 {
	public static void main(String[] args) {
		//四层循环
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				for (int m = 1; m <= 5; m++) {
					for (int n = 1; n <= 5; n++) {
						if(i!=j&&i!=m&&i!=n&&j!=m&&j!=n&&m!=n){
							System.out.println(1000*i+100*j+10*m+n);
						}
					}
				}
			}
		}
		
	}
}

package day04;
/**
 * 	百元买百鸡问题：
	有100块钱
	公鸡5块钱一只
	母鸡3块钱一只
	小鸡1块钱三只
	请问：
	100块钱买100只鸡有哪些搭配方式？
 * @author Administrator
 *
 */
public class Test02 {
	public static void main(String[] args) {
		for(int i=0;i<=20;i++){
			for(int j=0;j<=33;j++){
				for(int k=0;k<=300;k++){
					if((i+j+k==100)&&(5*i+3*j+k/3==100)
							&&(k%3==0)){
						System.out.println(
								"公鸡："+i+"只，母鸡："+j
								+"只，小鸡"+k+"只");
					}
				}
			}
		}
	}
}







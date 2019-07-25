package day04;

public class Test01 {

	public static void main(String[] args) {
		//开关 标记法：
		// 求2-100之间所有的素数
		for(int num=2;num<=100;num++){
			int a = 1;
			//相除除到开平方的数即可  可以减少时间复杂度
			for(int i=2;i<=Math.sqrt(num);i++){
				if(num%i==0){
					a = 2;
				}
			}
			if(a==1){
				System.out.println(num);
				System.out.println("是质数！");
			}else{
				System.out.println(num);
				System.out.println("不是质数！");
			}
		}
		

	}

}

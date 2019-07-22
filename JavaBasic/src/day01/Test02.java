package day01;

public class Test02 {

	public static void main(String[] args) {
		// 计算1/2-2/3+3/4-4/5+...+9/10
		double sum = 0;//定义和默认为0
		for (int i = 1; i <= 9; i++) {
			if(i%2==0){
				sum -= i*1.0/(i+1);//-=表示自身基础上累减 
			}else{
				sum += i*1.0/(i+1);//+=表示自身基础上累加 
			} 
		}
		System.out.println(sum);
	}

}

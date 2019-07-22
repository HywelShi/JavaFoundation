package day01;

public class Test04 {

	public static void main(String[] args) {
		
		//i表示兔子 0-35种可能
		for (int i = 0; i <= 40; i++) {
			if(4*i+(40-i)*2==100){
				System.out.println("兔子:"+i);
				System.out.println("鸡："+(40-i));
			}
		}

	}

}

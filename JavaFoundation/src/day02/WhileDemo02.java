package day02;
/**
 * ��ϰ����1+3+5+7+...
 * �ӵ��������ͻᳬ��1000��
 */

public class WhileDemo02 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(true){
			sum += i;
			i += 2;
			System.out.println(sum);
			if(sum>=1000){
				System.out.println((i+1)/2-1);
				break;
			}
		}

	}

}

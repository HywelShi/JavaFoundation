package day02;
/**
 * ����1+2+3+4+...+100�ĺ�
 * @author Administrator
 *
 */
public class WhileDemo01 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;//��ʼֵ
		while(i<=100){//��������
			sum = sum +i;//���ۼ�
			i++;//��������ϼ�һ
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









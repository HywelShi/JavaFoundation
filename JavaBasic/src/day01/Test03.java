package day01;

public class Test03 {
	public static void main(String[] args) {
		//1��1/3+3/5+5/7+....���ʼӵ�������������10
		//2.1/2+2/3-3/4+4/5+5/6-6/7+7/8...
		//��������������10

		double sum = 0;
		double i=1;
		int count = 0;//��ʾ����
		while(true){
			if(sum>=10){
				System.out.println("����Ϊ��"+count);
				break;//ֹͣѭ��
			}
			if(i%3==0){
				sum -= i/(i+2);
			}else{
				sum += i/(i+2);
			}
			i++;
			count++;//��ʾ�ۼ�1
			System.out.println(sum);
		}
	}
}

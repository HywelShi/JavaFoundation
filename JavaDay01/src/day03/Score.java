package day03;

import java.util.Arrays;
import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		//1.���������ɼ�
		double[] scores = new double[10];
		//2.¼��ɼ� ����¼�빤��
		Scanner scan = new Scanner(System.in);
		//3.forѭ��¼��
		for (int i = 0; i < scores.length; i++) {
			//4.����ȡ�ĳɼ����뵽���鵱��
			//scan.nextDouble()���Ի�ȡ����ĳɼ�
			System.out.println("��¼�룺");
			double score = scan.nextDouble();
			scores[i] =score;
		}
		System.out.println("¼����ϣ�");
		//����ɼ�����
		System.out.println(Arrays.toString(scores));
		
		//5.�����ֵ����Сֵ
		//˼·���ٶ���һ��Ϊ���ֵ �ֱ������Ƚ�
		//һ��ǰ��Ⱥ���С �����ֵ�����ı�
		//����Сֵͬ��
		double max = scores[0];
		double min = scores[0];
		double sum = 0;//��ʾ�ܷ�
		for (int i = 0; i < scores.length; i++) {
			//���ɼ�����������ȡ���ۼӵ�sum��
			sum = sum + scores[i];
			if(max<scores[i]){
				max = scores[i];
			}
			if(min>scores[i]){
				min = scores[i];
			}
		}
		System.out.println("��߷�Ϊ��"+max);
		System.out.println("��ͷ�Ϊ��"+min);
		System.out.println("ƽ����Ϊ��"+sum/10);
		
		
		
		
		
		
		
		
		//6.��ƽ��ֵ�����еĳɼ��ۼ�һ���������
		
		
		
		
	}

}

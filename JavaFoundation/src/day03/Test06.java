package day03;

import java.util.Scanner;

/**
 * ¼��ʮ��ѧ�������ͳɼ�
 * ����������ѯ��Ӧ�ĳɼ�
 * @author Administrator
 *
 */
public class Test06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] names = new String[10];
		double[] scores = new double[10];
		System.out.println("��ʼ¼�룺");
		//¼�������ͳɼ�
		for(int i=0;i<10;i++){
			System.out.println("������������");
			String name = scan.next();
			System.out.println("������ɼ���");
			double score = scan.nextDouble();
			names[i] = name;
			scores[i] = score;
		}
		//����������ѯ�ɼ�
		for(int i=0;i<10;i++){
			System.out.println("�������ѯ��������");
			String name = scan.next();
			//equals�����������Ƚ��ַ���
			if(name.equals(names[i])){
			  System.out.println(scores[i]);
			  break;
			}
		}
		
	}
}

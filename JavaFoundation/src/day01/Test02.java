package day01;

import java.util.Scanner;

/**
 *  �û�����ɼ�0-100��
	�жϳɼ��ĵȼ�
	85������ΪA
	70-84ΪB
	60-69ΪC
	0-59ΪD
 * @author Administrator
 *
 */
public class Test02 {
	public static void main(String[] args) {
		//double ��ʾС��
		Scanner scan = new Scanner(System.in);
		System.out.println("������ɼ���");
		double score = scan.nextDouble();
		System.out.println("��ĵȼ�Ϊ��");
		if(score<0 || score>100){
			System.out.println("�������벻�Ϸ������������룡");
		}else if(score>=85){
			System.out.println("");
		}
	}
}








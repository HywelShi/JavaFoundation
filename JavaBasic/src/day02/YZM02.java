package day02;

import java.util.Scanner;

public class YZM02 {

	public static void main(String[] args) {
		//�������2-10���������
		int num = (int)(Math.random()*9+2);
		int sum = 0;//��ʾĬ�ϵĺ�Ϊ0
		//num�������ɵ�����
		for(int i=1;i<=num;i++){
			//�������1-100������
			int word = (int)(Math.random()*100+1);
			//����һ�������ۼӵ�sum��
			sum += word;//+=��ʾ��sum�����ۼ�
			//����һ����� ǰ��������+ ���һ�������=?
			if(i!=num){
				System.out.print(word+"+");
			}else{
				System.out.print(word+"=?");
			}
		}
		//��֤�Ա�
		System.out.println("\n��������֤�𰸣�");
		Scanner scan = new Scanner(System.in);
		int answer = scan.nextInt();
		if(answer==sum){
			System.out.println("��֤�ɹ���");
		}else{
			System.out.println("��֤ʧ�ܣ�");
		}
		
		
		

	}

}

package day04;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		/**
		 * equals��==������
		 * ==���Ƚ�ָ��
		 * equals:�Ƚ�����
		 * 
		 * ������ѭ����5���⣬��Ŀ100���ڵĳ˷�
		 * �������֮�������
		 * ��Լ�10�֣�����5�� Ȼ����ʾ�Ƿ����
		 * ����yes �������³���
		 * ����no ����
		 * 1.���� 
		 * 		5���� ��������Ҫ������� ��Χ0-99
		 * 2.����
		 * 3.���
		 * 4.�ж��Ƿ���� 
		 * 
		 */
		//4.������ѭ���������� ÿ�γ���� while(true){}
		//�ж��������yes����no �����noֻ������break����ѭ��
		while(true){
			Scanner scan = new Scanner(System.in);
			int score = 0;//�������Ĭ��Ϊ0
			//1.����
			for(int i=1;i<=5;i++){
				int num1 = (int)(Math.random()*100);
				int num2 = (int)(Math.random()*100);
				System.out.println(num1+"*"+num2+"=?");
				//2.����
				System.out.println("������");
				int answer = scan.nextInt();
				//3.�ж϶Դ���ͳ��
				if(answer==num1*num2){
					System.out.println("����ˣ���ʮ�֣�");
					score += 10;
				}else{
					System.out.println("����ˣ�����֣�");
					score -= 5;
				}
			}
			System.out.println("����ܷ�Ϊ��"+score);
			//5.�ж��Ƿ����
			System.out.println("�Ƿ������yes/no");
			String str = scan.next();
			if(str.toLowerCase().equals("yes")){
				System.out.println("��ʼ��һ�֣�");
			}else{
				System.out.println("�ѽ�������ӭ�´�ʹ�ã�");
				break;//������ѭ��
			}
		}
		
		
		
		

	}

}

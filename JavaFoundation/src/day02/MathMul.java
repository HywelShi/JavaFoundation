package day02;

import java.util.Scanner;

public class MathMul {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = 0;
		while(true){
			//�ո�д��
			
			System.out.println("�Ƿ�����µ�һ�֣�yes/no");
			String msg = scan.next();
			if("yes".equals(msg)){
				System.out.println("��ʼ�µ�һ�֣�");
				score=0;
			}else{
				System.out.println("��ӭ�´�ʹ�ã�");
				break;
			}

		}

	}

}

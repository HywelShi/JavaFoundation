package day02;

import java.util.Scanner;

/**
 * ��������Ϸ
 * 1-100�������һ������
 * �û�����²�
 * @author Administrator
 *
 */
public class GuessNumber {

	public static void main(String[] args) {
		//1.����1-100֮���������ȷ����
		int result = (int)(Math.random()*100+1);
		//System.out.println(result);
		//2.�������뷽��
		Scanner scan = new Scanner(System.in);
		int max = 100;
		int min = 1;
		while(true){
			//3.��ȡ�²������
			System.out.println(
					"������²�����֣�"+min+"~"+max);
			int guess = scan.nextInt();
			//4.�жϲ���ʾ
			if(guess<result){
				System.out.println("��С�ˣ�");
				min = guess;
				
			}else if(guess>result){
				System.out.println("�´��ˣ�");
				max = guess;
			}else{
				System.out.println("�¶��ˣ�");
				System.out.println("�Ƿ������yes/no");
				//�����ַ���
				String msg = scan.next();
				if("yes".equals(msg)){
					System.out.println("������Ϸ��");
					//����max min
					max = 100;
					min = 1;
					//��������һ�������
					result = (int)(Math.random()*100+1);
				}else{
					System.out.println("��ӭ�´�ʹ�ã�");
					break;
				}
			}
		}

	}

}











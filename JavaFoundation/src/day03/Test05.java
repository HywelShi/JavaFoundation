package day03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * �������� ��ʾ��ӭ����ι���������
 * ��ѡ���Ѷ� 1 2 3
 * 1������15����ĸ
 * 2������20����ĸ
 * 3������30����ĸ
 * 0���˳�
 * ������ʾû�д��Ѷ�
 * ��ĸ�������
 * �û�������ĸ
 * ��ʾ���˶��ٸ����˶��ٸ�
 * @author Administrator
 *
 */
public class Test05 {

	public static void main(String[] args) {
		//1.ѡ���Ѷ�
		System.out.println("----�ι���������----");
		System.out.println("��ѡ���Ѷ� 1 2 3 0�˳�");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0;//����ĳ���
		switch(num){
		case 1:count = 15;break;
		case 2:count = 20;break;
		case 3:count = 30;break;
		case 0:System.out.println("�˳���");break;
		default:System.out.println("��������");break;
		}
		//2.���ɶ�Ӧ�Ѷ�������Сд��ĸ
		//Сд��ĸ �ַ�����97-122 a-z
		char[] results = new char[count];
		//System.out.println(results.length);
		for (int i = 0; i < results.length; i++) {
			char c = (char)(Math.random()*26+97);
			System.out.print(c);
			//����results����
			results[i] = c;
		}
		
		//3.������Ĵ� \n����ʵ�ֻ���Ч��
		System.out.println("\n�����룺");
		String str = scan.next();
		char[] strs = str.toCharArray();
		//System.out.println(Arrays.toString(strs));
		
		//4.�Ա� ������Ե������ʹ������
		int a = 0;//��ʾ�Ե�����
		for (int i = 0; i < strs.length; i++) {
			if(results[i] == strs[i]){
				a++;//��ͬλ����ȷ�� ������1
			}
		}
		System.out.println("����"+a+"����"
				+ "����"+(count-a)+"��!");
		
	}

}








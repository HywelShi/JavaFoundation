package day03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ѭ��¼��5���˵�����
 * �������һ��ͬѧ
 * @author Administrator
 *
 */
public class Test04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������༶������");
		int count = scan.nextInt();
		//1.����һ�����������5���˵�����
		String[] names = new String[count];
		//2.����ѭ��¼������
		//������.length ��ʾ��������ĳ���
		for(int i = 0;i < names.length ;i++){
			System.out.println("������������");
			String name = scan.next();
			names[i] = name;
		}
		System.out.println("¼����ϣ�");
		//3.������� ����Ƿ�¼��ɹ�
		System.out.println(Arrays.toString(names));
		//4.������� 0-9
		//���������ʽ a-b֮�������� a<b ��a��b��������
		//(int)(Math.random()*(b-a+1)+a)
		int num = (int)(Math.random()*names.length);
		System.out.println(names[num]);
		

	}

}






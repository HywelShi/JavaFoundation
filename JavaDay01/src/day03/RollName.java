package day03;

import java.util.Arrays;
import java.util.Scanner;

public class RollName {

	public static void main(String[] args) {
		//1.������
		String[] names = new String[10];
		//2.����Scanner
		Scanner scan = new Scanner(System.in);
		//3.ѭ��¼�� for Alt+?�س�
		for (int i = 0; i < names.length; i++) {
			System.out.println("������������");
			names[i] = scan.next();
		}
		System.out.println(Arrays.toString(names));
		//4.�����0-9
		int num = (int)(Math.random()*10);
		//5.ȡ����
		System.out.println(names[num]);
	}

}

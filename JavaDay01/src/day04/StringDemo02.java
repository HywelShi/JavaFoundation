package day04;

import java.util.Scanner;

public class StringDemo02 {
	public static void main(String[] args) {
		/**
		 * ����������
		 * 1.׼��һ��������
		 * 2.����һ�仰
		 * 3.����Ƿ��������� �еĻ��滻��*
		 */
		String[] words = {"��","��","��","��","¿"};
		Scanner scan = new Scanner(System.in);
		System.out.println("��˵��");
		String str = scan.next();
		for (int i = 0; i < words.length; i++) {
			str = str.replaceAll(words[i], "*");
		}
		System.out.println(str);
		
	}
}








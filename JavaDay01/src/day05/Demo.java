package day05;

import java.util.Scanner;

/**
 * �����������д��ݵĹ��̲����Ǿ��԰�ȫ��
 * һ������¶���Ҫ���м��ܴ���
 * ���õļ����㷨MD5 BASE64...
 * 
 * �Զ�����ܽ��ܹ���:
 * ���ܹ���ÿ���ַ��ı����10
 * ���ܹ���ÿ���ַ��ı����10
 * 
 * @author Administrator
 *
 */
public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���������ݣ�");
		String str = scan.next();
		//ת�����ַ�����
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			//��������ÿ�����붼��10
			int num = (int)(c[i])+10;
			//������ת��Ϊ�ַ����
			System.out.print((char)num);
		}
				

	}
	
	
	
	
	

}

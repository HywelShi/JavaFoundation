package day02;

import java.util.Scanner;

public class YZM {

	public static void main(String[] args) {
		String yzm = "";//���ַ���
		//��������ĸ�1-3�������
		for(int i=1;i<=4;i++){
			int a = (int)(Math.random()*3+1);
			char c = createWord(a);
			yzm += c;
		}
		System.out.println(yzm);
		//��֤�Ա�
		System.out.println("��������֤�룺");
		Scanner scan = new Scanner(System.in);
		String answer = scan.next();
		if(answer.equals(yzm)){
			System.out.println("��֤�ɹ�!");
		}else{
			System.out.println("��֤ʧ�ܣ�");
		}
	}
	//����һ��������ĸ�ķ���
	public static char createWord(int a){
		char c = 0;
		switch(a){
		case 1:
			//��������
			c = (char)(Math.random()*10+48);
			break;
		case 2:
			//���ɴ�д��ĸ
			c = (char)(Math.random()*26+65);
			break;
		case 3:
			//����Сд��ĸ
			c = (char)(Math.random()*26+97);
			break;
		}
		return c;
	}
	
	

}

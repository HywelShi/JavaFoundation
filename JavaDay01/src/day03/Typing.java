package day03;

import java.util.Scanner;

//��jRE�ṩ��Scanner���������뵽�ó�����

public class Typing {

	public static void main(String[] args) {
		//**��չ���ܣ�ѡ��ؿ�
		System.out.println("��ѡ���Ѷȣ�1-20�� 2-40�� 3-60��");
		Scanner scan = new Scanner(System.in);
		int dif = scan.nextInt();
		/**
		 * ���жϲ���123��ʾ����
		 * ������ȥ�ж�123����һ��
		 * ��ȥ���ɶ�Ӧ��������ĸ
		 * ���������жϲ��ҵó����
		 */
		//1.����һ��������СдӢ����ĸ97-122
		int count = 0;
		if(dif!=1 && dif!=2 && dif!=3){
			System.out.println("����");
		}else{
			if(dif==1){
				count=20;
			}else if(dif==2){
				count=40;
			}else{
				count=60;
			}
			//���ö�����������Ŷ����ĸ
			//������±��0��ʼ
			char[] words = new char[count];
			//ѭ�� ��0��ʼ������ĳ���-1ֹͣ
			for (int i = 0; i < words.length; i++) {
				words[i] = (char)(Math.random()*26+97);
				System.out.print(words[i]);
			}
			//\n����ʵ�ֻ���
			System.out.println("\n�����룺");
			//2.�������� �ڿ���̨��������
			//��ݼ��������빤���� ctrl+shift+O
			
			//������ʹ��
			//2.1��ȡ���������scan.nextInt();
			//2.2��ȡ�����С��scan.nextDouble();
			//2.3��ȡ������ַ���scan.next();
			String str = scan.next();
			// syso Alt+? �س�
			System.out.println(str);
			//3.�Ա�
			//3.1 �ֽ�������ַ������Ϊ�ַ�����
			char[] result = str.toCharArray();
			//3.2 ����ѭ���Ա������ַ�����
			int num = 0;//�������� 
			for (int i = 0; i < result.length; i++) {
				//�Ƚ�ͬ��λ�� һ����ͬ�����+1
				if(words[i] == result[i]){
					num++;
				}
			}
			//4.�ó����
			System.out.println("����"+num
					+"����"+"����"+(count-num)+"����");
		
		}
		
	}

}

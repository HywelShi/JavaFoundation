package day03;

import java.util.ArrayList;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//���� JDK�����ṩ�õģ�����Ҫ�涨���� 
		//����ݴ���������Զ���������
		ArrayList<String> list = 
				new ArrayList<String>(); 
		/**
		 * ��ͣ�������ַ������뼯�ϣ�������exitʱ�˳�
		 * ���ҰѼ��������е����������
		 */
		//����̨���뷽��
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("�����룺");
			String str = scan.next();
			if(str.equals("exit")){
				System.out.println("���˳���");
				break;//ֹͣ
			}
			list.add(str);
		}
		//���
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}












package day03;

import java.util.Arrays;

public class ArrDemo {
	public static void main(String[] args) {
		/**
		 * ��ѯ�������Ƿ����ĳһ��Ԫ��
		 * int num = Arrays.binarySearch
		 * (��ѯ�����飬��ѯ��Ԫ��);
		      �������ֵnumΪ������û��
                      ����ֵnumΪһ��������Ϊ��ѯԪ�ص��±�
		 */
		String[] names = {"����","����","����","����"};
		String a = "������";
		int num = Arrays.binarySearch(names, a);
		if(num<0){
			System.out.println("û������ˣ�");
		}else{
			System.out.println("������ˣ�");
		}
	}
}

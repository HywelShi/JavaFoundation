package day04;

public class Demo02 {
	public static void main(String[] args) {
		String str = "Java��һ��������������ԣ�"
				+ "����������C++���Եĸ����ŵ㣬"
				+ "��������C++���������Ķ�̳С�"
				+ "ָ��ȸ�����Java���Ծ��й���ǿ��ͼ���������������"
				+ "Java������Ϊ��̬������������ԵĴ���"
				+ "���õ�ʵ��������������ۣ�"
				+ "�������Ա�����ŵ�˼ά��ʽ���и��ӵı��";
		String str_new = str.replaceAll("��", "");
		int l = str.length()-str_new.length();
		System.out.println(l/"��".length());
		/**
		 * 1.�ֽ�Javaȫ���滻Ϊ���ַ���""
		 * 2.�����滻ǰ�ĳ��ȼ�ȥ�滻��ĳ���
		 *  �ַ���.length();��ȡ�ַ�������
		 * 3.�õ��������̵ĳ��� ����Java�ĳ���
		 */
	
	
	}
	
}

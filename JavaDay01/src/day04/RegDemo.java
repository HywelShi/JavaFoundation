package day04;

public class RegDemo {

	public static void main(String[] args) {
		//1.�ƶ���������ƥ�����
		String reg = "^(?![\\d]+$)(?![a-zA-Z]+$)[\\w]{6,18}$";
		String str = "admin12admin21";
		//2.����mathces������ƥ�����
		if(str.matches(reg)){
			System.out.println("���Ϲ���");
		}else{
			System.out.println("�����Ϲ���");
		}

	}

}

package day04;

public class RegDemo {

	public static void main(String[] args) {
		//1.制定规则数字匹配规则
		String reg = "^(?![\\d]+$)(?![a-zA-Z]+$)[\\w]{6,18}$";
		String str = "admin12admin21";
		//2.利用mathces方法来匹配规则
		if(str.matches(reg)){
			System.out.println("符合规则！");
		}else{
			System.out.println("不符合规则！");
		}

	}

}

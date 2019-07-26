package day05;

public class Test {

	public static void main(String[] args) {
		String msg = "长沙最近高温，注意避暑！";
		String str = "";
		for (int i = 0; i < msg.length(); i++) {
			str += msg.charAt(i);
			System.out.println(str);
		}
	}

}

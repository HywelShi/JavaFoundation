package day03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListDemo {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("������������");
			String name = scan.next();
			if("exit".equals(name)){
				System.out.println("������ϣ�");
				break;
			}
			names.add(name);
		}
		System.out.println(names);
		
		
	}
}

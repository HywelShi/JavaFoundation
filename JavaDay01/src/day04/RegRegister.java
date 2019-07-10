package day04;

import java.util.Scanner;

public class RegRegister {

	public static void main(String[] args) {
		/**
		 * 程序启动
		 * 要求用输输入用户名 验证 
		 * 如果验证失败则重新输入
		 * 验证成功则输入密码
		 * 接着输入手机号
		 * 三个全验证成功提示注册成功
		 */
		//制定规则：
		//用户名5-15位的数字或者字母
		String reg_username = "^[\\w]{5,15}$";
		//密码6-18位数字和字母的组合
		String reg_password = "^(?![\\d]+$)(?![a-zA-Z]+$)[\\w]{6,18}$";
		String reg_phone = "^1[3|4|5|7|8|9][0-9]{9}$";
		Scanner scan = new Scanner(System.in);
		t://标记 用来跳出循环
		while(true){
			System.out.println("请输入用户名："
					+ "5-15位的数字或者字母");
			String username = scan.next();
			if(username.matches(reg_username)){
				System.out.println("用户名合法！");
				//输入密码 密码合法之后输入手机号
				while(true){
					//提示输入密码
					System.out.println("请输入密码：8-16位");
					String password = scan.next();
					//判断密码
					if(password.matches(reg_password)){
						System.out.println("密码合法！");
						while(true){
							//提示输入手机号
							System.out.println("请输入手机号：");
							String phone = scan.next();
							//判断手机号
							if(phone.matches(reg_phone)){
								System.out.println("手机号合法！");
								System.out.println("注册成功！");
								break t;//一次性跳出三层循环 结束程序
							}else{
								System.out.println("手机号不合法，请重新输入！");
							}
						}
					}else{
						System.out.println("密码不合法，请重新输入！");
					}
				}
				
				
				
			}else{
				System.out.println("用户名不合法,请重新输入");
			}
		}
		
		
		
		
		

	}

}

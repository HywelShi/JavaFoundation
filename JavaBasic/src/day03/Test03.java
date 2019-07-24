package day03;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// 用户注册 将用户名和密码存入集合
		// 程序启动 要求用户选择功能 1 注册 2登陆 3退出
		// 要求用户先注册后登陆
		System.out.println("请选择功能：1注册 2登陆 3退出");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		//定义两个集合存储用户名和密码
		ArrayList<String> username = new ArrayList<String>();
		ArrayList<String> password = new ArrayList<String>();
		t://break标记t
		switch(num){
		case 1:
			System.out.println("欢迎注册！");
			//要求输入用户名和密码 存入到集合当中
			while(true){
				System.out.println("请输入用户名：");
				String name = scan.next();
				if(name.equals("exit")){
					System.out.println("注册完毕，开始登陆");
					break;
				}
				System.out.println("请输入密码：");
				String pwd = scan.next();
				username.add(MD5(name));
				password.add(MD5(pwd));
				System.out.println("注册成功！");
			}
		case 2:
			System.out.println("欢迎登陆！");
			System.out.println("请输入用户名：");
			String user_name = scan.next();
			System.out.println("请输入密码：");
			String pass_word = scan.next();
			for(int i=0;i<username.size();i++){
				if(username.get(i).equals(MD5(user_name))
						&& password.get(i).equals(MD5(pass_word))){
					System.out.println("登陆成功！");
					break t;//标记 当登陆成功之后跳到指定的t标记处
				}
			}
			System.out.println("登陆失败！");
			break;
		case 3:
			System.out.println("已退出！");
			break;
		}
	}
	//定义一个md5加密算法
	public static String MD5(String msg){
			String msg_md5 = null;
			try {
				MessageDigest md =
						MessageDigest.getInstance("MD5");
				byte[] bts = msg.getBytes();
				md.update(bts);
				BigInteger big = new BigInteger(md.digest());
				msg_md5 = big.toString(16);
				System.out.println("加密成功！");
			} catch (NoSuchAlgorithmException e) {
				System.out.println("加密失败！");
				e.printStackTrace();
			}
				return msg_md5;
	}
	
}








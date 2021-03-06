package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * 客户端
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		//客户端socket需要指定ip地址和端口号
		//本地ip主机：
		//1.ipconfig查看本机ip 
		//2.localhost
		//3.127.0.0.1
		try {
			Socket client = new Socket("localhost",8888);
			System.out.println("链接服务器成功！");
			
			//发送数据
			//1.将客户端client里面的数据流获取出来
			OutputStream os = client.getOutputStream();
			//2.绑定到发送工具上
			PrintWriter pw = new PrintWriter(os);
			
			//客户端接收服务器反馈的消息
			InputStream is = client.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			/**
			 * 客户端手动输入发送数据
			 * 任务：屏蔽敏感字
			 */
			Scanner scan = new Scanner(System.in);
			while(true){
				System.out.println("请输入：");
				String str = scan.next();
				//将信息加密
				String msg = "";
				char[] c = str.toCharArray();
				for (int i = 0; i < c.length; i++) {
					//数组里面每个编码都加10
					int num = (int)(c[i])+10;
					//编码再转换为字符输出
					msg+=(char)num;
				}
				//3.绑定具体发送的数据
				pw.println(msg);
				//4.发送
				pw.flush();
				System.out.println(br.readLine());
				
			}
				
			
			
			
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
			System.out.println("链接服务器失败！");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("链接服务器失败！");
		}
	}

}







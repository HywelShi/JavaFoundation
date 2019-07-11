package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 * @author Administrator
 *
 */
public class Server {

	public static void main(String[] args) {
			try {
				ServerSocket server = new ServerSocket(8888);
				//accpet()启动之后会进入等待状态，等待客户端链接
				System.out.println("等待客户端链接...");
				//服务端链接一个客户端的时候 会生成一个客户端Socket
				Socket client = server.accept();
				System.out.println("一个客户端链接成功！");
				
				//读取数据
				//1.将客户端的数据流读取出来
				InputStream is = client.getInputStream();
				//2.将数据流拆开
				InputStreamReader isr = new InputStreamReader(is);
				//3.借助读取工具读取
				BufferedReader br = new BufferedReader(isr);
				String[] words = {"爸","妈","菜","猪","驴"};
				while(true){
					//4.输出读取结果
					String str = br.readLine();
					//屏蔽敏感字功能
					for (int i = 0; i < words.length; i++) {
						str = str.replaceAll(words[i], "*");
					}
					System.out.println(str);
				}
					
				
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("链接失败！");
			}
	}

}








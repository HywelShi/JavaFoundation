package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * �����
 * @author Administrator
 *
 */
public class Server {

	public static void main(String[] args) {
			try {
				ServerSocket server = new ServerSocket(8888);
				//accpet()����֮������ȴ�״̬���ȴ��ͻ�������
				System.out.println("�ȴ��ͻ�������...");
				//���������һ���ͻ��˵�ʱ�� ������һ���ͻ���Socket
				Socket client = server.accept();
				System.out.println("һ���ͻ������ӳɹ���");
				
				//��ȡ����
				//1.���ͻ��˵���������ȡ����
				InputStream is = client.getInputStream();
				//2.����������
				InputStreamReader isr = new InputStreamReader(is);
				//3.������ȡ���߶�ȡ
				BufferedReader br = new BufferedReader(isr);
				String[] words = {"��","��","��","��","¿"};
				while(true){
					//4.�����ȡ���
					String str = br.readLine();
					//���������ֹ���
					for (int i = 0; i < words.length; i++) {
						str = str.replaceAll(words[i], "*");
					}
					System.out.println(str);
				}
					
				
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("����ʧ�ܣ�");
			}
	}

}








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
 * �ͻ���
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		//�ͻ���socket��Ҫָ��ip��ַ�Ͷ˿ں�
		//����ip������
		//1.ipconfig�鿴����ip 
		//2.localhost
		//3.127.0.0.1
		try {
			Socket client = new Socket("localhost",8888);
			System.out.println("���ӷ������ɹ���");
			
			//��������
			//1.���ͻ���client�������������ȡ����
			OutputStream os = client.getOutputStream();
			//2.�󶨵����͹�����
			PrintWriter pw = new PrintWriter(os);
			
			//�ͻ��˽��շ�������������Ϣ
			InputStream is = client.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			/**
			 * �ͻ����ֶ����뷢������
			 * ��������������
			 */
			Scanner scan = new Scanner(System.in);
			while(true){
				System.out.println("�����룺");
				String str = scan.next();
				//����Ϣ����
				String msg = "";
				char[] c = str.toCharArray();
				for (int i = 0; i < c.length; i++) {
					//��������ÿ�����붼��10
					int num = (int)(c[i])+10;
					//������ת��Ϊ�ַ����
					msg+=(char)num;
				}
				//3.�󶨾��巢�͵�����
				pw.println(msg);
				//4.����
				pw.flush();
				System.out.println(br.readLine());
				
			}
				
			
			
			
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
			System.out.println("���ӷ�����ʧ�ܣ�");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("���ӷ�����ʧ�ܣ�");
		}
	}

}







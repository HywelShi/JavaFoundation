package day05;

import java.io.IOException;
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
			/**
			 * �ͻ����ֶ����뷢������
			 * ����exitֹͣ
			 * 
			 * ��������������
			 * 
			 */
			Scanner scan = new Scanner(System.in);
			while(true){
				System.out.println("�����룺");
				String str = scan.next();
				//3.�󶨾��巢�͵�����
				pw.println(str);
				//4.����
				pw.flush();
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







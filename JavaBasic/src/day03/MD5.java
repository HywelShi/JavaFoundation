package day03;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

	public static void main(String[] args) {
		String msg = "888888";
		//1.ȷ���㷨
		try {
			MessageDigest md =
					MessageDigest.getInstance("MD5");
			//2.����Ҫ���ܵ�����ת��Ϊ�ֽ�����
			byte[] bts = msg.getBytes();
			//3.ִ�м����㷨
			md.update(bts);
			BigInteger big = new BigInteger(md.digest());
			//4.������ܺ������
			System.out.println(big.toString(16));
			System.out.println("���ܳɹ���");
		} catch (NoSuchAlgorithmException e) {
			System.out.println("����ʧ�ܣ�");
			e.printStackTrace();
		}
		
		
		

	}

}

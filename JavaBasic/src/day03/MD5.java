package day03;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

	public static void main(String[] args) {
		String msg = "888888";
		//1.确定算法
		try {
			MessageDigest md =
					MessageDigest.getInstance("MD5");
			//2.将需要加密的内容转换为字节数组
			byte[] bts = msg.getBytes();
			//3.执行加密算法
			md.update(bts);
			BigInteger big = new BigInteger(md.digest());
			//4.输出加密后的内容
			System.out.println(big.toString(16));
			System.out.println("加密成功！");
		} catch (NoSuchAlgorithmException e) {
			System.out.println("加密失败！");
			e.printStackTrace();
		}
		
		
		

	}

}

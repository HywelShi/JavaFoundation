package day05;

public class ThreadTest02 {

	public static void main(String[] args) {
		//5.ʵ����Thread02
		Thread02 t = new Thread02();
		//6.ʵ�����߳�Thread������Thread02
		Thread th = new Thread(t);
		//7.�����߳�
		th.start();
	}

}

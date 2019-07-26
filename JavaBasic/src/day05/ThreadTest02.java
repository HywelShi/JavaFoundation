package day05;

public class ThreadTest02 {

	public static void main(String[] args) {
		//5.实例化Thread02
		Thread02 t = new Thread02();
		//6.实例化线程Thread来控制Thread02
		Thread th = new Thread(t);
		//7.启动线程
		th.start();
	}

}

package day05;

public class Word {

	public static void main(String[] args) {
		Thread03 t = new Thread03();
		Thread th = new Thread(t);
		th.start();
	}

}
//1.定义一个线程类  继承线程
class Thread03 implements Runnable{
	@Override
	public void run() {
		String msg = "长沙最近高温，注意避暑！";
		while(true){
			String str = "";
			for (int i = 0; i < msg.length(); i++) {
				str += msg.charAt(i);
				System.out.println(str);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}
	
}









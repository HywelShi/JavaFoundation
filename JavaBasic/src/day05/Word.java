package day05;

public class Word {

	public static void main(String[] args) {
		Thread03 t = new Thread03();
		Thread th = new Thread(t);
		th.start();
	}

}
//1.����һ���߳���  �̳��߳�
class Thread03 implements Runnable{
	@Override
	public void run() {
		String msg = "��ɳ������£�ע����";
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









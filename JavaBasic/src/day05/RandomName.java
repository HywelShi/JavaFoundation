package day05;

public class RandomName {
	public static void main(String[] args) {
		Thread04 t = new Thread04();
		Thread th = new Thread(t);
		th.start();
	}

}
class Thread04 implements Runnable{

	@Override
	public void run() {
		//1.�����������洢ѧ������
		String[] names = 
				{"����","����","����","����",
				 "����","����","����","Ǯ��"};
		//2.forѭ�����Ƶ���������1-5�պ����
		for(int i=1;i<=5;i++){
			//3.ÿһ�δ��������������ȡһ��
			int num = (int)(Math.random()*names.length);
			System.out.println(names[num]);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}









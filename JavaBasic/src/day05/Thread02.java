package day05;

//1.ʵ��Runnable�ӿ�
public class Thread02 implements Runnable{
	//2.��дrun����
	@Override
	public void run() {
		int a = 0;
		//3.��ѭ��ʵ��a��ͣ�ۼ�
		while(true){
			a++;
			System.out.println(a);
			if(a==10){
				a=0;
			}
			try {
				//4.sleep�������������ӳ�
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}

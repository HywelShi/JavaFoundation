package day05;
//1.�̳�Thread��
public class Thread01 extends Thread{
	//2.��дrun���� ����Ҫд ���ҷ��������ܴ�
	public void run(){
		//3.��д�߳̾�����Ƶ�����
		int a = 0;//��
		int b = 0;//��
		int c = 0;//ʱ
		while(true){
			a++;
			if(a==60){
				b++;//60�����1
				a=0;//�����Ϊ0
				if(b==60){
					c++;
					b=0;
				}
			}
			System.out.println("ʱ:"+c+"��:"+b+"��:"+a);
			//4.����sleep��������ʱ����
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
}

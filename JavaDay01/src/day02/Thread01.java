package day02;
/**
 * 
 * @author Administrator
 *
 */
//1.�̳�Thread��
public class Thread01 implements Runnable{

	public static void main(String[] args) {
			//5.�����߳�
			//�ֽ��߳��ù��� ȡ��һ���̶߳���
			Thread01 t = new Thread01();
			Thread th = new Thread(t);
			//�������start()����
			th.start();
	}
	/**
	 * ���̳��߳�Thread��ʱ������Ҫд�߳������
	 * һ��run���� ʵ�ֶ�̬Ч��
	 */
	//2.��дrun����
	public void run(){
		//3.д��ѭ��ʵ�ֲ�ͣ������
		int a = 0;//��
		int b = 0;//��
		int c = 0;//ʱ
		while(true){
			a++;
			//4.�����̵߳�sleep����ʵ�ֳ�˯
			//��˯��Ŀ����Ϊ������ѭ������ʱ����
			if(a==60){
				b++;a=0;
				if(b==60){
					c++;b=0;
				}
			}
			System.out.println(c+"ʱ"+b+"��"+a+"��");
			//try catch ��ʾ�����쳣
			//һ�����ڴ�ӡ�쳣�����Ҵ�����
			try {
				//ʱ�䵥λΪ����
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
	
	
	
	
	
}

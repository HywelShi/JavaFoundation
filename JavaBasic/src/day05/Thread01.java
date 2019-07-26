package day05;
//1.继承Thread类
public class Thread01 extends Thread{
	//2.编写run方法 必须要写 并且方法名不能错
	public void run(){
		//3.编写线程具体控制的内容
		int a = 0;//秒
		int b = 0;//分
		int c = 0;//时
		while(true){
			a++;
			if(a==60){
				b++;//60秒分走1
				a=0;//将秒归为0
				if(b==60){
					c++;
					b=0;
				}
			}
			System.out.println("时:"+c+"分:"+b+"秒:"+a);
			//4.利用sleep方法设置时间间隔
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
}

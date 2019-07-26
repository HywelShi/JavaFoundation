package day05;

//1.实现Runnable接口
public class Thread02 implements Runnable{
	//2.重写run方法
	@Override
	public void run() {
		int a = 0;
		//3.死循环实现a不停累加
		while(true){
			a++;
			System.out.println(a);
			if(a==10){
				a=0;
			}
			try {
				//4.sleep方法可以设置延迟
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}

package day02;
/**
 * 
 * @author Administrator
 *
 */
//1.继承Thread类
public class Thread01 implements Runnable{

	public static void main(String[] args) {
			//5.启动线程
			//现将线程拿过来 取出一个线程对象
			Thread01 t = new Thread01();
			Thread th = new Thread(t);
			//对象调用start()方法
			th.start();
	}
	/**
	 * 当继承线程Thread类时，必须要写线程里面的
	 * 一个run方法 实现动态效果
	 */
	//2.编写run方法
	public void run(){
		//3.写死循环实现不停的增加
		int a = 0;//秒
		int b = 0;//分
		int c = 0;//时
		while(true){
			a++;
			//4.利用线程的sleep方法实现沉睡
			//沉睡的目的是为了让死循环产生时间间隔
			if(a==60){
				b++;a=0;
				if(b==60){
					c++;b=0;
				}
			}
			System.out.println(c+"时"+b+"分"+a+"秒");
			//try catch 表示捕获异常
			//一般用在打印异常方法找错并调试
			try {
				//时间单位为毫秒
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
	
	
	
	
	
}

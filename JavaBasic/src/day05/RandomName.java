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
		//1.定义数组来存储学生姓名
		String[] names = 
				{"张三","李四","王五","马六",
				 "赵四","刘五","张六","钱四"};
		//2.for循环控制点名的人数1-5刚好五次
		for(int i=1;i<=5;i++){
			//3.每一次从姓名数组里面抽取一个
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









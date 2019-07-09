package airplane;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

//7.自定义画布  继承原生态画布JPanel
//3.实现Runnable
public class JPanel02 extends JPanel implements
MouseMotionListener,Runnable{
	int x = 150;//定义英雄机默认的位置
	int y = 350;
	int epX = 100;
	int epY = 100;//2.定义小敌机的初始位置
	//在绘制多个飞机之前，先将多个飞机的参数确定下来
	//再去绘制，利用循环将x坐标在0-400之间随机
	//y坐标在0-200之间随机 速度在1-5之间随机
	/**
	 * 定义飞机数量count
	 * 定义存放十个飞机x坐标的数组xs
	 * 定义存放十个飞机y坐标的数组ys
	 * 定义存放十个飞机的速度数组speeds
	 */
	int count = 10;//表示小敌机的数量
	int[] xs = new int[10];//10个飞机的x坐标
	int[] ys = new int[10];//10个飞机的y坐标
	int[] speeds = new int[10];//10个飞机的速度
	//构造方法：public 类名(){} 一般用来初始化参数
	//一般用来绘制敌机之前初始化敌机的xy坐标
	//还有速度
	/**
	 * 利用构造方法 将十个飞机的坐标速度初始化
	 */
	public JPanel02(){
		for(int i=0;i<10;i++){
			xs[i] = (int)(Math.random()*401);
			ys[i] = (int)(Math.random()*201);
			speeds[i] = (int)(Math.random()*5+1);
		}
	}
	//8.绘画方法 可以画自己想画的内容
	public void paint(Graphics g){
		//第一步：绘制背景图 现将图片加载到程序中
		ImageIcon bgIcon = new ImageIcon("bg1.jpg");
		//第二步：转换格式
		Image bg = bgIcon.getImage();
		//第三步：利用画笔绘制出来 null表示不重复
		g.drawImage(bg,0,0,400,600,null);
		//加载英雄机图片
		//第一步：绘制背景图 现将图片加载到程序中
		ImageIcon heroIcon = new ImageIcon("hero.png");
		//第二步：转换格式
		Image hero = heroIcon.getImage();
		//第三步：利用画笔绘制出来 null表示不重复
		g.drawImage(hero,x,y,100,100,null);
		//1.一个飞机往下飞 加载一个飞机
		ImageIcon epIcon = new ImageIcon("ep01.png");
		Image ep = epIcon.getImage();
		/**
		 * 利用循环把十个飞机绘制出来
		 */
		for(int i=0;i<10;i++){
			g.drawImage(ep, xs[i],ys[i],50,50,null);
		}
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	//监听鼠标移动事件
	@Override
	public void mouseMoved(MouseEvent e) {
		x = e.getX()-57;
		y = e.getY()-77;
		//重画方法
		repaint();
	}
	
	//4.编写run方法
	@Override
	public void run() {
		//5.死循环实现不停的飞
		while(true){
			/**
			 * 利用循环实现十个飞机的移动
			 * 并且每个飞机的速度不一定
			 */
			for(int i=0;i<10;i++){
				ys[i]+=speeds[i];
				//6.判断是否飞出边界
				if(ys[i]==600){
					ys[i]=0;
					//epX随机产生
					xs[i] = (int)(Math.random()*401);
				}
				//7.控制时间间隔
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//8.重画方法
				repaint();
			}
			
		}
		
	}
		

	
}














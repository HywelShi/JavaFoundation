package day02;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

//3.实现Runnable
public class BallJPanel extends JPanel 
implements Runnable{
	/**
	 * 思路：
	 * 利用画布实现线程
	 * 利用线程改变小球的x和y坐标
	 * 设置时间间隔
	 * 启动线程即可
	 */
	//2.将坐标改活
	int x = 0;
	int y = 0;
	int dir =1;
	//1.绘制小球
	public void paint(Graphics g){
		//9.可以实现清除老的位置的小球
		super.paint(g);
		g.fillOval(x, y, 50, 50);
	}
	//4.写run方法
	@Override
	public void run() {
		//5.死循环此时来控制小球的x y坐标
		while(true){
			x++;
			y++;
			//7.设置时间间隔来控制坐标多久增加1
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//8.***必须要有重画方法***
			//重画方法可以实现每次移动之后
			//在新的位置画出新的小球
			repaint();
			
		}
		
	}
	
}








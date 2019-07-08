package day02;

import java.awt.Graphics;
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
	int dir =1;//初始方向
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
			//11.定义方向
			if(dir==1){x++;y++;}
			if(dir==2){x--;y++;}
			if(dir==3){x--;y--;}
			if(dir==4){x++;y--;}
			//12.根据临界点碰撞的方向来确定反弹的方向
			//右边界
			if(x>=400-50-17){
				if(dir==1){
					dir=2;
				}else{
					dir=3;
				}
			}
			//下边界
			if(y>=600-50-37){
				if(dir==2){
					dir=3;
				}else{
					dir=4;
				}
			}
			//左边界
			if(x<=0){
				if(dir==3){
					dir=4;
				}else{
					dir=1;
				}
			}
			//上边界
			if(y<=0){
				if(dir==4){
					dir=1;
				}else{
					dir=2;
				}
			}
			
			
			
			
			
			//7.设置时间间隔来控制坐标多久增加1
			try {
				Thread.sleep(100);
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








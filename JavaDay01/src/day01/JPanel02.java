package day01;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

//7.自定义画布  继承原生态画布JPanel
public class JPanel02 extends JPanel implements
MouseMotionListener{
	int x = 150;//定义英雄机默认的位置
	int y = 350;
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
		
		
		//作业：生成多个敌机
		for(int i=1;i<=10;i++){
			int n = (int)(Math.random()*8+1);
			ImageIcon epIcon = new ImageIcon("ep0"+n+".png");
			Image ep = epIcon.getImage();
			int x = (int)(Math.random()*401);
			int y = (int)(Math.random()*201);
			int width = (int)(Math.random()*51+50);
			int height = (int)(Math.random()*51+50);
			g.drawImage(ep, x, y, width,height,null);
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

	
}














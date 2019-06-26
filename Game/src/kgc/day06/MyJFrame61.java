package kgc.day06;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyJFrame61 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("控制英雄机发子弹");
		frame.setSize(430, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		MyJPanel61 mp = new MyJPanel61();
		frame.add(mp);
		Thread tn = new Thread(mp);
		tn.start();
		//
		// 3打开任督二脉MouseMotionListener
		frame.addMouseMotionListener(mp);
		frame.addMouseListener(mp);

		frame.setVisible(true);
	}

}

// 1实现mousemotinlistener接口
class MyJPanel61 extends JPanel implements MouseMotionListener, Runnable,
		MouseListener

{
	ImageIcon bgImgIcon1 = new ImageIcon("img/bg1.jpg");
	Image bgImg1 = bgImgIcon1.getImage();
	ImageIcon heroImgIcon = new ImageIcon("img/hero.png");
	ImageIcon fireImgIcon = new ImageIcon("img/fire.png");
	Image fireImg = fireImgIcon.getImage();
	int x = 180;
	int y = 500;
	Image heroImg = heroImgIcon.getImage();
	/**
     * 
     */
	// 保存所有发射出来的子弹
	ArrayList<Bullet> butList = new ArrayList<Bullet>();
	boolean isFire = false;// 是否开火
	// 保存所有敌机的集合
	ArrayList<Enemy> enemyList = new ArrayList<Enemy>();
	Image enemyImgs[] = new Image[15];
	Random ran = new Random();

	public MyJPanel61() {
		// 1.产生所有的图片
		for (int i = 0; i < enemyImgs.length; i++) {
			if (i > 8) {
				ImageIcon imgIcon = new ImageIcon("img/ep" + (i + 1) + ".png");
				enemyImgs[i] = imgIcon.getImage();
			} else {
				ImageIcon imgIcon = new ImageIcon("img/ep0" + (i + 1) + ".png");
				enemyImgs[i] = imgIcon.getImage();
			}
		}
		// 2.产生一定数量的敌机
		for (int i = 0; i < 20; i++) {
			Enemy enemy = new Enemy();
			enemy.setImg(enemyImgs[ran.nextInt(15)]);
			int width = enemy.getImg().getWidth(null);
			int height = enemy.getImg().getHeight(null);
			enemy.setSpeed(ran.nextInt(5) + 1);
			enemy.setX(ran.nextInt(430 - 17 - width));
			enemy.setY(ran.nextInt(430 - 17 - height));
			enemy.setWidth(width * 2 / 3);
			enemy.setHeight(height * 2 / 3);
			enemyList.add(enemy);

		}
	}

	public void paint(Graphics g) {

		g.drawImage(bgImg1, 0, 0, 430, 640, null);
		// 绘制所有的敌机
		for (int i = 0; i < enemyList.size(); i++) {
			enemyList.get(i).paint(g);
		}
		g.drawImage(heroImg, x, y, 114, 93, null);
		for (int i = 0; i < butList.size(); i++) {
			butList.get(i).paint(g);
		}
	}

	// 2实现接口中的抽象方法
	public void mouseDragged(MouseEvent e) {
		isFire = true;
		x = e.getX() - 57;
		y = e.getY() - 30 - 47;

		repaint();
		// System.out.println("mousDragged");
	}

	public void mouseMoved(MouseEvent e) {
		// System.out.println("mouseMoved");
		// 实现run
		x = e.getX() - 57;
		y = e.getY() - 30 - 47;

		repaint();
	}

	public void run() {
		long count = 0;
		while (true) {
			if (isFire && count % 15 == 0) {
				Bullet but = new Bullet();
				but.setHeight(22);
				but.setWidth(30);
				but.setImg(fireImg);
				but.setSpeed(3);
				but.setY(y);
				but.setX(x + 57 - 15);
				butList.add(but);

			}
			if (count >= 15000000) {
				count = 0;
			} else {
				count++;
			}
			// 循环改变所有子弹的坐标
			for (int i = 0; i < butList.size(); i++) {
				Bullet but = butList.get(i);
				if (but.getY() <= -30) {
					butList.remove(but);
				} else {
					but.move();
				}
			}
			//让敌机飞
			for (int i = 0;i<enemyList.size(); i++){
				
			}
			try {
				Thread.sleep(10);// 休眠
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint();// 重绘

		}
	}

	public void mouseClicked(MouseEvent e) {

	}

	public void mousePressed(MouseEvent e) {
		isFire = true;
	}

	public void mouseReleased(MouseEvent e) {
		isFire = false;
	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {

	}
}
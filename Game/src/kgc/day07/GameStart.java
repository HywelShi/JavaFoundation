package kgc.day07;

import java.awt.Color;
import java.awt.Font;
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

public class GameStart {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("控制英雄机发子弹");
		frame.setSize(430, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		MyJPanel61 mp = new MyJPanel61();
		frame.add(mp);
		// frame.setUndecorated(true);
		// 3、打开任督二脉MouseMotionListener
		frame.addMouseMotionListener(mp);
		frame.addMouseListener(mp);
		// BM3、声明并实例化线程类Thread类的对象
		Thread th = new Thread(mp);
		// BM4、启动线程
		th.start();
		frame.setVisible(true);
	}
}

// 1、实现MouseMotionListener接口
// BM1、实现Runnable接口
class MyJPanel61 extends JPanel implements MouseMotionListener, Runnable,
		MouseListener {
	ImageIcon bgImgIcon = new ImageIcon("img/bg2.jpg");
	Image bgImg = bgImgIcon.getImage();
	ImageIcon heroImgIcon = new ImageIcon("img/hero.png");
	Image heroImg = heroImgIcon.getImage();
	ImageIcon fireImgIcon = new ImageIcon("img/fire.png");
	Image fireImg = fireImgIcon.getImage();
	int x = 180;
	int y = 500;
	/**
	 * ArrayList<Bullet> butList= new ArrayList<Bullet>(); size():获取集合的长度
	 * add(Bullet but):向集合中添加一个对象 remove(int index):根据下标删除集合中的 一个对象
	 * remove(Bullet but):根据对象名删除集合中的 一个对象 Bullet get(int index):根据下标获取对象
	 */
	// 保存所有发射出来的子弹
	ArrayList<Bullet> butList = new ArrayList<Bullet>();
	boolean isFire = false;// 是否开火
	// 保存所有敌机的集合
	ArrayList<Enemy> enemyList = new ArrayList<Enemy>();
	// 保存所有敌机的图片数组
	Image enemyImgs[] = new Image[15];
	Random ran = new Random();
	int score = 0;
	int blood = 100;

	public MyJPanel61() {
		// 1、产生所有图片
		for (int i = 0; i < enemyImgs.length; i++) {
			if (i > 3) {
				ImageIcon imgIcon = new ImageIcon("img/ep" + (i + 1) + ".png");
				enemyImgs[i] = imgIcon.getImage();
			} else {
				ImageIcon imgIcon = new ImageIcon("img/ep0" + (i + 1) + ".png");
				enemyImgs[i] = imgIcon.getImage();
			}
		}
		// 2、产生一定数量的敌机
		for (int i = 0; i < 10; i++) {
			Enemy enemy = new Enemy();
			enemy.setImg(enemyImgs[ran.nextInt(15)]);
			int width = enemy.getImg().getWidth(null);
			int height = enemy.getImg().getHeight(null);
			enemy.setSpeed(ran.nextInt(5) + 1);
			enemy.setX(ran.nextInt(430 - 17 - width));
			enemy.setY(-ran.nextInt(640 - 37 - height));
			enemy.setWidth(width * 2 / 3);
			enemy.setHeight(height * 2 / 3);
			enemyList.add(enemy);
		}
	}

	public void paint(Graphics g) {
		g.drawImage(bgImg, 0, 0, 430, 640, null);
		g.drawImage(heroImg, x, y, null);
		// 绘制所以后的子弹
		for (int i = 0; i < butList.size(); i++) {
			Bullet but = butList.get(i);
			but.paint(g);
			// butList.get(i).paint(g);
		}
		// 绘制所有的敌机
		for (int i = 0; i < enemyList.size(); i++) {
			enemyList.get(i).paint(g);
		}
		// 绘制得分
		g.setColor(Color.RED);
		g.setFont(new Font("微软雅黑", Font.BOLD, 30));
		g.drawString("score:" + score, 10, 25);
		// 绘制英雄机血条
		g.setColor(Color.RED);
		g.fillRect(10, 40, 100, 20);
		g.setColor(Color.GREEN);
		g.fillRect(10, 40, blood, 20);
		if (blood <= 0) {
			g.setFont(new Font("微软雅黑", Font.BOLD, 40));
			g.setColor(Color.RED);
			g.drawString("GAME OVER", 100, 300);
		}
	}

	// 2、实现接口中的抽象方法
	public void mouseDragged(MouseEvent e) {
		isFire = true;
		x = e.getX() - 57;
		y = e.getY() - 30 - 47;
		repaint();
		// System.out.println("mouseDragged");
	}

	public void mouseMoved(MouseEvent e) {
		x = e.getX() - 57;
		y = e.getY() - 30 - 47;
		repaint();
	}

	// BM2、实现run()
	public void run() {
		long count = 0;
		while (blood > 0) {
			if (isFire && count % 30 == 0) {
				Bullet but = new Bullet();
				but.setHeight(30);
				but.setWidth(30);
				but.setImg(fireImg);
				but.setSpeed(10);
				but.setY(y);
				but.setX(x + 57 - 15);
				butList.add(but);
			}
			if (count >= 1500000) {
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
			// 让敌机飞
			for (int i = 0; i < enemyList.size(); i++) {
				Enemy enemy = enemyList.get(i);
				if (enemy.getY() >= 640) {
					enemy.setY(-enemy.getHeight());
					enemy.setX(ran.nextInt(430 - 17 - enemy.getWidth()));
					enemy.setImg(enemyImgs[ran.nextInt(15)]);
					enemy.setSpeed(ran.nextInt(1) + 1);
				} else {
					enemy.move();
				}
			}
			// 处理子弹击中敌机
			for (int i = 0; i < enemyList.size(); i++) {
				Enemy enemy = enemyList.get(i);
				boolean isHited = false;
				for (int j = 0; j < butList.size(); j++) {
					Bullet but = butList.get(j);
					if (isHit(but, enemy)) {
						score = score + 100;
						butList.remove(but);
						enemy.setImg(enemyImgs[ran.nextInt(15)]);
						int width = enemy.getImg().getWidth(null);
						int height = enemy.getImg().getHeight(null);
						enemy.setWidth(width * 2 / 3);
						enemy.setHeight(height * 2 / 3);
						enemy.setSpeed(ran.nextInt(5) + 1);
						enemy.setY(-height);
						enemy.setX(ran.nextInt(430 - 17 - enemy.getWidth()));
						break;
					}
				}
				if (!isHited) {
					if (isHit(enemy)) {
						blood = blood - 10;
						enemy.setImg(enemyImgs[ran.nextInt(15)]);
						int width = enemy.getImg().getWidth(null);
						int height = enemy.getImg().getHeight(null);
						enemy.setWidth(width * 2 / 3);
						enemy.setHeight(height * 2 / 3);
						enemy.setSpeed(ran.nextInt(5) + 1);
						enemy.setY(-height);
						enemy.setX(ran.nextInt(430 - 17 - enemy.getWidth()));
					}
				}
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

	public boolean isHit(Bullet but, Enemy enemy) {
		int br = but.getWidth() / 3;
		int er = enemy.getWidth() / 3;
		int xxlen = enemy.getX() + enemy.getWidth() / 2
				- (but.getX() + but.getWidth() / 2);
		int yylen = enemy.getY() + enemy.getHeight() / 2
				- (but.getY() + but.getHeight() / 2);
		int cc = xxlen * xxlen + yylen * yylen;
		return cc <= (er + br) * (er + br);
	}

	public boolean isHit(Enemy enemy) {
		int hr = heroImg.getWidth(null) / 3;
		int er = enemy.getWidth() / 3;
		int xxlen = enemy.getX() + enemy.getWidth() / 2
				- (x + heroImg.getWidth(null) / 2);
		int yylen = enemy.getY() + enemy.getHeight() / 2
				- (y + heroImg.getHeight(null) / 2);
		int cc = xxlen * xxlen + yylen * yylen;
		if (cc <= (hr + er) * (hr + er)) {
			return true;
		}
		return false;
	}

}

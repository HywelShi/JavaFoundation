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
		frame.setTitle("����Ӣ�ۻ����ӵ�");
		frame.setSize(430, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		MyJPanel61 mp = new MyJPanel61();
		frame.add(mp);
		// frame.setUndecorated(true);
		// 3�����ζ�����MouseMotionListener
		frame.addMouseMotionListener(mp);
		frame.addMouseListener(mp);
		// BM3��������ʵ�����߳���Thread��Ķ���
		Thread th = new Thread(mp);
		// BM4�������߳�
		th.start();
		frame.setVisible(true);
	}
}

// 1��ʵ��MouseMotionListener�ӿ�
// BM1��ʵ��Runnable�ӿ�
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
	 * ArrayList<Bullet> butList= new ArrayList<Bullet>(); size():��ȡ���ϵĳ���
	 * add(Bullet but):�򼯺������һ������ remove(int index):�����±�ɾ�������е� һ������
	 * remove(Bullet but):���ݶ�����ɾ�������е� һ������ Bullet get(int index):�����±��ȡ����
	 */
	// �������з���������ӵ�
	ArrayList<Bullet> butList = new ArrayList<Bullet>();
	boolean isFire = false;// �Ƿ񿪻�
	// �������ел��ļ���
	ArrayList<Enemy> enemyList = new ArrayList<Enemy>();
	// �������ел���ͼƬ����
	Image enemyImgs[] = new Image[15];
	Random ran = new Random();
	int score = 0;
	int blood = 100;

	public MyJPanel61() {
		// 1����������ͼƬ
		for (int i = 0; i < enemyImgs.length; i++) {
			if (i > 3) {
				ImageIcon imgIcon = new ImageIcon("img/ep" + (i + 1) + ".png");
				enemyImgs[i] = imgIcon.getImage();
			} else {
				ImageIcon imgIcon = new ImageIcon("img/ep0" + (i + 1) + ".png");
				enemyImgs[i] = imgIcon.getImage();
			}
		}
		// 2������һ�������ĵл�
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
		// �������Ժ���ӵ�
		for (int i = 0; i < butList.size(); i++) {
			Bullet but = butList.get(i);
			but.paint(g);
			// butList.get(i).paint(g);
		}
		// �������еĵл�
		for (int i = 0; i < enemyList.size(); i++) {
			enemyList.get(i).paint(g);
		}
		// ���Ƶ÷�
		g.setColor(Color.RED);
		g.setFont(new Font("΢���ź�", Font.BOLD, 30));
		g.drawString("score:" + score, 10, 25);
		// ����Ӣ�ۻ�Ѫ��
		g.setColor(Color.RED);
		g.fillRect(10, 40, 100, 20);
		g.setColor(Color.GREEN);
		g.fillRect(10, 40, blood, 20);
		if (blood <= 0) {
			g.setFont(new Font("΢���ź�", Font.BOLD, 40));
			g.setColor(Color.RED);
			g.drawString("GAME OVER", 100, 300);
		}
	}

	// 2��ʵ�ֽӿ��еĳ��󷽷�
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

	// BM2��ʵ��run()
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
			// ѭ���ı������ӵ�������
			for (int i = 0; i < butList.size(); i++) {
				Bullet but = butList.get(i);
				if (but.getY() <= -30) {
					butList.remove(but);
				} else {
					but.move();
				}
			}
			// �õл���
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
			// �����ӵ����ел�
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
				Thread.sleep(10);// ����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint();// �ػ�
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

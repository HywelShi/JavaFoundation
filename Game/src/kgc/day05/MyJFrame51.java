package kgc.day05;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyJFrame51 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("����Ӣ�ۻ����ӵ�");
		frame.setSize(430, 630);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyJPanel51 mp = new MyJPanel51();
		frame.add(mp);
		//
		// 3���ζ�����MouseMotionListener
		frame.addMouseMotionListener(mp);
		frame.setVisible(true);
	}

}

// 1ʵ��mousemotinlistener�ӿ�
class MyJPanel51 extends JPanel implements MouseMotionListener

{
	ImageIcon bgImgIcon1 = new ImageIcon("img/bg1.jpg");
	Image bgImg1 = bgImgIcon1.getImage();
	ImageIcon heroImgIcon = new ImageIcon("img/hero.png");
	Image heroImg = heroImgIcon.getImage();
	ImageIcon fireImgIcon = new ImageIcon("img/fire.png");
	Image fireImg = fireImgIcon.getImage();
	int x = 180;
	int y = 500;
	/**
     * 
     */
	// �������з���������ӵ�
	ArrayList<Bullet> butList = new ArrayList<Bullet>();
	boolean isFire = false;// �Ƿ񿪻�

	public void paint(Graphics g) {

		g.drawImage(bgImg1, 0, 0, 430, 640, null);
		g.drawImage(heroImg, x, y, 114, 93, null);
		for (int i = 0; i < butList.size(); i++) {
			butList.get(i).paint(g);
		}
		//

	}

	// 2ʵ�ֽӿ��еĳ��󷽷�
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouseDragged");
		x = e.getX() - 57;
		y = e.getY() - 30 - 47;
		Bullet but = new Bullet();
		but.setHeight(52);
		but.setWidth(50);
		but.setImg(fireImg);
		but.setSpeed(3);
		but.setY(y);
		but.setX(x + 57 - 25);
		butList.add(but);
		repaint();
		// System.out.println("mousDragged");
	}

	public void mouseMoved(MouseEvent e) {
		System.out.println("mouseMoved");
		x = e.getX() - 57;
		y = e.getY() - 30 - 47;
		repaint();
	}
}
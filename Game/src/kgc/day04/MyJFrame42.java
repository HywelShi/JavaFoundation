package kgc.day04;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyJFrame42 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("静�?�版飞机大战");
		frame.setSize(430, 630);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyJPanel42 mp = new MyJPanel42();
		frame.add(mp);
		frame.setVisible(true);
	}

}

class MyJPanel42 extends JPanel {
	public void paint(Graphics g) {
		ImageIcon imgIcon = new ImageIcon("img/bg1.jpg");
		Image img1 = imgIcon.getImage();
		g.drawImage(img1, 0, 0, null);
		/*ImageIcon imgIcon1 = new ImageIcon("img/ep01.png");
		Image img = imgIcon1.getImage();
		g.drawImage(img, 100, 100, null);
		g.drawImage(img, 100, 300, 50, 50, null);
		ImageIcon imgIcon2 = new ImageIcon("img/ep03.png");
		Image img2 = imgIcon2.getImage();
		g.drawImage(img2, 180, 150, null);
		g.drawImage(img2, 270, 100, 80, 80, null);
		ImageIcon imgIcon3 = new ImageIcon("img/ep05.png");
		Image img3 = imgIcon3.getImage();
		g.drawImage(img3, 300, 330, null);
		g.drawImage(img3, 320, 460, 80, 80, null);
		ImageIcon imgIcon4 = new ImageIcon("img/ep07.png");
		Image img4 = imgIcon4.getImage();
		g.drawImage(img4, 180, 180, null);
		g.drawImage(img4, 60, 500, 50, 50, null);

		ImageIcon imgIcon5 = new ImageIcon("img/hero.png");
		Image img5 = imgIcon5.getImage();
		g.drawImage(img5, 150, 500, null);*/
		//g.drawImage(img5, 200, 200, 80, 80, null);

	}
}
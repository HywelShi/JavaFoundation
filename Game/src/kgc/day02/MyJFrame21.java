package kgc.day02;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyJFrame21 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("xxx");
		frame.setSize(400, 400);
		MyJPanel21 mp = new MyJPanel21();
		frame.add(mp);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}

class MyJPanel21 extends JPanel implements Runnable {
	int x;
	int y;
	int dir;

	public void paint(Graphics g) {
		super.paint(g);
		g.fillOval(x, y, 50, 50);
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根

	}

}

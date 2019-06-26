package kgc.day01;

import java.awt.*;
import java.util.Random;

import javax.swing.*;

public class MyJFrame01 {
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setSize(480, 640);
		frame.setTitle("满天�?");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

		frame.setLocation((dim.width - 480) / 2, (dim.height - 640) / 2);
		MyJPanel01 mp = new MyJPanel01();
		frame.add(mp);

		frame.setVisible(true);
	}
}

class MyJPanel01 extends JPanel {
	public void paint(Graphics g) {
		super.paint(g);
		this.setBackground(Color.BLACK);
		g.setColor(Color.WHITE);
		Random random = new Random();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		for (int i = 0; i < 300; i++) {
			//g.drawLine(100, 200, 100, 100);

			g.drawString("*", random.nextInt(1024), random.nextInt(768));
		} // (dim.width) (dim.height)

	}

	public void playGame() {

	}
}
package kgc.day03;

import java.awt.*;
import java.util.Random;

import javax.swing.*;

public class MyJFrame32 {
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setTitle("С��");
		frame.setSize(300, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyJPanel32 mp = new MyJPanel32();
		frame.add(mp);
		Thread t = new Thread(mp);
		t.start();
		frame.setVisible(true);
	}

}

class MyJPanel32 extends JPanel implements Runnable {
	// ����������
	int count = 100;
	Ball[] balls = new Ball[count];
	Random ran = new Random();

	public MyJPanel32() {

		// ѭ������ʼ����ֵ
		for (int i = 0; i < count; i++) {
			// A2.1ѭ������С����� A2.2��Ϊÿһ��С��ֵ
			Ball ball = new Ball();
			ball.setR(ran.nextInt(21) + 10);
			ball.setX(ran.nextInt(300 - 2 * ball.getR() - 17));
			ball.setY(ran.nextInt(400 - 2 * ball.getR() - 37));
			ball.setDir(ran.nextInt(4));
			ball.setSpeed(ran.nextInt(5) + 1);
			int rgbR = ran.nextInt(256);
			int rgbG = ran.nextInt(256);
			int rgbB = ran.nextInt(256);
			ball.setColor(new Color(rgbR, rgbG, rgbB));
			// a2.3
			balls[i] = ball;
		}
	}

	// int dir=1;
	// int dir=2;
	// int dir=3;//0���£�1���� 2���� 3����

	public void paint(Graphics g) {
		super.paint(g);
		for (int i = 0; i < count; i++) {
			// 4.�޸��ƶ��Լ���ײ�Ĵ���
			balls[i].myPaint(g);
		}
	}// ʵ��

	public void run() {
		while (true) {
			for (int i = 0; i < count; i++) {
				balls[i].move(300, 400);
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			repaint();
		}
	}
}
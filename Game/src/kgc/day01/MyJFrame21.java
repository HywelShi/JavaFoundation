package kgc.day01;

import java.awt.*;
import java.util.Random;

import javax.swing.*;

public class MyJFrame21 {
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setTitle("С��");
		frame.setSize(300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//
		MyJPanel21 mp = new MyJPanel21();
		frame.add(mp);
		Thread t = new Thread(mp);
		t.start();
		frame.setVisible(true);
	}

}

class MyJPanel21 extends JPanel implements Runnable {
	// ����������
	int count = 10;//С�������
	int xs[] = new int[count];//С��x����
	int ys[] = new int[count];//С��y����
	int rs[] = new int[count];//С��뾶r
	int dirs[] = new int[count];//С���˶�����dir
	Random ran = new Random();//�������
	//��Ĺ��췽��-һ��������ʼ������
	public MyJPanel21() {

		// ѭ������ʼ����ֵ
		for (int i = 0; i < count; i++) {
			//nextInt:0~0.9999....  1~21  +10 10~30
			rs[i] = ran.nextInt(21) + 10;
			//x+2*r-20 = ���ڵĿ� ����x = ���ڵĿ� - 2*r +20
			//y = ���ڵĸ�-2*r +20
			xs[i] = ran.nextInt(300 - 2 * rs[i] - 17);
			ys[i] = ran.nextInt(400 - 2 * rs[i] - 37);
			dirs[i] = ran.nextInt(4);//0-3;
		}
	}

	// int dir=1;
	// int dir=2;
	// int dir=3;//0���£�1���� 2���� 3����

	public void paint(Graphics g) {
		super.paint(g);
		for (int i = 0; i < count; i++) {
			g.fillOval(xs[i], ys[i], 2 * rs[i], 2 * rs[i]);
		}
	}// ʵ��

	public void run() {
		while (true) {
			for (int i = 0; i < count; i++) {
				// ���ݷ���ı�С�������
				if (dirs[i] == 0) {
					xs[i]++;
					ys[i]++;
				}
				if (dirs[i] == 1) {
					xs[i]--;
					ys[i]++;
				}
				if (dirs[i] == 2) {
					xs[i]--;
					ys[i]--;
				}
				if (dirs[i] == 3) {
					xs[i]++;
					ys[i]--;
				}
				// �Д�С���Ƿ��_߅�磬���Ǆt����
				// 300-d-17
				// 400-d-37
				if (xs[i] <= 0) {
					if (dirs[i] == 2) {
						dirs[i] = 3;
					} else {
						dirs[i] = 0;
					}
				}
				if (ys[i] <= 0) {
					if (dirs[i] == 3) {
						dirs[i] = 0;
					} else {
						dirs[i] = 1;
					}
				}
				if (xs[i] >= 300 - 2 * rs[i] - 17) {
					if (dirs[i] == 0) {
						dirs[i] = 1;
					} else {
						dirs[i] = 2;
					}
				}
				if (ys[i] >= 400 - 2 * rs[i] - 37) {
					if (dirs[i] == 1) {
						dirs[i] = 2;
					} else {
						dirs[i] = 3;
					}
				}
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
package kgc.day01;

import java.awt.*;
import java.util.Random;

import javax.swing.*;

public class MyJFrame21 {
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setTitle("小球");
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
	// 创建画布类
	int count = 10;//小球的数量
	int xs[] = new int[count];//小球x坐标
	int ys[] = new int[count];//小球y坐标
	int rs[] = new int[count];//小球半径r
	int dirs[] = new int[count];//小球运动方向dir
	Random ran = new Random();//随机函数
	//类的构造方法-一般用来初始化参数
	public MyJPanel21() {

		// 循环赋初始化的值
		for (int i = 0; i < count; i++) {
			//nextInt:0~0.9999....  1~21  +10 10~30
			rs[i] = ran.nextInt(21) + 10;
			//x+2*r-20 = 窗口的宽 ——x = 窗口的宽 - 2*r +20
			//y = 窗口的高-2*r +20
			xs[i] = ran.nextInt(300 - 2 * rs[i] - 17);
			ys[i] = ran.nextInt(400 - 2 * rs[i] - 37);
			dirs[i] = ran.nextInt(4);//0-3;
		}
	}

	// int dir=1;
	// int dir=2;
	// int dir=3;//0右下，1左下 2左上 3右上

	public void paint(Graphics g) {
		super.paint(g);
		for (int i = 0; i < count; i++) {
			g.fillOval(xs[i], ys[i], 2 * rs[i], 2 * rs[i]);
		}
	}// 实现

	public void run() {
		while (true) {
			for (int i = 0; i < count; i++) {
				// 根据方向改变小球的坐标
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
				// 判斷小球是否到達邊界，若是則反彈
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
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			repaint();
		}
	}
}
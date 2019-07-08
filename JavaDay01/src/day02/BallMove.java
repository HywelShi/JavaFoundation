package day02;

import javax.swing.JFrame;

public class BallMove {

	public static void main(String[] args) {
		//新建一个400*600的窗口 标题小球移动
		//在窗口上画出一个大小100*100 坐标(0,0)的黑色小球
		//画布叫BallJPanel
		JFrame j = new JFrame();
		j.setSize(400, 600);
		j.setLocationRelativeTo(null);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setTitle("小球移动");
		
		BallJPanel b = new BallJPanel();
		j.add(b);
		
		//10.启动线程
		//创建一个线程，将画布b放进去达到控制目的
		Thread t = new Thread(b);
		t.start();
		
		j.setVisible(true);
	}
}







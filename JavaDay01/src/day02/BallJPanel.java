package day02;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

//3.ʵ��Runnable
public class BallJPanel extends JPanel 
implements Runnable{
	/**
	 * ˼·��
	 * ���û���ʵ���߳�
	 * �����̸߳ı�С���x��y����
	 * ����ʱ����
	 * �����̼߳���
	 */
	//2.������Ļ�
	int x = 0;
	int y = 0;
	int dir =1;
	//1.����С��
	public void paint(Graphics g){
		//9.����ʵ������ϵ�λ�õ�С��
		super.paint(g);
		g.fillOval(x, y, 50, 50);
	}
	//4.дrun����
	@Override
	public void run() {
		//5.��ѭ����ʱ������С���x y����
		while(true){
			x++;
			y++;
			//7.����ʱ��������������������1
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//8.***����Ҫ���ػ�����***
			//�ػ���������ʵ��ÿ���ƶ�֮��
			//���µ�λ�û����µ�С��
			repaint();
			
		}
		
	}
	
}








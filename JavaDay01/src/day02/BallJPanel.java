package day02;

import java.awt.Graphics;
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
	int dir =1;//��ʼ����
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
			//11.���巽��
			if(dir==1){x++;y++;}
			if(dir==2){x--;y++;}
			if(dir==3){x--;y--;}
			if(dir==4){x++;y--;}
			//12.�����ٽ����ײ�ķ�����ȷ�������ķ���
			//�ұ߽�
			if(x>=400-50-17){
				if(dir==1){
					dir=2;
				}else{
					dir=3;
				}
			}
			//�±߽�
			if(y>=600-50-37){
				if(dir==2){
					dir=3;
				}else{
					dir=4;
				}
			}
			//��߽�
			if(x<=0){
				if(dir==3){
					dir=4;
				}else{
					dir=1;
				}
			}
			//�ϱ߽�
			if(y<=0){
				if(dir==4){
					dir=1;
				}else{
					dir=2;
				}
			}
			
			
			
			
			
			//7.����ʱ��������������������1
			try {
				Thread.sleep(100);
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








package kgc.day04;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class MyJFrame41 {
	public static void main(String[] args) {
		//Ctrl+Shift+o:����������
		JFrame frame = new JFrame();
		frame.setTitle("�����С��");
		frame.setSize(300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyJPanel32 mp = new MyJPanel32();
		frame.add(mp);
		//3��������ʵ����Thread��Ķ���
		Thread td = new Thread(mp);
		//4�������߳�
		td.start();
		frame.setVisible(true);
	}
}
//1��ʹ�ùؼ���implementsʵ��Runnable�ӿ�
class MyJPanel32 extends JPanel implements Runnable{
	//B2����count��Ϊ2
	int count = 2;
	//A1��ȥ�����õ�����xs,ys,rs,dirs,speeds
	//������ʵ����Ball�������
	Ball balls[] = new Ball[count];
	Random ran = new Random();
	public MyJPanel32(){
		//ѭ������ʼ����ֵ
		for(int i = 0;i<count;i++){
			//A2.1��ѭ������С�����
			Ball ball  = new Ball();
			//A2.2��ΪС�򸳳�ʼ����ֵ
			ball.setR(ran.nextInt(21)+10);//[10,30]
			ball.setX(ran.nextInt(300-2*ball.getR()-17));
			ball.setY(ran.nextInt(400-2*ball.getR()-37));
			ball.setDir(ran.nextInt(4));
			ball.setSpeed( ran.nextInt(5)+1);
			int rgbR = ran.nextInt(256);
			int rgbG = ran.nextInt(256);
			int rgbB = ran.nextInt(256);
			ball.setColor(new Color(rgbR,rgbG,rgbB));
			//A2.3����С����ӵ�������
			balls[i] = ball;
		}
	}
	//0:���£�1�����£�2�����ϣ�3������
	public void paint(Graphics g){
		super.paint(g);
		for(int i = 0;i<count;i++){
			/*Ball ball = balls[i];
			ball.myPaint(g);*/
			//3���޸Ļ��ƵĴ���
			balls[i].myPaint(g);
		}
	}
	//2��ʵ�ֽӿ��еĳ��󷽷�
	public void run(){
		while(true){
			for(int i = 0;i<count;i++){
				//4���޸��ƶ��Լ���ײ�Ĵ���
				balls[i].move(300, 400);
			}
			boolean hit=isHit(balls[0],balls[1]); 
			//B3���ж�����С���Ƿ�����ײ
			if(isHit(balls[0],balls[1])){//��ײ
				//�жϰ뾶��С
				if(balls[0].getR()>=balls[1].getR()){
					//�±�Ϊ0��С��뾶��
					int newR=balls[0].getR()+10;
					//������С����ʧ
					balls[0].setR(newR);
					balls[1].setR(0);
					balls[1].setX(-100);
					balls[1].setSpeed(0);
				}else{
				
					int newR=balls[0].getR()+100;
					//������С����ʧ
					balls[1].setR(newR);
					balls[0].setR(0);
					balls[0].setX(-50);
					balls[0].setSpeed(0);
					//�±�Ϊ1��С��뾶��
					//������С����ʧ
				}
			}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint();
		}
	}
	/**B1����װһ���ж�����С���Ƿ�����ײ�ķ���
	 * @param b1:����һ��С��
	 * @param b2����һ��С��
	 * @return true:����С������ײ��
	 *    false:����С��û����ײ
	 */
	public boolean isHit(Ball b1,Ball b2){
		//1����ƽ����x���ֱ�Ǳߵĳ���
		//2����ƽ����y���ֱ�Ǳ߳���
		//3��������Բ�ĵ�����ƽ��
		//4������Ԫ�İ뾶��
		//5�ж��Ƿ���ײ
		int xxlen=b1.getX()+b1.getR()-b2.getX()-b2.getR();
		int yylen=b1.getY()+b1.getR()-b2.getY()-b2.getR();
		int cc=xxlen*xxlen+yylen*yylen;
		int sumR=b1.getR()+b2.getR();
		//if((b1.getX()+b1.getR()-b2.getX()-b2.getR())*(b1.getX()+b1.getR()-b2.getX()-b2.getR())
		//+(b1.getY()+b1.getR()-b2.getY()-b2.getR())*(b1.getY()+b1.getR()-b2.getY()-b2.getR())
		//<=((b1.getR()+b2.getR())*(b1.getR()+b2.getR())))
		if(cc<=sumR*sumR)
	{
			return true;
		}
		return false;
	}
}











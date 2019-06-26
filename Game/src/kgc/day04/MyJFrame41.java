package kgc.day04;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class MyJFrame41 {
	public static void main(String[] args) {
		//Ctrl+Shift+o:快速引入类
		JFrame frame = new JFrame();
		frame.setTitle("大球吃小球");
		frame.setSize(300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyJPanel32 mp = new MyJPanel32();
		frame.add(mp);
		//3、声明并实例化Thread类的对象
		Thread td = new Thread(mp);
		//4、启动线程
		td.start();
		frame.setVisible(true);
	}
}
//1、使用关键字implements实现Runnable接口
class MyJPanel32 extends JPanel implements Runnable{
	//B2、将count该为2
	int count = 2;
	//A1、去掉不用的数组xs,ys,rs,dirs,speeds
	//声明并实例化Ball类的数组
	Ball balls[] = new Ball[count];
	Random ran = new Random();
	public MyJPanel32(){
		//循环赋初始化的值
		for(int i = 0;i<count;i++){
			//A2.1、循环产生小球对象，
			Ball ball  = new Ball();
			//A2.2、为小球赋初始化的值
			ball.setR(ran.nextInt(21)+10);//[10,30]
			ball.setX(ran.nextInt(300-2*ball.getR()-17));
			ball.setY(ran.nextInt(400-2*ball.getR()-37));
			ball.setDir(ran.nextInt(4));
			ball.setSpeed( ran.nextInt(5)+1);
			int rgbR = ran.nextInt(256);
			int rgbG = ran.nextInt(256);
			int rgbB = ran.nextInt(256);
			ball.setColor(new Color(rgbR,rgbG,rgbB));
			//A2.3、将小球添加到数组中
			balls[i] = ball;
		}
	}
	//0:右下，1：左下，2：左上，3：右上
	public void paint(Graphics g){
		super.paint(g);
		for(int i = 0;i<count;i++){
			/*Ball ball = balls[i];
			ball.myPaint(g);*/
			//3、修改绘制的代码
			balls[i].myPaint(g);
		}
	}
	//2、实现接口中的抽象方法
	public void run(){
		while(true){
			for(int i = 0;i<count;i++){
				//4、修改移动以及碰撞的代码
				balls[i].move(300, 400);
			}
			boolean hit=isHit(balls[0],balls[1]); 
			//B3、判断两个小球是否发生碰撞
			if(isHit(balls[0],balls[1])){//碰撞
				//判断半径大小
				if(balls[0].getR()>=balls[1].getR()){
					//下标为0的小球半径大
					int newR=balls[0].getR()+10;
					//大球变大，小球消失
					balls[0].setR(newR);
					balls[1].setR(0);
					balls[1].setX(-100);
					balls[1].setSpeed(0);
				}else{
				
					int newR=balls[0].getR()+100;
					//大球变大，小球消失
					balls[1].setR(newR);
					balls[0].setR(0);
					balls[0].setX(-50);
					balls[0].setSpeed(0);
					//下标为1的小球半径大
					//大球变大，小球消失
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
	/**B1、封装一个判断两个小球是否发生碰撞的方法
	 * @param b1:其中一个小球
	 * @param b2：另一个小球
	 * @return true:两个小球发生碰撞，
	 *    false:两个小球没有碰撞
	 */
	public boolean isHit(Ball b1,Ball b2){
		//1计算平行于x轴的直角边的长度
		//2计算平行于y轴的直角边长度
		//3计算两个圆心点距离的平方
		//4计算两元的半径和
		//5判断是否碰撞
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











package kgc.day03;

import java.awt.*;
import java.util.Random;

import javax.swing.*;


public class MyJFrame31 {
	public static void main(String[]args){
		
	JFrame frame=new JFrame();
	frame.setTitle("С��");
	frame.setSize(300,400);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	frame.setLocationRelativeTo(null);
	MyJPanel31 mp=new MyJPanel31();
	frame.add(mp);
	Thread t=new Thread(mp);
	t.start();
	frame.setVisible(true);
	}

}
class MyJPanel31 extends JPanel implements Runnable{
	//����������
	int count=10;
	int xs[]=new int[count];
	int ys[]=new int[count];
	int rs[]=new int[count];
	int dirs[]=new int[count];
	int speeds[]=new int[count];
	Color colors[]=new Color[count];
	Random ran=new Random();
	public  MyJPanel31() {
		
		//ѭ������ʼ����ֵ
		for(int i=0;i<count;i++){
			
			rs[i]=ran.nextInt(21)+10;
			xs[i]=ran.nextInt(300-2*rs[i]-17);
			ys[i]=ran.nextInt(400-2*rs[i]-37);
			dirs[i]=ran.nextInt(4);
			speeds[i]=ran.nextInt(5)+1;
		    int rgbR=ran.nextInt(256);
		    int rgbG=ran.nextInt(256);
		    int rgbB=ran.nextInt(256);
			colors[i]=new Color(rgbR,rgbG,rgbB);
		}
	}
	
	//int dir=1;
	//int dir=2;
	//int dir=3;//0���£�1����  2���� 3����
	
	public void paint(Graphics g) {
		super.paint(g);
		for(int i=0;i<count;i++){
			
			g.setColor(colors[i]);
			g.fillOval(xs[i], ys[i], 2*rs[i], 2*rs[i]);
			
		}
	}//ʵ��
	public void run(){
		while(true){
			for (int i=0;i<count;i++){
			//���ݷ���ı�С�������
				if(dirs[i]==0){//xs[i]=xs[i]+speeds[i]    x++= x=x+1
					/*x = x+5;
					x+=5;//ÿ��+5
					x++;//ÿ��+1
*/					xs[i]+=speeds[i];
					ys[i]+=speeds[i];
				}
				if(dirs[i]==1){
					xs[i]-=speeds[i];
					ys[i]+=speeds[i];
				}
				if(dirs[i]==2){
					xs[i]-=speeds[i];
					ys[i]-=speeds[i];
				}
				if(dirs[i]==3){
					xs[i]+=speeds[i];
					ys[i]-=speeds[i];
				}
			//�Д�С���Ƿ��_߅�磬���Ǆt����
			//300-d-17
			//400-d-37
				if(xs[i]<=0){
					if(dirs[i]==2){
						dirs[i]=3;
					}else{
						dirs[i]=0;
					}
				}
				if(ys[i]<=0){
					if(dirs[i]==3){
						dirs[i]=0;
					}else{
						dirs[i]=1;
					}
				}
				if(xs[i]>=300-2*rs[i]-17){
					if(dirs[i]==0){
						dirs[i]=1;
					}else{
						dirs[i]=2;
					}
				}
				if(ys[i]>=400-2*rs[i]-37){
					if(dirs[i]==1){
						dirs[i]=2;
					}else{
						dirs[i]=3;
					}
				}
			}
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			repaint();
		}
	}
}
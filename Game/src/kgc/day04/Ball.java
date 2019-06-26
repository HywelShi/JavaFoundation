package kgc.day04;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	//1������С���������
	private int x;
	private int y;
	private int r;
	private int dir;
	private int speed;
	private Color color;
	//3����װһ����ͼ�ķ���
	public void myPaint(Graphics g){
		g.setColor(color);
		g.fillOval(x, y, 2*r, 2*r);
	}
	//4����װһ���ƶ��ķ���
	public void move(int width,int height){
		//���ݷ���ı�С�������
		if(dir==0){
			x+=speed;
			y+=speed;
		}else if(dir==1){
			x-=speed;
			y+=speed;
		}else if(dir==2){
			x-=speed;
			y-=speed;
		}else if(dir==3){
			x+=speed;
			y-=speed;
		}
		//�ж��Ƿ���ײ���߽磬�����ײ���߽���Ҫ����
		//300-d-17
		//400-d-37
		if(x<=0){//��߽�
			if(dir==2){
				dir =3;
			}else{
				dir = 0;
			}
		}
		if(y<=0){
			if(dir==3){
				dir=0;
			}else{
				dir = 1;
			}
		}
		if(x>=width-2*r-17){//�ұ߽�
			if(dir==0){
				dir = 1;
			}else{
				dir = 2;
			}
		}
		if(y>=height-2*r-37){//�±߽�
			if(dir ==1){
				dir = 2;
			}else{
				dir = 3;
			}
		}
	}
	//2������getters��setters
	/*public void setXxx(����  xxx){
		this.xxx = xxx;
	}
	public ����  getXxx(){
		return xxx;
	}*/
	//Alt+Shift+s->r->Select All->OK
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getDir() {
		return dir;
	}
	public void setDir(int dir) {
		this.dir = dir;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
}

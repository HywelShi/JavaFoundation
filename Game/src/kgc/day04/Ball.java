package kgc.day04;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	//1、定义小球类的属性
	private int x;
	private int y;
	private int r;
	private int dir;
	private int speed;
	private Color color;
	//3、封装一个绘图的方法
	public void myPaint(Graphics g){
		g.setColor(color);
		g.fillOval(x, y, 2*r, 2*r);
	}
	//4、封装一个移动的方法
	public void move(int width,int height){
		//根据方向改变小球的坐标
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
		//判断是否碰撞到边界，如果碰撞到边界需要反弹
		//300-d-17
		//400-d-37
		if(x<=0){//左边界
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
		if(x>=width-2*r-17){//右边界
			if(dir==0){
				dir = 1;
			}else{
				dir = 2;
			}
		}
		if(y>=height-2*r-37){//下边界
			if(dir ==1){
				dir = 2;
			}else{
				dir = 3;
			}
		}
	}
	//2、生产getters和setters
	/*public void setXxx(类型  xxx){
		this.xxx = xxx;
	}
	public 类型  getXxx(){
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

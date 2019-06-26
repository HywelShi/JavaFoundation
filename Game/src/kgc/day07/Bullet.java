package kgc.day07;

import java.awt.Graphics;
import java.awt.Image;

public class Bullet {
	private int x;
	private int y;
	private int speed;
	private Image img;
	private int width;
	private int height;
	public void paint(Graphics g){
		g.drawImage(img, x, y, width, height, null);
	}
	public void move(){
		y=y-speed;
	}
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

	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public Image getImg() {
		return img;
	}
	public void setImg(Image img) {
		this.img = img;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

		
	

}


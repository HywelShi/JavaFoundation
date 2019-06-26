package day01;


import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameStart {

	public static void main(String[] args) {
		//1.创建窗口
		JFrame jf = new JFrame();
		//2.设置标题
		jf.setTitle("飞机大战");
		//3.调整大小
		jf.setSize(430, 640);
		//4.调整位置 相对于屏幕居中
		jf.setLocationRelativeTo(null);
		//5.设置关闭方式操作
		jf.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE);
		//9.将纸添加到窗口上
		JPanel01 jp = new JPanel01();
		jf.add(jp);
		//6.显示
		jf.setVisible(true);
	}
}
//7.表示画纸
class JPanel01 extends JPanel{
	//10.先将图片加载进来
	ImageIcon i = new ImageIcon("img/bg3.jpg");
	Image bg = i.getImage();
	ImageIcon j = new ImageIcon("img/hero.png");
	Image hero = j.getImage();
	//8.表示绘画方法 Graphics表示画笔
	public void paint(Graphics g){
		//11.绘制作图片
		g.drawImage(bg, 0, 0,430,640,null);
		g.drawImage(hero, 165, 400,100,100,null);
	}
}













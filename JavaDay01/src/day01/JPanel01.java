package day01;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;
/**
 * 继承：当JPanel01继承JPanel的时候
 * JPanel里面的所有的属性和行为JPanel01里面全有
 * 并且JPanel01里面还可以写属于自己的东西
 * 
 * JPanel里面绘画方法什么都没有画
 * 
 * @author Administrator
 *
 */

//7.自定义画布  继承原生态画布JPanel
public class JPanel01 extends JPanel {
	
	//8.绘画方法 可以画自己想画的内容
	public void paint(Graphics g){
		
		//将星星的坐标x y随机产生
		//x 在0-400范围 y 在0-600范围
		//java当中产生a-b之间的随机整数公式
		//(int)(Math.random(b-a+1)+a)
		for(int i=1;i<=100;i++){
			int x = (int)(Math.random()*401);
			int y = (int)(Math.random()*600);
			g.setColor(Color.WHITE);
			//星星的大小随机产生 10-50之间
			int z = (int)(Math.random()*41+10);
			g.setFont(new Font("宋体", Font.BOLD, z));
			g.drawString("★", x, y);
		}
		
	}
}














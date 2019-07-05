package day01;

import java.awt.Color;

//将别人写好的类拿过来使用
import javax.swing.JFrame;

public class JFrame01 {
	//只能提示快捷键Alt+?
	public static void main(String[] args) {
		//1.从JFrame窗口类中取出具体的一个对象
		JFrame j = new JFrame();
		//3.指定窗口宽和高
		j.setSize(400, 600);
		//4.调整位置 
		//j.setLocation(312,84);
		//自动居中
		j.setLocationRelativeTo(null);
		//5.设置点击x彻底关闭程序  防止程序多次运行卡死
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//6.设置标题
		j.setTitle("满天星");
		//10.设置背景颜色为黑色
		j.setBackground(Color.BLACK);
		//9.将画布添加到窗口上
		JPanel01 jp = new JPanel01();
		j.add(jp);
		
		
		//2.传入true可以将窗口显示出来
		j.setVisible(true);
		
	}
}

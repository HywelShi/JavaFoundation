package day01;


import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameStart {

	public static void main(String[] args) {
		//1.��������
		JFrame jf = new JFrame();
		//2.���ñ���
		jf.setTitle("�ɻ���ս");
		//3.������С
		jf.setSize(430, 640);
		//4.����λ�� �������Ļ����
		jf.setLocationRelativeTo(null);
		//5.���ùرշ�ʽ����
		jf.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE);
		//9.��ֽ��ӵ�������
		JPanel01 jp = new JPanel01();
		jf.add(jp);
		//6.��ʾ
		jf.setVisible(true);
	}
}
//7.��ʾ��ֽ
class JPanel01 extends JPanel{
	//10.�Ƚ�ͼƬ���ؽ���
	ImageIcon i = new ImageIcon("img/bg3.jpg");
	Image bg = i.getImage();
	ImageIcon j = new ImageIcon("img/hero.png");
	Image hero = j.getImage();
	//8.��ʾ�滭���� Graphics��ʾ����
	public void paint(Graphics g){
		//11.������ͼƬ
		g.drawImage(bg, 0, 0,430,640,null);
		g.drawImage(hero, 165, 400,100,100,null);
	}
}













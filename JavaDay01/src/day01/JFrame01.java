package day01;

import java.awt.Color;

//������д�õ����ù���ʹ��
import javax.swing.JFrame;

public class JFrame01 {
	//ֻ����ʾ��ݼ�Alt+?
	public static void main(String[] args) {
		//1.��JFrame��������ȡ�������һ������
		JFrame j = new JFrame();
		//3.ָ�����ڿ��͸�
		j.setSize(400, 600);
		//4.����λ�� 
		//j.setLocation(312,84);
		//�Զ�����
		j.setLocationRelativeTo(null);
		//5.���õ��x���׹رճ���  ��ֹ���������п���
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//6.���ñ���
		j.setTitle("������");
		//10.���ñ�����ɫΪ��ɫ
		j.setBackground(Color.BLACK);
		//9.���������ӵ�������
		JPanel01 jp = new JPanel01();
		j.add(jp);
		
		
		//2.����true���Խ�������ʾ����
		j.setVisible(true);
		
	}
}
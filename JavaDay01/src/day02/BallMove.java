package day02;

import javax.swing.JFrame;

public class BallMove {

	public static void main(String[] args) {
		//�½�һ��400*600�Ĵ��� ����С���ƶ�
		//�ڴ����ϻ���һ����С100*100 ����(0,0)�ĺ�ɫС��
		//������BallJPanel
		JFrame j = new JFrame();
		j.setSize(400, 600);
		j.setLocationRelativeTo(null);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setTitle("С���ƶ�");
		
		BallJPanel b = new BallJPanel();
		j.add(b);
		
		//10.�����߳�
		//����һ���̣߳�������b�Ž�ȥ�ﵽ����Ŀ��
		Thread t = new Thread(b);
		t.start();
		
		j.setVisible(true);
	}
}







package day02;

/**
 * �������һ��4λ��֤�� 
 * Ҫ�������ִ�дӢ����ĸСдӢ����ĸ���
 * 
 * @author Administrator
 *
 */
public class VerCode {

	public static void main(String[] args) {
		//������λ����ַ������֤��
		for(int i=1;i<=8;i++){
			int num = (int)(Math.random()*3+1);
			create(num);
		}
	}
	//�����ַ��ķ���
	public static void create(int num){
		char c = 0;//Ĭ���ǿ��ַ�
		switch(num){
		case 1://��������
			c = (char)(Math.random()*10+48);
			System.out.print(c);
			break;
		case 2://���ɴ�д��ĸ
			c = (char)(Math.random()*26+65);
			System.out.print(c);
			break;
		case 3://����Сд��ĸ
			c = (char)(Math.random()*26+97);
			System.out.print(c);
			break;
		}
	}
	
	

}








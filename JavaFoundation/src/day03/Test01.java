package day03;
/**
 * 1.����1-100֮������ܱ�3��������֮��
 * 2.����1-100֮���ų�3�ı��� ����3������֮��
 * 3.��ϰ������1-1000֮���ȥβ��Ϊ5�Ͱ�λΪ2��֮��
 * @author Administrator
 * 
 */
public class Test01 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=100;i++){
			if(i%3==0 || i%10==3 || i/10==3){
				//����
				continue;
			}
			sum += i ;
		}
		System.out.println(sum);
	}
}










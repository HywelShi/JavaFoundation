package day04;
/**
 * 1 2 3 4 5
 * ���һ����λ�� Ҫ����λ���඼����ͬ
 * ������
 * i j m n &&
 * @author Administrator
 *
 */
public class Test03 {
	public static void main(String[] args) {
		//�Ĳ�ѭ��
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				for (int m = 1; m <= 5; m++) {
					for (int n = 1; n <= 5; n++) {
						if(i!=j&&i!=m&&i!=n&&j!=m&&j!=n&&m!=n){
							System.out.println(1000*i+100*j+10*m+n);
						}
					}
				}
			}
		}
		
	}
}

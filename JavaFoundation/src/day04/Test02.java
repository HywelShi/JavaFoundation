package day04;
/**
 * 	��Ԫ��ټ����⣺
	��100��Ǯ
	����5��Ǯһֻ
	ĸ��3��Ǯһֻ
	С��1��Ǯ��ֻ
	���ʣ�
	100��Ǯ��100ֻ������Щ���䷽ʽ��
 * @author Administrator
 *
 */
public class Test02 {
	public static void main(String[] args) {
		for(int i=0;i<=20;i++){
			for(int j=0;j<=33;j++){
				for(int k=0;k<=300;k++){
					if((i+j+k==100)&&(5*i+3*j+k/3==100)
							&&(k%3==0)){
						System.out.println(
								"������"+i+"ֻ��ĸ����"+j
								+"ֻ��С��"+k+"ֻ");
					}
				}
			}
		}
	}
}







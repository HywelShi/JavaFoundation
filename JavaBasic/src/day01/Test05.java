package day01;

public class Test05 {
	public static void main(String[] args) {
		//�ж�72114��
		for(int i=0;i<=20;i++){
			for(int j=0;j<=33;j++){
				for(int k=0;k<=100;k++){
					if((i+j+k==100)&&(5*i+3*j+k/3==100)&&(k%3==0)){
						System.out.println("����"+i+"ĸ��"+j+"С��"+k);
					}
				}
			}
		}
		//ʱ�临�Ӷȵ�  �������ʿ� �ж�714
		for(int i=0;i<=20;i++){
			for(int j=0;j<=33;j++){
				if((5*i+3*j+(100-i-j)/3==100)&&(100-i-j)%3==0){
					System.out.println("����"+i+"ĸ��"+j+"С��"+(100-i-j));
				}
			}
		}
		
		
		
	}
}

package day04;

public class Test01 {

	public static void main(String[] args) {
		//���� ��Ƿ���
		// ��2-100֮�����е�����
		for(int num=2;num<=100;num++){
			int a = 1;
			//���������ƽ����������  ���Լ���ʱ�临�Ӷ�
			for(int i=2;i<=Math.sqrt(num);i++){
				if(num%i==0){
					a = 2;
				}
			}
			if(a==1){
				System.out.println(num);
				System.out.println("��������");
			}else{
				System.out.println(num);
				System.out.println("����������");
			}
		}
		

	}

}

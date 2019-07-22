package day01;

public class Test05 {
	public static void main(String[] args) {
		//判断72114次
		for(int i=0;i<=20;i++){
			for(int j=0;j<=33;j++){
				for(int k=0;k<=100;k++){
					if((i+j+k==100)&&(5*i+3*j+k/3==100)&&(k%3==0)){
						System.out.println("公鸡"+i+"母鸡"+j+"小鸡"+k);
					}
				}
			}
		}
		//时间复杂度低  运行速率快 判断714
		for(int i=0;i<=20;i++){
			for(int j=0;j<=33;j++){
				if((5*i+3*j+(100-i-j)/3==100)&&(100-i-j)%3==0){
					System.out.println("公鸡"+i+"母鸡"+j+"小鸡"+(100-i-j));
				}
			}
		}
		
		
		
	}
}

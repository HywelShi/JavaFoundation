package day02;
/**
 * 计算1-2+3-4+5-6...+99-100
 * @author Administrator
 *
 */
public class ForDemo01 {

	public static void main(String[] args) {
	
		/**练习：
		 * 计算1/2+2/3+3/4+...+9/10的和
		 */
		
		/**练习：
		 * 计算1/2+2/3+3/4+...
		 * 问加到第几项和会大于10
		 */
		double sum = 0;
		double i = 1;
		do{
			sum = sum +i/(i+1);
			i++;//i = i+2; i+=2;
			System.out.println(sum);
		}while(sum<=10);
		System.out.println(i-1);
		
		double s = 0;
		double j = 1;
		while(true){
			if(s>=10){
				System.out.println(i-1);
				break;
			}
			s = s+j/(j+1);
			j++;
		}
		
		
		
		
		
		
		
		

	}

}

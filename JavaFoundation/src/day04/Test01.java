package day04;
/**
 * 循环嵌套 打印输出5*5的图形
 * for双层循环 外层控制行 内层控制列
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}







package day05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		//ʱ���Ǹ���ϵͳʱ���ȡ
		Date date = new Date();
		System.out.println(date);
		
		//��ʱ�䰴��ָ���ĸ�ʽ���
		//2019-07-26 16:25:30
		//SimpleDateFormat���Խ�Date����ָ���ĸ�ʽ���
		//yyyy��� MM�·� dd���� 
		//hh12Сʱ�� HH24Сʱ�� mm�� ss��
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		
	}

}









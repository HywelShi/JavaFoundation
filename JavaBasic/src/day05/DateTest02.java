package day05;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTest02 {
	public static void main(String[] args) {
		//����100��������
		//����100��ǰ������
		//Calendar������ ���Լ��������֮��
		//Calendar.WEEK_OF_MONTH ���������֮�����֮ǰ
		//Calendar.DAY_OF_MONTH ���������֮�����֮ǰ
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 100);
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
	}
}









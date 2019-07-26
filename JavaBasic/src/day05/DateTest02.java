package day05;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTest02 {
	public static void main(String[] args) {
		//计算100天后的日期
		//计算100天前的日期
		//Calendar日历类 可以计算多少天之后
		//Calendar.WEEK_OF_MONTH 计算多少周之后或者之前
		//Calendar.DAY_OF_MONTH 计算多少天之后或者之前
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 100);
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
	}
}









package day05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		//时间是根据系统时间获取
		Date date = new Date();
		System.out.println(date);
		
		//让时间按照指定的格式输出
		//2019-07-26 16:25:30
		//SimpleDateFormat可以将Date按照指定的格式输出
		//yyyy年份 MM月份 dd日期 
		//hh12小时制 HH24小时制 mm分 ss秒
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		
	}

}









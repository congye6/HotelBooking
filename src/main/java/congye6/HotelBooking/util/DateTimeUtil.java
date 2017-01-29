package congye6.HotelBooking.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {
	
	
	private static final String FORMAT = "yyyy-MM-dd HH:mm";

	/**
	 * 根据字符串获取datetime
	 * 格式yyyy-MM-dd HH
	 * @param str
	 * @return
	 * 2017年1月15日
	 */
	public static Date getDateTime(String str){
		SimpleDateFormat sdf=new SimpleDateFormat(FORMAT);
		sdf.setLenient(false); //是否是严格的匹配
		Date date=null;
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * 是否为未来时间
	 * 格式yyyy-MM-dd HH:mm
	 * @param str
	 * @return
	 * 2017年1月29日
	 */
	public static boolean isFutureTime(String str){
		Date date=getDateTime(str);
		if(date==null)
			return false;
		Date today=new Date();
		return today.before(date);
	}
	
	public static boolean isPastTime(String str){
		Date date=getDateTime(str);
		if(date==null)
			return false;
		Date today=new Date();
		return today.after(date);
	}
	
	/**
	 * 判断是否符合yyyy-MM-dd HH:mm格式
	 * @param str
	 * @return
	 * 2017年1月29日
	 */
	public static boolean isDateTime(String str){
		Date date=getDateTime(str);
		if(date==null)
			return false;
		return true;
	}
	
	/**
	 * 两个时间相减
	 * 返回分钟数
	 * @param minuend 被减数
	 * @param subtrahend 减数
	 * @return
	 * 2017年1月29日
	 */
	public static long minus(Date minuend,Date subtrahend){
		//相差的毫秒数
		long millis=minuend.getTime()-subtrahend.getTime();
		return millis/1000/60;
	}

}

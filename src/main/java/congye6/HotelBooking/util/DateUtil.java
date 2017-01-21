package congye6.HotelBooking.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	private static final String FORMAT="yyyy-mm-dd";

	/**
	 * 是否为过去的日期
	 * @return
	 * 2017年1月15日
	 */
	public static boolean isPastDate(String str){
		//不符合格式
		if(!StringUtil.isDate(str))
			return false;
		Date date=getDate(str);
		if(date==null)
			return false;
		Date today=new Date();
		return today.after(date);
	}
	
	/**
	 * 是否为未来时间
	 * @param str
	 * @return
	 * 2017年1月20日
	 */
	public static boolean isFutureDate(String str){
		//不符合格式
		if(!StringUtil.isDate(str))
			return false;
		Date date=getDate(str);
		if(date==null)
			return false;
		Date today=new Date();
		return today.before(date);
	}
	
	/**
	 * 获得今天日期
	 * 格式yyyy-mm-dd
	 * @return
	 * 2017年1月21日
	 */
	public static String getToday(){
		Date today=new Date();
		return toStr(today);
	}
	
	/**
	 * 根据字符串获取date
	 * 格式yyyy-MM-dd
	 * @param str
	 * @return
	 * 2017年1月15日
	 */
	public static Date getDate(String str){
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
	 * 将date转换为字符串
	 * 格式yyyy-mm-dd
	 * @param date
	 * @return
	 * 2017年1月21日
	 */
	public static String toStr(Date date){
		SimpleDateFormat sdf=new SimpleDateFormat(FORMAT);
		return sdf.format(date);
	}
}

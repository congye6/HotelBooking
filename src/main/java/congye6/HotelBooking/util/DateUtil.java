package congye6.HotelBooking.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

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
	 * 根据字符串获取date
	 * 格式yyyy-MM-dd
	 * @param str
	 * @return
	 * 2017年1月15日
	 */
	public static Date getDate(String str){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		sdf.setLenient(false); //是否是严格的匹配
		Date date=null;
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
}

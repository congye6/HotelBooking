package congye6.HotelBooking.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

	public static final String PHONE_NUMBER_PATTERN="[1][0-9]{10}";
	
	/**
	 * 检验字符串是否为null或者长度wei0
	 * @param str
	 * @return
	 * 2017年1月14日
	 */
	public static boolean isNull(String str){
		if(str==null||str.length()==0)
			return true;
		return false;
	}
	
	/**
	 * 封装java正则表达式的判断
	 * 判断str是否符合patternStr
	 * @param str
	 * @param patternStr
	 * @return
	 * 2017年1月15日
	 */
	public static boolean isMatch(String str,String patternStr){
		if(isNull(patternStr)||isNull(str))
			return false;
		Pattern pattern=Pattern.compile(patternStr);
		Matcher matcher=pattern.matcher(str);
		return matcher.matches();
	}
	
	/**
	 * 检验是否为手机号码
	 * @param str
	 * @return
	 * 2017年1月15日
	 */
	public static boolean isPhoneNumber(String str){
		if(isNull(str))
			return false;
		return isMatch(str, "[1][0-9]{10}");
	}
	/**
	 * 判断是否符合yyyy-mm-dd的格式
	 */
	public static boolean isDate(String str){
		if(isNull(str))
			return false;
		if(!isMatch(str, "[0-9]{4}\\-[0-9]{2}\\-[0-9]{2}"))
			return false;
		String[] date=str.split("-");
		//月份小于12
		int month=Integer.parseInt(date[1]);
		if(month<=0||month>12)
			return false;
		//天数小于31
		int day=Integer.parseInt(date[2]);
		if(day<=0||day>31)
			return false;
		
		return true;
	}
	
}

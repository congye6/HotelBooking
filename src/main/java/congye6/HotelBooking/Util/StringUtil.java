package congye6.HotelBooking.Util;

import java.util.regex.Pattern;

public class StringUtil {

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
	
	public static boolean isPhoneNumber(String str){
		if(isNull(str))
			return false;
		Pattern phoneNumberPattern=Pattern.compile("^[1][0-9]{10}");
		
		return true;
	}
	
}

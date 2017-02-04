package congye6.HotelBooking.util;

import java.io.UnsupportedEncodingException;

public class Utf8EncodingUtil {

	/**
	 * 转换成utf-8中文
	 * @param src
	 * @return
	 * 2017年2月4日
	 */
	public static String toUtf8(String src){
		String result=null;
		try {
			result = new String(src.getBytes("ISO-8859-1"), "utf8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return result;
	}
	
}

package congye6.HotelBooking.util;

import java.math.BigDecimal;

public class DoubleUtil {

	/**
	 * 将double保留n位小数
	 * @param num
	 * @param digits
	 * @return
	 * 2017年1月22日
	 */
	public static double round(double num,int digits){
		BigDecimal b = new BigDecimal(num);
		double f1 = b.setScale(digits, BigDecimal.ROUND_HALF_UP).doubleValue();
		return f1;
	}
	
}

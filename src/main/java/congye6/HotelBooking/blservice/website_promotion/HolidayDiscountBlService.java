package congye6.HotelBooking.blservice.website_promotion;

import congye6.HotelBooking.vo.ResultMessage;

public interface HolidayDiscountBlService {
	/**
	 * 设置假日折扣
	 * @author congye6
	 * @param discount
	 * @return
	 */
	public ResultMessage setHolidayDiscount(double discount);
	
	/**
	 * 查看假日折扣
	 * @return
	 * 2017年2月2日
	 */
	public double getHolidayDiscount();
}

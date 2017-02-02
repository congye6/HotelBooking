package congye6.HotelBooking.mapper.site_promotion;
/**
 * 网站节假日折扣
 * @author 周聪
 * 2017年1月12日
 */
public interface HolidayDiscountMapper {
	
	/**
	 * 更新节假日折扣
	 * @param discount
	 * 2017年1月12日
	 */
	public void setDiscount(double discount);
	
	/**
	 * 获取节假日折扣
	 * @return
	 * 2017年1月12日
	 */
	public Double getDiscount();
}

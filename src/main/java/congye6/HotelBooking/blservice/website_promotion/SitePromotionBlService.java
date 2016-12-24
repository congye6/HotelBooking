package congye6.HotelBooking.blservice.website_promotion;

import java.util.List;

import congye6.HotelBooking.vo.OrderVO;
import congye6.HotelBooking.vo.ResultMessage;
import congye6.HotelBooking.vo.VipDiscountVO;

/**
 * @author congye6
 * 2016年12月24日
 * 下午12:04:20
 */
public interface SitePromotionBlService {
	/**
	 * 获取折扣
	 * @author congye6
	 * @param order
	 * @return
	 */
	public double getDiscount(OrderVO order);
	
	/**
	 * 设置假日折扣
	 * @author congye6
	 * @param discount
	 * @return
	 */
	public ResultMessage setHolidayDiscount(double discount);
	
	/**
	 * 设置VIP折扣
	 * 不同vip不同商圈有不同折扣
	 * @author congye6
	 * @param discount
	 * @return
	 */
	public ResultMessage setVipDiscount(VipDiscountVO discount);
	
	public ResultMessage setVipDiscount(List<VipDiscountVO> discounts);
}

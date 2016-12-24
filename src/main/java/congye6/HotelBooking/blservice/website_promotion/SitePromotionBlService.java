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
	public double getDiscount(OrderVO order);
	
	public ResultMessage setHolidayDiscount(double discount);
	
	public ResultMessage setVipDiscount(VipDiscountVO discount);
	
	public ResultMessage setVipDiscount(List<VipDiscountVO> discounts);
}

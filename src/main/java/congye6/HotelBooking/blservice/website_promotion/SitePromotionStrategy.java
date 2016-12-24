package congye6.HotelBooking.blservice.website_promotion;

import congye6.HotelBooking.vo.OrderVO;

/**
 * @author congye6
 * 2016年12月24日
 * 下午2:34:20
 */
public interface SitePromotionStrategy {
	public double getDiscount(OrderVO vo);
}

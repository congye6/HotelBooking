package congye6.HotelBooking.blservice.website_promotion;

import congye6.HotelBooking.vo.OrderVO;

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
	
}

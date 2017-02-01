package congye6.HotelBooking.blservice.hotel_promotion;

import congye6.HotelBooking.vo.OrderVO;

/**
 * @author congye6
 * 2016年12月24日
 * 下午12:00:55
 */
public interface HotelPromotionStrategy {

	/**
	 * 获取折扣价
	 * @author congye6
	 * @param vo
	 * @return
	 */
	public double getPrice(OrderVO vo);
}

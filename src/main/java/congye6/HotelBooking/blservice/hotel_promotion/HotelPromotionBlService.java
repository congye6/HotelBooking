package congye6.HotelBooking.blservice.hotel_promotion;

import java.util.List;

import congye6.HotelBooking.po.DiscountPO;
import congye6.HotelBooking.vo.DiscountVO;
import congye6.HotelBooking.vo.OrderVO;
import congye6.HotelBooking.vo.ResultMessage;



/**
 * 酒店促销
 * @author congye6
 * 2016年12月24日
 * 上午11:45:49
 */
public interface HotelPromotionBlService {
	/**
	 * 进行多种策略折扣的计算
	 * 选择最低折扣
	 * @author congye6
	 * @param order
	 * @return
	 */
	public double getPrice(OrderVO order);
	
	
}

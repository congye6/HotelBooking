package congye6.HotelBooking.blservice.hotel_promotion;

import java.util.List;

import congye6.HotelBooking.vo.DiscountVO;
import congye6.HotelBooking.vo.OrderVO;
import congye6.HotelBooking.vo.ResultMessage;

/**
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
	public double getDiscount(OrderVO order);
	
	/**
	 * 设置折扣
	 * @author congye6
	 * @param vo
	 * @return
	 */
	public ResultMessage setDiscount(DiscountVO vo);
	
	/**
	 * 设置多个折扣
	 * @author congye6
	 * @param vo
	 * @return
	 */
	public ResultMessage setDiscount(List<DiscountVO> vo);
}
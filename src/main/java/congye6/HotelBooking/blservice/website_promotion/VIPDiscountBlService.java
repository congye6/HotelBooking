package congye6.HotelBooking.blservice.website_promotion;

import java.util.List;

import congye6.HotelBooking.vo.ResultMessage;
import congye6.HotelBooking.vo.VipDiscountVO;

public interface VIPDiscountBlService {
	/**
	 * 设置VIP折扣
	 * 不同vip不同商圈有不同折扣
	 * @author congye6
	 * @param discount
	 * @return
	 */
	public ResultMessage setVipDiscount(VipDiscountVO discount);
	
	/**
	 * 设置多个折扣
	 * @param discounts
	 * @return
	 * 2017年1月12日
	 */
	public ResultMessage setVipDiscount(List<VipDiscountVO> discounts);
	
	/**
	 * 查看各vip的折扣
	 * @return
	 * 2017年2月2日
	 */
	public List<VipDiscountVO> getVIPDiscount(String circle);
}

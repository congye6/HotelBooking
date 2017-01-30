package congye6.HotelBooking.blservice.hotel_promotion.impl.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.client.ClientBlService;
import congye6.HotelBooking.blservice.hotel_promotion.HotelPromotionStrategy;
import congye6.HotelBooking.enumeration.HotelPromotionType;
import congye6.HotelBooking.mapper.hotel_promotion.DiscountMapper;
import congye6.HotelBooking.util.DateUtil;
import congye6.HotelBooking.vo.ClientVO;
import congye6.HotelBooking.vo.OrderVO;
@Service("birthday")
public class BirthdayPromotion implements HotelPromotionStrategy{

	@Autowired
	private DiscountMapper mapper;
	
	@Autowired
	private ClientBlService clientBl;
	
	@Override
	/**
	 * 生日折扣
	 */
	public double getDiscount(OrderVO order) {
		Double discount=mapper.getDiscount(order.hotelId, HotelPromotionType.BIRTHDAY.toString());
		//没有折扣
		if(discount==null)
			return 1;
		
		ClientVO client=clientBl.getClientInfo(order.userId);
		if(client==null||client.birthday==null)
			return 1;
		String today=DateUtil.getToday();
		if(!today.equals(client.birthday))
			return 1;
		return discount;
	}

}

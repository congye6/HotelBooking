package congye6.HotelBooking.blservice.hotel_promotion.impl.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.client.ClientBlService;
import congye6.HotelBooking.blservice.client.ClientPromotionValidatorService;
import congye6.HotelBooking.blservice.hotel_promotion.HotelPromotionStrategy;
import congye6.HotelBooking.enumeration.HotelPromotionType;
import congye6.HotelBooking.mapper.hotel_promotion.DiscountMapper;
import congye6.HotelBooking.util.DateUtil;
import congye6.HotelBooking.vo.ClientVO;
import congye6.HotelBooking.vo.OrderVO;
@Service("BIRTHDAY")
public class BirthdayPromotion implements HotelPromotionStrategy{

	@Autowired
	private DiscountMapper mapper;
	
	@Autowired
	private ClientPromotionValidatorService clientService;
	
	@Autowired
	private PriceCalculator priceCalculator;
	
	@Override
	/**
	 * 生日折扣
	 */
	public double getPrice(OrderVO order) {
		double originalPrice=priceCalculator.getOriginalPrice(order.hotelId, order.roomOrder);
		
		Double discount=mapper.getDiscount(order.hotelId, HotelPromotionType.BIRTHDAY.toString());
		//没有折扣
		if(discount==null)
			return originalPrice;
		
		if(!clientService.isBirthday(order.userId))
			return originalPrice;
		return discount*originalPrice;
	}

}

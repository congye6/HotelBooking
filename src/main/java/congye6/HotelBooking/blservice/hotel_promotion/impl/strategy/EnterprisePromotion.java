package congye6.HotelBooking.blservice.hotel_promotion.impl.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.client.ClientBlService;
import congye6.HotelBooking.blservice.client.ClientPromotionValidatorService;
import congye6.HotelBooking.blservice.hotel_promotion.HotelPromotionStrategy;
import congye6.HotelBooking.enumeration.HotelPromotionType;
import congye6.HotelBooking.mapper.hotel_promotion.DiscountMapper;
import congye6.HotelBooking.vo.OrderVO;

@Service("COOPERATIVE_ENTERPRISE")
public class EnterprisePromotion implements HotelPromotionStrategy{

	@Autowired
	private DiscountMapper mapper;
	
	@Autowired
	private ClientPromotionValidatorService clientService;
	
	@Autowired
	private PriceCalculator priceCalculator;
	
	@Override
	public double getPrice(OrderVO order) {
		double originalPrice=priceCalculator.getOriginalPrice(order.hotelId, order.roomOrder);
		
		Double discount=mapper.getDiscount(order.hotelId, 
				HotelPromotionType.COOPERATIVE_ENTERPRISE.toString());
		//没有折扣
		if(discount==null)
			return originalPrice;
		if(!clientService.isCooperativeEnterprise(order.userId))
			return originalPrice;
		return discount*originalPrice;
	}

}

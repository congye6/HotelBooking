package congye6.HotelBooking.blservice.hotel_promotion.impl.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.hotel_promotion.HotelPromotionStrategy;
import congye6.HotelBooking.enumeration.HotelPromotionType;
import congye6.HotelBooking.mapper.hotel_promotion.DiscountMapper;
import congye6.HotelBooking.vo.OrderVO;

@Service("TRIPLE_ROOM")
public class TripleRoomPromotion implements HotelPromotionStrategy{

	@Autowired
	private DiscountMapper mapper;
	
	@Override
	public double getPrice(OrderVO order) {
		Double discount=mapper.getDiscount(order.hotelId,
				HotelPromotionType.TRIPLE_ROOM.toString());
		if(discount==null)
			return 1;
		return discount;
	}
	

}

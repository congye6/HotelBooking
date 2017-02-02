package congye6.HotelBooking.blservice.hotel_promotion.impl.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.hotel_promotion.HotelPromotionStrategy;
import congye6.HotelBooking.enumeration.HotelPromotionType;
import congye6.HotelBooking.enumeration.RoomType;
import congye6.HotelBooking.mapper.hotel_promotion.DiscountMapper;
import congye6.HotelBooking.vo.OrderVO;

@Service("TRIPLE_ROOM")
public class TripleRoomPromotion implements HotelPromotionStrategy{

	@Autowired
	private DiscountMapper mapper;
	
	@Override
	public double getPrice(OrderVO order) {
		PriceCalculator priceCalculator=new PriceCalculator(order.hotelId);
		double originalPrice=priceCalculator.getOriginalPrice(order.hotelId, order.roomOrder);
		Double discount=mapper.getDiscount(order.hotelId,
				HotelPromotionType.TRIPLE_ROOM.toString());
		//没有折扣
		if(discount==null)
			return originalPrice;
		//没有三人间
		if(!order.roomOrder.containsKey(RoomType.TRIPLE))
			return originalPrice;
		
		int numOfTriple=order.roomOrder.get(RoomType.TRIPLE);
		order.roomOrder.remove(RoomType.TRIPLE);
		double tripleRoomPrice=numOfTriple*priceCalculator.getPrice(RoomType.TRIPLE);
		double otherRoomPrice=priceCalculator.getOriginalPrice(order.hotelId, order.roomOrder);
		
		return tripleRoomPrice+otherRoomPrice;
	}
	

}

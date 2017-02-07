package congye6.HotelBooking.blservice.hotel_promotion.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.hotel_promotion.DiscountBlService;
import congye6.HotelBooking.blservice.hotel_promotion.HotelPromotionBlService;
import congye6.HotelBooking.blservice.hotel_promotion.HotelPromotionStrategy;
import congye6.HotelBooking.util.SpringContextUtil;
import congye6.HotelBooking.vo.DiscountVO;
import congye6.HotelBooking.vo.OrderVO;
@Service
public class HotelPromotionBl implements HotelPromotionBlService{

	@Autowired
	private DiscountBlService discountBl;
	
	@Override
	public double getPrice(OrderVO order) {
		List<DiscountVO> discounts=discountBl.getDiscountByHotel(order.hotelId);
		double lowestPrice=Integer.MAX_VALUE;
		for(DiscountVO discount:discounts){
			HotelPromotionStrategy promotion=
					SpringContextUtil.getBean(discount.promotionType.toString());
			double price=promotion.getPrice(order);
			//选择最低价格
			if(price<lowestPrice)
				lowestPrice=price;
		}
		return lowestPrice;
	}

	

}

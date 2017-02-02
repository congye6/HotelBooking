package congye6.HotelBooking.blservice.website_promotion.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.website_promotion.SitePromotionBlService;
import congye6.HotelBooking.blservice.website_promotion.SitePromotionStrategy;
import congye6.HotelBooking.vo.OrderVO;
@Service
public class SitePromotionBl implements SitePromotionBlService{

	@Autowired
	@Qualifier("holiday")
	private SitePromotionStrategy holidayPromotion;
	
	@Autowired
	@Qualifier("vip")
	private SitePromotionStrategy vipPromotion;
	
	@Override
	public double getDiscount(OrderVO order) {
		double vipDiscount=vipPromotion.getDiscount(order);
		double holidayDiscount=holidayPromotion.getDiscount(order);
		return vipDiscount*holidayDiscount;
	}

}

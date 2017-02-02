package congye6.HotelBooking.blservice.website_promotion.impl.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.client.ClientBlService;
import congye6.HotelBooking.blservice.client.LevelBlService;
import congye6.HotelBooking.blservice.hotel.HotelBlService;
import congye6.HotelBooking.blservice.website_promotion.SitePromotionStrategy;
import congye6.HotelBooking.mapper.site_promotion.VipDiscountMapper;
import congye6.HotelBooking.vo.ClientVO;
import congye6.HotelBooking.vo.HotelVO;
import congye6.HotelBooking.vo.OrderVO;

@Service("vip")
public class VipPromotion implements SitePromotionStrategy{

	@Autowired
	private VipDiscountMapper mapper;
	
	@Autowired
	private ClientBlService clientBl;
	
	@Autowired
	private HotelBlService hotelBl;
	
	@Autowired
	private LevelBlService levelBl;
	
	@Override
	public double getDiscount(OrderVO order) {
		ClientVO client=clientBl.getClientInfo(order.userId);
		if(client==null)
			return 1;
		HotelVO hotel=hotelBl.getHotel(order.hotelId);
		if(hotel==null)
			return 1;
		
		Double discount=mapper.getDiscount(hotel.circle, levelBl.getLevel(client.credit));
		if(discount==null)
			return 1;
		
		return discount;
	}

}

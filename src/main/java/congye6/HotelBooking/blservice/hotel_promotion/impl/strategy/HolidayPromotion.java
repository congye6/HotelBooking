package congye6.HotelBooking.blservice.hotel_promotion.impl.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.hotel_promotion.HotelPromotionStrategy;
import congye6.HotelBooking.enumeration.HotelPromotionType;
import congye6.HotelBooking.mapper.hotel_promotion.DiscountMapper;
import congye6.HotelBooking.util.DateUtil;
import congye6.HotelBooking.vo.OrderVO;

@Service("HOLIDAY")
public class HolidayPromotion implements HotelPromotionStrategy{

	@Autowired
	private DiscountMapper mapper;
	
	@Autowired
	private PriceCalculator priceCalculator;
	
	@Override
	public double getPrice(OrderVO order) {
		double originalPrice=priceCalculator.getOriginalPrice(order.hotelId, order.roomOrder);
		
		Double discount=mapper.getDiscount(order.hotelId, HotelPromotionType.HOLIDAY.toString());
		if(discount==null)
			return originalPrice;
		
		if(isHoliday())
			return discount*originalPrice;
		else
			return originalPrice;
	}
	
	private boolean isHoliday(){
	
		String str=DateUtil.getToday();
		String today=str.substring(5);
		
		List<String> holidays=getHolidays();
		
		return holidays.contains(today);
	}
	
	/**
	 * 获取有折扣的假期
	 * @return
	 * 2017年2月1日
	 */
	private List<String> getHolidays(){
		List<String> holidays=new ArrayList<>();
		holidays.add("11-11");
		holidays.add("01-01");
		holidays.add("10-01");
		return holidays;
	}

}

package congye6.HotelBooking.blservice.website_promotion.impl.strategy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.website_promotion.SitePromotionStrategy;
import congye6.HotelBooking.mapper.site_promotion.HolidayDiscountMapper;
import congye6.HotelBooking.util.DateUtil;
import congye6.HotelBooking.vo.OrderVO;

@Service("holiday")
public class HolidayPromotion implements SitePromotionStrategy{

	@Autowired
	private HolidayDiscountMapper mapper;
	
	@Override
	public double getDiscount(OrderVO vo) {
		if(!isHoliday())
			return 1;
		double discount=mapper.getDiscount();
		return discount;
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

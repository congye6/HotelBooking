package congye6.HotelBooking.blservice.website_promotion.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.website_promotion.HolidayDiscountBlService;
import congye6.HotelBooking.mapper.site_promotion.HolidayDiscountMapper;
import congye6.HotelBooking.vo.ResultMessage;
@Service
public class HolidayDiscountBl implements HolidayDiscountBlService{

	@Autowired
	private HolidayDiscountMapper mapper;
	
	@Override
	public ResultMessage setHolidayDiscount(double discount) {
		if(discount>1.0||discount<0.0)
			return new ResultMessage(false, "折扣在0-1之间哦");
		mapper.setDiscount(discount);
		return new ResultMessage(true);
	}

	@Override
	public double getHolidayDiscount() {
		Double discount=mapper.getDiscount();
		if(discount==null)
			return 1;
		return discount;
	}

}

package congye6.HotelBooking.blservice.hotel_promotion.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.hotel_promotion.HotelPromotionBlService;
import congye6.HotelBooking.mapper.hotel_promotion.DiscountMapper;
import congye6.HotelBooking.po.DiscountPO;
import congye6.HotelBooking.vo.DiscountVO;
import congye6.HotelBooking.vo.OrderVO;
import congye6.HotelBooking.vo.ResultMessage;
@Service
public class HotelPromotionBl implements HotelPromotionBlService{

	@Autowired
	private DiscountMapper mapper;
	
	@Override
	public double getDiscount(OrderVO order) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ResultMessage setDiscount(DiscountVO vo) {
		DiscountPO po=vo.getPO();
		mapper.setDiscount(po);
		return new ResultMessage(true);
	}

	@Override
	public ResultMessage setDiscount(List<DiscountVO> list) {
		for(DiscountVO vo:list){
			this.setDiscount(vo);
		}
		return new ResultMessage(true);
	}

}

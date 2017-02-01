package congye6.HotelBooking.blservice.hotel_promotion.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.hotel_promotion.DiscountBlService;
import congye6.HotelBooking.enumeration.HotelPromotionType;
import congye6.HotelBooking.mapper.hotel_promotion.DiscountMapper;
import congye6.HotelBooking.po.DiscountPO;
import congye6.HotelBooking.vo.DiscountVO;
import congye6.HotelBooking.vo.ResultMessage;
@Service
public class DiscountBl implements DiscountBlService{

	@Autowired
	private DiscountMapper mapper;
	
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

	@Override
	public List<DiscountVO> getDiscountByHotel(int hotelId) {
		List<DiscountPO> list=mapper.getDiscountByHotel(hotelId);
		List<DiscountVO> discounts=new ArrayList<>();
		for(DiscountPO po:list){
			DiscountVO discount=new DiscountVO(hotelId, 
					HotelPromotionType.valueOf(po.getType()), po.getDiscount());
			discounts.add(discount);
		}
		return discounts;
	}

}

package congye6.HotelBooking.blservice.website_promotion.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import congye6.HotelBooking.blservice.website_promotion.VIPDiscountBlService;
import congye6.HotelBooking.mapper.site_promotion.VipDiscountMapper;
import congye6.HotelBooking.po.VipDiscountPO;
import congye6.HotelBooking.vo.ResultMessage;
import congye6.HotelBooking.vo.VipDiscountVO;

public class VIPDiscountBl implements VIPDiscountBlService{

	@Autowired
	private VipDiscountMapper mapper;
	
	@Override
	public ResultMessage setVipDiscount(VipDiscountVO discount) {
		VipDiscountPO po=discount.getPO();
		mapper.setDiscount(po);
		return new ResultMessage(true);
	}

	@Override
	public ResultMessage setVipDiscount(List<VipDiscountVO> discounts) {
		for(VipDiscountVO discount:discounts){
			setVipDiscount(discount);
		}
		return new ResultMessage(true);
	}

	@Override
	public List<VipDiscountVO> getVIPDiscount(String circle) {
		List<VipDiscountPO> discounts=mapper.getDiscountByCircle(circle);
		List<VipDiscountVO> results=new ArrayList<>();
		for(VipDiscountPO discount:discounts){
			VipDiscountVO vo=new VipDiscountVO(discount);
			results.add(vo);
		}
		return results;
	}

}

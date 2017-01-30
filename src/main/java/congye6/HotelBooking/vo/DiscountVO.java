package congye6.HotelBooking.vo;

import javax.validation.constraints.Min;

import congye6.HotelBooking.enumeration.HotelPromotionType;
import congye6.HotelBooking.po.DiscountPO;
import congye6.HotelBooking.validator.annotation.RangeDouble;
/**
 * @author congye6
 * 2016年12月24日
 * 上午11:47:58
 */
public class DiscountVO {
	@Min(value=1,message="{hotelId.min}")
	public int hotelId;
	
	public HotelPromotionType promotionType;
	
	@RangeDouble(min=0.1,max=1,message="{discount.range}")
	public double discount;

	/**
	 * @param hotelId
	 * @param promotionType
	 * @param discount
	 */
	public DiscountVO(int hotelId, HotelPromotionType promotionType, double discount) {
		super();
		this.hotelId = hotelId;
		this.promotionType = promotionType;
		this.discount = discount;
	}

	/**
	 * 
	 */
	public DiscountVO() {
		super();
	}
	
	public DiscountPO getPO(){
		DiscountPO po=new DiscountPO(hotelId, promotionType.toString(), discount);
		return po;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public HotelPromotionType getPromotionType() {
		return promotionType;
	}

	public void setPromotionType(HotelPromotionType promotionType) {
		this.promotionType = promotionType;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
}

package congye6.HotelBooking.vo;

import congye6.HotelBooking.enumeration.HotelPromotionType;

/**
 * @author congye6
 * 2016年12月24日
 * 上午11:47:58
 */
public class DiscountVO {
	public String hotelId;
	
	public HotelPromotionType promotionType;
	
	public double discount;

	/**
	 * @param hotelId
	 * @param promotionType
	 * @param discount
	 */
	public DiscountVO(String hotelId, HotelPromotionType promotionType, double discount) {
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
	
	
}

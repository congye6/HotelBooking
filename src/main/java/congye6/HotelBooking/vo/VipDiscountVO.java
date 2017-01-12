package congye6.HotelBooking.vo;

/**
 * @author congye6
 * 2016年12月24日
 * 下午12:09:49
 */
public class VipDiscountVO {
	/**
	 * 商圈
	 */
	public String circle;
	
	/**
	 * vip等级
	 */
	public int level;
	
	public double discount;

	public VipDiscountVO(String commecialCircle, int level, double discount) {
		super();
		this.circle = commecialCircle;
		this.level = level;
		this.discount = discount;
	}

	public VipDiscountVO() {
		super();
	}
	
	
}

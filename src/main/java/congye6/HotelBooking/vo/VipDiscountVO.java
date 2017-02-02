package congye6.HotelBooking.vo;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import congye6.HotelBooking.po.VipDiscountPO;
import congye6.HotelBooking.validator.annotation.RangeDouble;

/**
 * @author congye6
 * 2016年12月24日
 * 下午12:09:49
 */
public class VipDiscountVO {
	/**
	 * 商圈
	 */
	@NotEmpty(message="{hotel.ciecle.null}")
	public String circle;
	
	/**
	 * vip等级
	 */
	@Range(min=1,max=50,message="{creditLevel.level.range}")
	public int level;
	
	@RangeDouble(min=0.1,max=1,message="{discount.range}")
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
	
	public VipDiscountVO(VipDiscountPO po){
		this(po.getCircle(),po.getLevel(),po.getDiscount());
	}
	
	public VipDiscountPO getPO(){
		VipDiscountPO po=new VipDiscountPO(level, circle, discount);
		return po;
	}
	
	
}


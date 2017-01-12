package congye6.HotelBooking.mapper.site_promotion;

import org.apache.ibatis.annotations.Param;

import congye6.HotelBooking.po.VipDiscountPO;

public interface VipDiscountMapper {
	/**
	 * 设置vip在相应商圈的折扣
	 * @param po
	 * 2017年1月12日
	 */
	public void setDiscount(VipDiscountPO po);
	
	/**
	 * 获取vip在相应商圈的折扣
	 * @param circle
	 * @param level
	 * 2017年1月12日
	 */
	public void getDiscount(@Param("circle")String circle,@Param("level")int level);
}

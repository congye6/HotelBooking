package congye6.HotelBooking.mapper.hotel_promotion;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import congye6.HotelBooking.po.DiscountPO;

/**
 * 保存各个酒店的折扣
 * @author 周聪
 * 2017年1月11日
 */
public interface DiscountMapper {
	/**
	 * 折扣存在时更新折扣
	 * 不存在时添加折扣
	 * 2017年1月11日
	 */
	public void setDiscount(DiscountPO po);
	
	/**
	 * 获取折扣
	 * @param hotelId
	 * @param type
	 * @return
	 * 2017年1月11日
	 */
	public double getDiscount(@Param("hotelId")int hotelId,@Param("type")String type);
	
	/**
	 * 获取某酒店所有折扣
	 * @param hotelId
	 * @return
	 * 2017年1月11日
	 */
	public List<DiscountPO> getDiscountByHotel(int hotelId);
}

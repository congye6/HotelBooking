package congye6.HotelBooking.mapper.hotel;

import org.apache.ibatis.annotations.Param;

public interface RoomPriceMapper {

	/**
	 * 根据酒店id和房间类型获取房间价格
	 * @param hotelId
	 * @param roomType
	 * @return
	 * 2017年1月25日
	 */
	public double getPrice(@Param("id")int hotelId,@Param("type")String roomType);
	
}

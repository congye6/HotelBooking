package congye6.HotelBooking.mapper.hotel;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface RoomNumberMapper {

	/**
	 * 获取剩余的房间数量
	 * @param hotelId
	 * @param type
	 * @return
	 * 2017年1月25日
	 */
	public int getNumber(@Param("hotelId")int hotelId,@Param("type")String type);
	
	/**
	 * 获取在某天前退房数量
	 * @return
	 * 2017年1月25日
	 */
	public int getCheckOutNumber(@Param("hotelId")int hotelId,
			@Param("type")String type,@Param("date") String date);
}

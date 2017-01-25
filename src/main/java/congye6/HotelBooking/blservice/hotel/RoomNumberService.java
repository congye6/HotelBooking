package congye6.HotelBooking.blservice.hotel;

import congye6.HotelBooking.enumeration.RoomType;
import congye6.HotelBooking.vo.RoomNumberVO;

public interface RoomNumberService {

	/**
	 * 计算在将来某天的房间数量
	 * 当前剩余房间加上退房数量
	 * @param hotelId
	 * @param type
	 * @param date
	 * @return
	 * 2017年1月25日
	 */
	public int getNumber(int hotelId, RoomType type, String date);
	
}

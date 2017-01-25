package congye6.HotelBooking.blservice.hotel;

import org.junit.runner.RunWith;

import congye6.HotelBooking.enumeration.RoomType;

public interface RoomPriceService {

	/**
	 * 根据酒店id和房间类型获取房间价格
	 * @param hotelId
	 * @param type
	 * @return
	 * 2017年1月25日
	 */
	public double getPrice(int hotelId,RoomType type);
	
}

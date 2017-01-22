package congye6.HotelBooking.vo;

import congye6.HotelBooking.enumeration.RoomType;

public class RoomConditionVO {

	/**
	 * 房间类型
	 */
	public RoomType roomType;
	
	/**
	 * 最低价格
	 */
	public double lowPrice;
	
	/**
	 * 最高价格
	 */
	public double highPrice;
	
	/**
	 * 需要的房间数量
	 */
	public int roomNum;
	
	/**
	 * 入住时间
	 */
	public String checkInDate;
	
}

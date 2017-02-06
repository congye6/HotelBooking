package congye6.HotelBooking.vo;

import congye6.HotelBooking.enumeration.RoomType;

public class RoomNumberVO {
	

	/**
	 * 房间类型
	 */
	public RoomType roomType;
	
	/**
	 * 需要的房间数量
	 */
	public int roomNum;
	
	/**
	 * 入住时间
	 */
	public String checkInDate;
	
	/**
	 * @param type
	 * @param number
	 */
	public RoomNumberVO(RoomType type, Integer number,String checkInDate) {
		this.roomType=type;
		this.roomNum=number;
		this.checkInDate=checkInDate;
	}
}

package congye6.HotelBooking.vo;

import congye6.HotelBooking.enumeration.RoomType;

/**
 * @author congye6
 * 2016年12月20日
 * 下午8:33:52
 */
public class RoomVO {
	
	/**
	 * 所属酒店
	 */
	public String hotelId;
	
	/**
	 * 房间类型
	 */
	public RoomType type;
	
	/**
	 * 房间数量
	 */
	public int number;
	
	/**
	 * 价格
	 */
	public double price;

	/**
	 * @param hotelId
	 * @param type
	 * @param number
	 * @param price
	 */
	public RoomVO(String hotelId, RoomType type, int number, double price) {
		super();
		this.hotelId = hotelId;
		this.type = type;
		this.number = number;
		this.price = price;
	}

	/**
	 * 
	 */
	public RoomVO() {
		super();
	}
	
	
}

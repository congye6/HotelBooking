package congye6.HotelBooking.vo;

import javax.validation.constraints.Min;

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
	@Min(value=1,message="{hotelId.min}")
	public int hotelId;
	
	/**
	 * 房间类型
	 */
	public RoomType type;
	
	/**
	 * 房间数量
	 */
	@Min(value=0,message="{room.number.min}")
	public int number;
	
	/**
	 * 价格
	 */
	@Min(value=1,message="{room.price.min}")
	public double price;

	/**
	 * @param hotelId
	 * @param type
	 * @param number
	 * @param price
	 */
	public RoomVO(int hotelId, RoomType type, int number, double price) {
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

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public RoomType getType() {
		return type;
	}

	public void setType(RoomType type) {
		this.type = type;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}

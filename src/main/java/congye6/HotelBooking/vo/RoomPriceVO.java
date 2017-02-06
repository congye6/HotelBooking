package congye6.HotelBooking.vo;

import com.sun.istack.internal.NotNull;

import congye6.HotelBooking.enumeration.RoomType;

public class RoomPriceVO {

	/**
	 * 房间类型
	 */
	@NotNull
	public RoomType roomType;
	
	/**
	 * 最低价格
	 */
	public Double lowPrice;
	
	/**
	 * 最高价格
	 */
	public Double highPrice;
	
	/**
	 * 判断价格是否在合适区间内
	 * 包括边界值
	 * @param price
	 * @return
	 * 2017年1月25日
	 */
	public boolean isGoodPrice(double price){
		if(lowPrice!=null&&price<lowPrice)
			return false;
		if(highPrice!=null&&price>highPrice)
			return false;
		return true;
	}

	/**
	 * @param roomType
	 * @param lowPrice
	 * @param highPrice
	 */
	public RoomPriceVO(RoomType roomType, Double lowPrice, Double highPrice) {
		super();
		this.roomType = roomType;
		this.lowPrice = lowPrice;
		this.highPrice = highPrice;
	}
	
	
	
}

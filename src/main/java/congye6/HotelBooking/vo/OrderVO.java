package congye6.HotelBooking.vo;


import java.util.Map;

import congye6.HotelBooking.enumeration.OrderState;
import congye6.HotelBooking.enumeration.RoomType;

/**
 * @author congye6
 * 2016年12月21日
 * 下午6:33:35
 */
public class OrderVO {
	
	public int id;
	
	/**
	 * 订单用户id
	 */
	public String userId;
	
	/**
	 * 入住信息
	 * 包括入住时间，退房时间，最晚执行时间
	 */
	public CheckInVO checkInInfo;
	
	/**
	 * 酒店id
	 */
	public String hotelId;
	
	/**
	 * 订的各房间类型的数量
	 */
	public Map<RoomType,Integer> roomOrder;
	
	public double price;
	
	public OrderState orderState;
	
	/**
	 * 预计入住人数
	 */
	public int numberOfPeople;
	
	/**
	 * 是否携带儿童
	 */
	public boolean withChildren;
	
	/**
	 * @param userId
	 * @param checkInInfo
	 * @param hotelId
	 * @param numberOfPeople
	 * @param withChildren
	 */
	public OrderVO(String userId, CheckInVO checkInInfo, String hotelId, 
			int numberOfPeople, boolean withChildren,OrderState orderState,double price) {
		super();
		this.userId = userId;
		this.checkInInfo = checkInInfo;
		this.hotelId = hotelId;
		this.numberOfPeople = numberOfPeople;
		this.withChildren = withChildren;
		this.orderState=orderState;
		this.price=price;
	}

	/**
	 * 
	 */
	public OrderVO() {
		super();
	}
	
	
}

package congye6.HotelBooking.vo;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Range;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;

import congye6.HotelBooking.enumeration.OrderState;
import congye6.HotelBooking.enumeration.RoomType;
import congye6.HotelBooking.po.OrderPO;
import congye6.HotelBooking.po.OrderRoomPO;
import congye6.HotelBooking.validator.annotation.RangeDouble;

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
	@Min(value=1,message="{userId.min}")
	public int userId;
	
	/**
	 * 入住信息
	 * 包括入住时间，退房时间，最晚执行时间
	 */
	public CheckInVO checkInInfo;
	
	/**
	 * 酒店id
	 */
	@Min(value=1,message="{hotelId.min}")
	public int hotelId;
	
	/**
	 * 订的各房间类型的数量
	 */
	public Map<RoomType,Integer> roomOrder;
	
	@RangeDouble(min=1,max=1000000,message="{order.price.range}")
	public double price;
	
	public OrderState orderState;
	
	/**
	 * 预计入住人数
	 */
	@Range(min=1,max=1000,message="{order.people.range}")
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
	public OrderVO(int userId, CheckInVO checkInInfo,int hotelId, 
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
	 * 将订单基本信息和订房信息组成订单信息
	 * @param orderInfo
	 * @param roomInfos
	 */
	public OrderVO(OrderPO orderInfo,List<OrderRoomPO> roomInfos){
		//复制基本信息
		BeanUtils.copyProperties(orderInfo, this);
		this.orderState=OrderState.valueOf(orderInfo.getState());
		//复制入住时间
		this.checkInInfo=new CheckInVO(orderInfo.getStartDate(), 
				orderInfo.getEndDate(), orderInfo.getDeadline());
		//复制订房信息
		roomOrder=new HashMap<>();
		for(OrderRoomPO roomInfo:roomInfos){
			roomOrder.put(RoomType.valueOf(roomInfo.getType()), roomInfo.getNumber());
		}
	}
	
	public OrderPO getOrderPO(){
		OrderPO po=new OrderPO();
		BeanUtils.copyProperties(this, po);
		BeanUtils.copyProperties(this.checkInInfo, po);
		po.setState(this.orderState.toString());
		return po;
	}
	
	public List<OrderRoomPO> getOrderRoomPO(int orderId){
		List<OrderRoomPO> result=new ArrayList<>();
		Iterator<Entry<RoomType, Integer>> iterator=this.roomOrder.entrySet().iterator();
		while(iterator.hasNext()){
			Entry<RoomType, Integer> entry=iterator.next();
			OrderRoomPO po=new OrderRoomPO(orderId, entry.getKey().toString(),entry.getValue());
			result.add(po);
		}
		return result;
	}

	/**
	 * 
	 */
	public OrderVO() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public CheckInVO getCheckInInfo() {
		return checkInInfo;
	}

	public void setCheckInInfo(CheckInVO checkInInfo) {
		this.checkInInfo = checkInInfo;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public Map<RoomType, Integer> getRoomOrder() {
		return roomOrder;
	}

	public void setRoomOrder(Map<RoomType, Integer> roomOrder) {
		this.roomOrder = roomOrder;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public OrderState getOrderState() {
		return orderState;
	}

	public void setOrderState(OrderState orderState) {
		this.orderState = orderState;
	}

	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	public boolean isWithChildren() {
		return withChildren;
	}

	public void setWithChildren(boolean withChildren) {
		this.withChildren = withChildren;
	}
	
	
}

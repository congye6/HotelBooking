package congye6.HotelBooking.blservice.order.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.hotel.RoomBlService;
import congye6.HotelBooking.blservice.hotel.RoomNumberService;
import congye6.HotelBooking.blservice.order.OrderBlService;
import congye6.HotelBooking.enumeration.OrderState;
import congye6.HotelBooking.enumeration.RoomType;
import congye6.HotelBooking.mapper.order.OrderMapper;
import congye6.HotelBooking.mapper.order.OrderRoomMapper;
import congye6.HotelBooking.po.OrderPO;
import congye6.HotelBooking.po.OrderRoomPO;
import congye6.HotelBooking.vo.CheckInVO;
import congye6.HotelBooking.vo.OrderVO;
import congye6.HotelBooking.vo.ResultMessage;
@Service
public class OrderBl implements OrderBlService{
	
	@Autowired
	private OrderMapper orderMapper;
	
	@Autowired
	private OrderRoomMapper roomMapper;
	
	@Autowired
	private RoomNumberService roomNumberServicce;
	
	@Autowired
	private RoomBlService roomBl;

	@Override
	public ResultMessage makeOrder(OrderVO vo) {
		//检查是否有足够房间
		ResultMessage message=checkEnoughRoom(vo);
		if(!message.isSuccess())
			return message;
		
		//保存订单信息
		OrderPO order=vo.getOrderPO();
		orderMapper.addOrder(order);
		int orderId=order.getId();
		List<OrderRoomPO> roomInfos=vo.getOrderRoomPO(orderId);
		for(OrderRoomPO roomInfo:roomInfos){
			roomMapper.addOrderRoom(roomInfo);
			//房间数量减少
			roomBl.minusRoom(vo.hotelId, RoomType.valueOf(roomInfo.getType()),roomInfo.getNumber());
		}
		
		
		
		return new ResultMessage(true);
	}

	/**
	 * 检查是否有足够房间
	 * 不包括未实际退房的房间
	 * @param vo
	 * @return
	 * 2017年1月26日
	 */
	private ResultMessage checkEnoughRoom(OrderVO vo) {
		Iterator<Entry<RoomType, Integer>> iterator=vo.roomOrder.entrySet().iterator();
		while(iterator.hasNext()){
			Entry<RoomType, Integer> entry=iterator.next();
			RoomType type=entry.getKey();
			int num=entry.getValue();
			int leftNum=roomNumberServicce.getNumber(vo.hotelId, type);
			if(leftNum<num)
				return new ResultMessage(false, "房间数量不足，抱歉");
		}
		return new ResultMessage(true);
	}

	@Override
	public ResultMessage updateOrder(int orderId, CheckInVO checkInVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderVO> getOrdersByUser(int userId, OrderState orderState) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderVO> getOrdersByHotel(int hotelId, OrderState orderState) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderVO> getOrders(int userId, int hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderState> hasOrdered(int userId, int hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderVO> getUnfinishOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderVO getOrderById(int orderId) {
		//订单基本信息
		OrderPO order=orderMapper.getOrderById(orderId);
		if(order==null)
			return null;
		//订房信息
		List<OrderRoomPO> roomInfo=roomMapper.getOrderRoom(orderId); 
		
		OrderVO vo=new OrderVO(order,roomInfo);
		
		return vo;
	}

}

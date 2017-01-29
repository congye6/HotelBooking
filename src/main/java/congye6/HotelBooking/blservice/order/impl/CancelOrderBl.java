package congye6.HotelBooking.blservice.order.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import congye6.HotelBooking.blservice.client.CreditBlService;
import congye6.HotelBooking.blservice.hotel.RoomBlService;
import congye6.HotelBooking.blservice.order.CancelOrderBlService;
import congye6.HotelBooking.blservice.order.OrderBlService;
import congye6.HotelBooking.enumeration.OrderState;
import congye6.HotelBooking.mapper.order.OrderMapper;
import congye6.HotelBooking.po.OrderPO;
import congye6.HotelBooking.util.DateTimeUtil;
import congye6.HotelBooking.util.DateUtil;
import congye6.HotelBooking.vo.OrderVO;
import congye6.HotelBooking.vo.ResultMessage;

public class CancelOrderBl implements CancelOrderBlService{
	
	@Autowired
	private OrderBlService orderBl;
	
	@Autowired
	private CreditBlService creditBl;
	
	@Autowired
	private OrderMapper mapper;
	
	@Autowired
	private RoomBlService roomBl;
	
	@Override
	@Transactional
	public ResultMessage cancelOrder(int orderId) {
		OrderVO order=orderBl.getOrderById(orderId);
		if(order==null)
			return new ResultMessage(false, "订单不存在");
		if(order.orderState!=OrderState.BOOKING)
			return new ResultMessage(false,"该订单无法取消哦");
		
		//更新状态
		mapper.updateOrderState(orderId, OrderState.CANCEL.toString());
		
		Date now=new Date();
		Date deadline=DateUtil.getDate(order.checkInInfo.deadline);
		long minute=DateTimeUtil.minus(deadline, now);
		//订单deadline六小时前取消需要减一半信用值
		if(minute>3600){
			ResultMessage message=creditBl.cancelOrder(order.getUserId(), orderId, order.getPrice());
			if(!message.isSuccess())
				return message;
		}
		
		//将房间恢复
		ResultMessage message=roomBl.checkOut(order.hotelId, order.roomOrder);
		
		return message;
	}

	@Override
	public ResultMessage cancelExceptionOrder(int orderId, double recoverRate) {
		if(recoverRate>1||recoverRate<0)
			return new ResultMessage(false, "信用值恢复比例为0.0--1.0");
		
		OrderVO order=orderBl.getOrderById(orderId);
		if(order==null)
			return new ResultMessage(false, "订单不存在");
		if(order.orderState!=OrderState.EXCEPTION)
			return new ResultMessage(false, "订单"+order.getId()+"不是异常订单哦");
		//更新状态
		mapper.updateOrderState(orderId, OrderState.CANCEL.toString());
		
		//恢复信用值
		ResultMessage message=creditBl.cancelException(order.getUserId(),
				orderId, order.getPrice(), recoverRate);
		
		return message;
	}

}

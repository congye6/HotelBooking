package congye6.HotelBooking.blservice.order.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.client.CreditBlService;
import congye6.HotelBooking.blservice.hotel.RoomBlService;
import congye6.HotelBooking.blservice.order.ExceptionOrderBlService;
import congye6.HotelBooking.blservice.order.OrderBlService;
import congye6.HotelBooking.enumeration.OrderState;
import congye6.HotelBooking.mapper.order.OrderMapper;
import congye6.HotelBooking.util.DateTimeUtil;
import congye6.HotelBooking.vo.CheckInVO;
import congye6.HotelBooking.vo.OrderVO;
import congye6.HotelBooking.vo.ResultMessage;
@Service
public class ExceptionOrderBl implements ExceptionOrderBlService{

	@Autowired
	private OrderBlService orderBl;
	
	@Autowired
	private OrderMapper mapper;
	
	@Autowired
	private RoomBlService roomBl;
	
	@Autowired
	private CreditBlService creditBl;
	
	@Override
	public ResultMessage exceptionOrder(int orderId) {
		OrderVO order=orderBl.getOrderById(orderId);
		if(order==null)
			return new ResultMessage(false, "订单不存在");
		if(order.orderState!=OrderState.BOOKING)
			return new ResultMessage(false,"订单状态异常");
		if(!DateTimeUtil.isPastTime(order.checkInInfo.deadline))
			return new ResultMessage(false,"还没到截止日期哦");
		
		mapper.updateOrderState(orderId, OrderState.EXCEPTION.toString());
		ResultMessage message=roomBl.checkOut(order.hotelId, order.roomOrder);
		return message;
	}

	@Override
	public ResultMessage delayOrder(int orderId, CheckInVO checkInVO) {
		OrderVO order=orderBl.getOrderById(orderId);
		if(order==null)
			return new ResultMessage(false, "订单不存在");
		if(order.orderState!=OrderState.EXCEPTION)
			return new ResultMessage(false,"订单无需延期");
		mapper.updateOrderState(orderId, OrderState.BOOKING.toString());
		mapper.updateOrderDate(checkInVO.getPO(orderId));
		//恢复信用值
		creditBl.cancelException(order.userId, orderId, order.price, 1);
		//预订房间
		roomBl.bookingRoom(order.hotelId, order.roomOrder);
		return new ResultMessage(true);
	}

}

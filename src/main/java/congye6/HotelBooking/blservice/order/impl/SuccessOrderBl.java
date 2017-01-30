package congye6.HotelBooking.blservice.order.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.client.CreditBlService;
import congye6.HotelBooking.blservice.order.OrderBlService;
import congye6.HotelBooking.blservice.order.SuccessOrderBlService;
import congye6.HotelBooking.enumeration.OrderState;
import congye6.HotelBooking.mapper.order.OrderMapper;
import congye6.HotelBooking.vo.OrderVO;
import congye6.HotelBooking.vo.ResultMessage;
@Service
public class SuccessOrderBl implements SuccessOrderBlService{

	@Autowired
	private OrderBlService orderBl;
	
	@Autowired
	private OrderMapper mapper;
	
	@Autowired
	private CreditBlService creditBl;
	
	@Override
	public ResultMessage successOrder(int orderId) {
		OrderVO order=orderBl.getOrderById(orderId);
		if(order==null)
			return new ResultMessage(false, "订单不存在");
		if(order.orderState!=OrderState.BOOKING)
			return new ResultMessage(false, "订单状态异常");
		
		mapper.updateOrderState(orderId, OrderState.SUCCESS.toString());
		//增加信用值
		ResultMessage message=creditBl.successOrder(order.userId, orderId, order.price);
		return message;
	}

}

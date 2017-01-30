package congye6.HotelBooking.blservice.order.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.hotel.RoomBlService;
import congye6.HotelBooking.blservice.order.CheckOutBlService;
import congye6.HotelBooking.enumeration.OrderState;
import congye6.HotelBooking.mapper.order.OrderMapper;
import congye6.HotelBooking.vo.OrderVO;
import congye6.HotelBooking.vo.ResultMessage;
@Service
public class CheckOutBl implements CheckOutBlService{
	
	@Autowired
	private OrderBl orderBl;
	
	@Autowired
	private OrderMapper mapper;
	
	@Autowired
	private RoomBlService roomBl;

	@Override
	public ResultMessage checkOut(int orderId) {
		OrderVO order=orderBl.getOrderById(orderId);
		if(order==null)
			return new ResultMessage(false, "订单不存在");
		if(order.orderState!=OrderState.SUCCESS)
			return new ResultMessage(false, "该订单未成功执行，还不能退房哦");
		//将订单状态置为退房
		mapper.updateOrderState(orderId, OrderState.CHECK_OUT.toString());
		
		//退房
		ResultMessage message=roomBl.checkOut(order.hotelId, order.roomOrder);
		
		return message;
	}

}

package congye6.HotelBooking.blservice.order.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.order.OrderBlService;
import congye6.HotelBooking.enumeration.OrderState;
import congye6.HotelBooking.mapper.order.OrderMapper;
import congye6.HotelBooking.po.OrderPO;
import congye6.HotelBooking.vo.CheckInVO;
import congye6.HotelBooking.vo.OrderVO;
import congye6.HotelBooking.vo.ResultMessage;
@Service
public class OrderBl implements OrderBlService{
	
	@Autowired
	private OrderMapper mapper;

	@Override
	public ResultMessage makeOrder(OrderVO vo) {
		
		return null;
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
		OrderPO po=mapper.getOrderById(orderId);
		if(po==null)
			return null;
		OrderVO vo=new OrderVO();
		BeanUtils.copyProperties(po, vo);
		return vo;
	}

}

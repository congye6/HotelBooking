package congye6.HotelBooking.blservice.client.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.client.CreditBlService;
import congye6.HotelBooking.blservice.order.OrderBlService;
import congye6.HotelBooking.enumeration.CreditOperation;
import congye6.HotelBooking.mapper.client.ClientMapper;
import congye6.HotelBooking.mapper.client.CreditRecordMapper;
import congye6.HotelBooking.vo.CreditRecordVO;
import congye6.HotelBooking.vo.OrderVO;
import congye6.HotelBooking.vo.ResultMessage;
@Service
public class CreditBl implements CreditBlService{

	@Autowired
	private CreditRecordMapper creditRecordMapper;
	
	@Autowired
	private OrderBlService orderBl;
	
	@Autowired
	private ClientMapper clientMapper;
	
	@Override
	public ResultMessage cancelOrder(int userId,int orderId, double money) {
		clientMapper.minusCredit(userId, money/2);
		
		
		
		return null;
	}

	@Override
	public ResultMessage exceptionOrder(int orderId, double money) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage successOrder(int orderId, double money) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage recharge(double money) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CreditRecordVO> getCreditRecords(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}

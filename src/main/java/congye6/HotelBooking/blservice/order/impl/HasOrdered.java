package congye6.HotelBooking.blservice.order.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.order.HasOrderedService;
import congye6.HotelBooking.mapper.order.OrderMapper;
@Service
public class HasOrdered implements HasOrderedService{

	@Autowired
	private OrderMapper mapper;
	
	@Override
	public boolean hasOrdered(int userId, int hotelId) {
		List<String> states=mapper.getOrderState(userId, hotelId);
		if(states.isEmpty())
			return false;
		return true;
	}

}

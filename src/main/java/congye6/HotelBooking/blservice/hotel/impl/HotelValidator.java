package congye6.HotelBooking.blservice.hotel.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.hotel.HotelValidatorService;
import congye6.HotelBooking.mapper.hotel.HotelMapper;
import congye6.HotelBooking.po.HotelPO;
@Service
public class HotelValidator implements HotelValidatorService{

	@Autowired
	private HotelMapper mapper;
	
	@Override
	public boolean isHotel(int hotelId) {
		if(hotelId<=0)
			return false;
		HotelPO po=mapper.getHotel(hotelId);
		if(po==null)
			return false;
		
		return true;
	}

}

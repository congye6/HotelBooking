package congye6.HotelBooking.blservice.hotel.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.hotel.RoomPriceService;
import congye6.HotelBooking.enumeration.RoomType;
import congye6.HotelBooking.mapper.hotel.RoomPriceMapper;
@Service
public class RoomPrice implements RoomPriceService{

	@Autowired
	private RoomPriceMapper mapper;
	
	@Override
	public double getPrice(int hotelId, RoomType type) {
		return mapper.getPrice(hotelId, type.toString());
	}

}

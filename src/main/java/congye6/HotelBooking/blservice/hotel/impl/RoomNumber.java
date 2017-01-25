package congye6.HotelBooking.blservice.hotel.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.hotel.RoomNumberService;
import congye6.HotelBooking.enumeration.RoomType;
import congye6.HotelBooking.mapper.hotel.RoomNumberMapper;

@Service
public class RoomNumber implements RoomNumberService{
	
	@Autowired
	private RoomNumberMapper roomMapper;

	@Override
	public int getNumber(int hotelId, RoomType type, String date) {
		int leftRoomNumber=roomMapper.getNumber(hotelId, type.toString());
		int checkOutNumber=roomMapper.getCheckOutNumber(hotelId, type.toString(), date);
		return leftRoomNumber+checkOutNumber;
	}

}

package congye6.HotelBooking.blservice.hotel.impl.searchHotel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.hotel.RoomNumberService;
import congye6.HotelBooking.blservice.hotel.SearchHotelStrategy;
import congye6.HotelBooking.vo.HotelVO;
import congye6.HotelBooking.vo.RoomNumberVO;
@Service("ROOM_NUMBER")
public class SearchHotelByRoomNumber implements SearchHotelStrategy{

	@Autowired
	private RoomNumberService roomNumberBl;
	
	@Override
	public List<HotelVO> searchHotel(List<HotelVO> list, Object obj) {
		RoomNumberVO condition=(RoomNumberVO)obj;
		List<HotelVO> result=new ArrayList<>();
		for(HotelVO hotel:list){
			int roomNumber=roomNumberBl.getNumber(hotel.id,condition.roomType,condition.checkInDate);
			if(roomNumber>=condition.roomNum)
				result.add(hotel);
		}
		
		return result;
	}

}

package congye6.HotelBooking.blservice.hotel.impl.searchHotel;

import java.util.List;

import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.hotel.SearchHotelStrategy;
import congye6.HotelBooking.vo.HotelVO;
import congye6.HotelBooking.vo.RoomConditionVO;
@Service("ROOM")
public class SearchHotelByRoom implements SearchHotelStrategy{

	@Override
	/**
	 * 房间（类型、原始价格区间、有空房期间（房间数量、入住日期，退房日期））
	 */
	public List<HotelVO> searchHotel(List<HotelVO> list, Object condition) {
		RoomConditionVO roomCondition=(RoomConditionVO)condition;
		
		
		return null;
	}

}

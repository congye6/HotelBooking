package congye6.HotelBooking.blservice.hotel.impl.searchHotel;

import java.util.List;

import congye6.HotelBooking.blservice.hotel.SearchHotelStrategy;
import congye6.HotelBooking.vo.HotelVO;

public class SearchHotelByHasBooked implements SearchHotelStrategy<Boolean>{

	
	/**
	 * 根据是否预订过筛选
	 */
	@Override
	public List<HotelVO> searchHotel(List<HotelVO> list, Boolean hasBooked) {
		// TODO Auto-generated method stub
		return null;
	}

}

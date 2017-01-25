package congye6.HotelBooking.blservice.hotel.impl.searchHotel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.hotel.SearchHotelStrategy;
import congye6.HotelBooking.blservice.order.HasOrderedService;
import congye6.HotelBooking.vo.HotelVO;
@Service("HAS_BOOK")
public class SearchHotelByHasBooked implements SearchHotelStrategy{

	@Autowired
	private HasOrderedService service;
	
	/**
	 * 根据是否预订过筛选
	 */
	@Override
	public List<HotelVO> searchHotel(List<HotelVO> list, Object obj) {
		Integer userId=(Integer)obj;
		List<HotelVO> result=new ArrayList<>();
		for(HotelVO hotel:list){
			if(service.hasOrdered(userId, hotel.id))
				result.add(hotel);
		}
		return result;
	}

}

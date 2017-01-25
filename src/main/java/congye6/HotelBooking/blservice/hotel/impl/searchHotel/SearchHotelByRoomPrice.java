package congye6.HotelBooking.blservice.hotel.impl.searchHotel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.hotel.RoomPriceService;
import congye6.HotelBooking.blservice.hotel.SearchHotelStrategy;
import congye6.HotelBooking.vo.HotelVO;
import congye6.HotelBooking.vo.RoomPriceVO;
@Service("ROOM_PRICE")
public class SearchHotelByRoomPrice implements SearchHotelStrategy{
	
	@Autowired
	private RoomPriceService priceBl;

	@Override
	/**
	 * 房间价格是否符合要求
	 */
	public List<HotelVO> searchHotel(List<HotelVO> list, Object condition) {
		RoomPriceVO priceInterval=(RoomPriceVO)condition;
		List<HotelVO> result=new ArrayList<>();
		for(HotelVO hotel:list){
			double price=priceBl.getPrice(hotel.id,priceInterval.roomType);
			if(priceInterval.isGoodPrice(price))
				result.add(hotel);
		}
		return result;
	}

}

package congye6.HotelBooking.blservice.hotel.impl.searchHotel;

import java.util.List;

import congye6.HotelBooking.blservice.hotel.SearchHotelStrategy;
import congye6.HotelBooking.vo.HotelVO;

/**
 * @author congye6
 * 2016年12月24日
 * 上午10:56:23
 */
public class SearchHotelByName implements SearchHotelStrategy<String>{

	/**
	 * 根据酒店名称模糊查询
	 * @author congye6
	 * @see congye6.HotelBooking.blservice.hotel.SearchHotelStrategy#searchHotel(java.util.List, java.lang.Object)
	 */
	@Override
	public List<HotelVO> searchHotel(List<HotelVO> list, String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}

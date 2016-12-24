package congye6.HotelBooking.blservice.hotel;

import java.util.List;

import congye6.HotelBooking.vo.HotelVO;

/**
 * 根据某些条件搜索酒店
 * @author congye6
 * 2016年12月24日
 * 上午10:52:10
 */
public interface SearchHotelStrategy<T> {
	/**
	 * 根据条件搜索酒店
	 * @author congye6
	 * @param list
	 * @param condition
	 * @return
	 */
	public List<HotelVO> searchHotel(List<HotelVO> list,T condition);
}

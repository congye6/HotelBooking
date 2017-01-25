package congye6.HotelBooking.blservice.hotel.impl.searchHotel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.hotel.SearchHotelStrategy;
import congye6.HotelBooking.vo.HotelVO;

/**
 * @author congye6
 * 2016年12月24日
 * 上午10:56:23
 */
@Service("NAME")
public class SearchHotelByName implements SearchHotelStrategy{

	/**
	 * 根据酒店名称模糊查询
	 * @author congye6
	 * @see congye6.HotelBooking.blservice.hotel.SearchHotelStrategy#searchHotel(java.util.List, java.lang.Object)
	 */
	@Override
	public List<HotelVO> searchHotel(List<HotelVO> list, Object condition) {
		String name=(String)condition;
		List<HotelVO> result=new ArrayList<>();
		for(HotelVO vo:list){
			if(vo.name.contains(name))
				result.add(vo);
		}
		return result;
	}

}

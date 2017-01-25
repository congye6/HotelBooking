package congye6.HotelBooking.blservice.hotel.impl.searchHotel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.hotel.SearchHotelStrategy;
import congye6.HotelBooking.vo.HotelVO;
@Service("STAR")
public class SearchHotelByStar implements SearchHotelStrategy{

	/**
	 * 根据酒店星级搜索
	 */
	@Override
	public List<HotelVO> searchHotel(List<HotelVO> list, Object obj) {
		Integer star=(Integer)obj;
		List<HotelVO> result=new ArrayList<>();
		for(HotelVO vo:list){
			if(vo.star==star)
				result.add(vo);
		}
		return result;
	}

}

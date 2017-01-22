package congye6.HotelBooking.blservice.hotel.impl.searchHotel;

import java.util.List;

import congye6.HotelBooking.blservice.hotel.SearchHotelStrategy;
import congye6.HotelBooking.vo.HotelVO;
import congye6.HotelBooking.vo.ScoreIntervalVO;

public class SearchHotelByScore implements SearchHotelStrategy<ScoreIntervalVO>{

	/**
	 * 根据酒店评分区间进行筛选
	 */
	@Override
	public List<HotelVO> searchHotel(List<HotelVO> list, ScoreIntervalVO interval) {
		// TODO Auto-generated method stub
		return null;
	}

}

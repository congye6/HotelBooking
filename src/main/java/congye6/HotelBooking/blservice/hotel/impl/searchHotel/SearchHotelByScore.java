package congye6.HotelBooking.blservice.hotel.impl.searchHotel;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import congye6.HotelBooking.blservice.hotel.CommentsBlService;
import congye6.HotelBooking.blservice.hotel.SearchHotelStrategy;
import congye6.HotelBooking.vo.HotelVO;
import congye6.HotelBooking.vo.ScoreIntervalVO;
@Service("SCORE")
public class SearchHotelByScore implements SearchHotelStrategy{

	@Autowired
	private CommentsBlService commentBl;
	
	/**
	 * 根据酒店评分区间进行筛选
	 */
	@Override
	public List<HotelVO> searchHotel(List<HotelVO> list, Object obj) {
		ScoreIntervalVO interval=(ScoreIntervalVO)obj;
		List<HotelVO> result=new ArrayList<>();
		for(HotelVO hotel:list){
			double score=commentBl.getScore(hotel.id);
			if(interval.isBetween(score))
				result.add(hotel);
		}
		return result;
	}

}

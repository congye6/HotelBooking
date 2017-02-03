package congye6.HotelBooking.controller.hotel;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import congye6.HotelBooking.blservice.hotel.HotelBlService;
import congye6.HotelBooking.util.StringUtil;
import congye6.HotelBooking.vo.HotelVO;

@Controller
public class SearchHotelController {

	@Autowired
	private HotelBlService hotelBl;
	
	@RequestMapping(value="/hotel/{city}/{circle}",method=RequestMethod.GET)
	public @ResponseBody List<HotelVO> searchHotel(@PathVariable("city")String city
			,@PathVariable("circle")String circle){
		if(StringUtil.isNull(circle)||StringUtil.isNull(city))
			return new ArrayList<>();
		List<HotelVO> result=hotelBl.getHotels(city, circle);
		return result;
	}
	
}

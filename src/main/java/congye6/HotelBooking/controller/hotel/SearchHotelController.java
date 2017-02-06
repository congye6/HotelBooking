package congye6.HotelBooking.controller.hotel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import congye6.HotelBooking.blservice.hotel.HotelBlService;
import congye6.HotelBooking.util.StringUtil;
import congye6.HotelBooking.util.Utf8EncodingUtil;
import congye6.HotelBooking.vo.ConditionVO;
import congye6.HotelBooking.vo.HotelSearchVO;
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
		city=Utf8EncodingUtil.toUtf8(city);
		circle=Utf8EncodingUtil.toUtf8(circle);
		List<HotelVO> result=hotelBl.getHotels(city, circle);
		return result;
	}
	
	@RequestMapping(value="/hotel",method=RequestMethod.POST)
	public @ResponseBody List<HotelVO> searchHotel(@RequestBody HotelSearchVO vo){
		List<ConditionVO> conditions=vo.getConditions();
		return hotelBl.getHotels(vo.city, vo.circle, conditions);
	}
	
}

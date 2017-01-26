package congye6.HotelBooking.blservice.hotel.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.hotel.HotelBlService;
import congye6.HotelBooking.blservice.hotel.SearchHotelStrategy;
import congye6.HotelBooking.mapper.hotel.HotelMapper;
import congye6.HotelBooking.po.HotelPO;
import congye6.HotelBooking.util.SpringContextUtil;
import congye6.HotelBooking.util.StringUtil;
import congye6.HotelBooking.vo.ConditionVO;
import congye6.HotelBooking.vo.HotelVO;
import congye6.HotelBooking.vo.ResultMessage;
@Service
public class HotelBl implements HotelBlService{
	
	@Autowired
	private HotelMapper mapper;

	@Override
	public List<HotelVO> getHotels(String city, String circle) {
		List<HotelPO> hotels=mapper.getHotels(city, circle);
		List<HotelVO> results=new ArrayList<>();
		for(HotelPO hotel:hotels){
			HotelVO vo=new HotelVO(hotel);
			results.add(vo);
		}
		return results;
	}

	@Override
	public List<HotelVO> getHotels(String city, String circle, List<ConditionVO> conditions) {
		List<HotelVO> originalList=this.getHotels(city, circle);
		List<HotelVO> result=originalList;
		for(ConditionVO condition:conditions){
			SearchHotelStrategy strategy=
					SpringContextUtil.getBean(condition.condition.toString());
			result=strategy.searchHotel(result, condition.value);
		}
		return result;
	}

	@Override
	public ResultMessage addHotel(HotelVO hotel) {
		if(StringUtil.isNull(hotel.name))
			return new ResultMessage(false, "请输入酒店名称");
		HotelPO po=hotel.getPO();
		mapper.addHotel(po);
		return new ResultMessage(true, po.getId()+"");
	}

	@Override
	public ResultMessage updateHotel(HotelVO hotel) {
		HotelPO po=hotel.getPO();
		mapper.updateHotel(po);
		return new ResultMessage(true);
	}

	@Override
	public HotelVO getHotel(int hotelId) {
		HotelPO po=mapper.getHotel(hotelId);
		HotelVO hotel=new HotelVO(po);
		return hotel;
	}

}

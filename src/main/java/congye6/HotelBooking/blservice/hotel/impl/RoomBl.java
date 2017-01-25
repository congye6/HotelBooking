package congye6.HotelBooking.blservice.hotel.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import congye6.HotelBooking.blservice.hotel.HotelValidatorService;
import congye6.HotelBooking.blservice.hotel.RoomBlService;
import congye6.HotelBooking.enumeration.RoomType;
import congye6.HotelBooking.mapper.hotel.RoomMapper;
import congye6.HotelBooking.po.RoomPO;
import congye6.HotelBooking.vo.ResultMessage;
import congye6.HotelBooking.vo.RoomVO;

public class RoomBl implements RoomBlService{

	@Autowired
	private RoomMapper mapper;
	
	@Autowired
	private HotelValidatorService hotelValidator;
	
	@Override
	public List<RoomVO> getRoomInfos(int hotelId) {
		List<RoomPO> list=mapper.getRoomInfos(hotelId);
		List<RoomVO> rooms=new ArrayList<>();
		for(RoomPO po:list){
			RoomVO room=new RoomVO();
			BeanUtils.copyProperties(po, room);
			rooms.add(room);
		}
		return rooms;
	}

	@Override
	public ResultMessage addRoomInfo(RoomVO vo) {
		if(!hotelValidator.isHotel(vo.hotelId))
			return new ResultMessage(false, "酒店id不存在");
		RoomPO po=new RoomPO();
		BeanUtils.copyProperties(vo, po);
		mapper.updateRoomInfo(po);
		return new ResultMessage(true);
	}

	@Override
	public ResultMessage minusRoom(int hotelId, RoomType type) {
		mapper.minusRoom(hotelId, type.toString());
		return new ResultMessage(true);
	}

	@Override
	public ResultMessage addRoom(int hotelId, RoomType type) {
		mapper.addRoom(hotelId, type.toString());
		return new ResultMessage(true);
	}

}
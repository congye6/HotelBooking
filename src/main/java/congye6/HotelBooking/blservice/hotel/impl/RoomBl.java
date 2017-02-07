package congye6.HotelBooking.blservice.hotel.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.hotel.HotelValidatorService;
import congye6.HotelBooking.blservice.hotel.RoomBlService;
import congye6.HotelBooking.enumeration.RoomType;
import congye6.HotelBooking.mapper.hotel.RoomMapper;
import congye6.HotelBooking.po.RoomPO;
import congye6.HotelBooking.vo.ResultMessage;
import congye6.HotelBooking.vo.RoomVO;
@Service
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
			room.setType(RoomType.valueOf(po.getType()));
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
		po.setType(vo.type.toString());
		mapper.updateRoomInfo(po);
		return new ResultMessage(true);
	}

	@Override
	public ResultMessage minusRoom(int hotelId, RoomType type,int num) {
		mapper.minusRoom(hotelId, type.toString(),num);
		return new ResultMessage(true);
	}

	@Override
	public ResultMessage addRoom(int hotelId, RoomType type,int num) {
		mapper.addRoom(hotelId, type.toString(),num);
		return new ResultMessage(true);
	}

	@Override
	public ResultMessage bookingRoom(int hotelId, Map<RoomType, Integer> roomNumMap) {
		Iterator<Entry<RoomType, Integer>> iterator=roomNumMap.entrySet().iterator();
		while(iterator.hasNext()){
			Entry<RoomType, Integer> entry=iterator.next();
			ResultMessage message=this.addRoom(hotelId, entry.getKey(), entry.getValue());
			if(!message.isSuccess())
				return message;
		}
		return new ResultMessage(true);
	}

	@Override
	public ResultMessage checkOut(int hotelId, Map<RoomType, Integer> roomNumMap) {
		Iterator<Entry<RoomType, Integer>> iterator=roomNumMap.entrySet().iterator();
		while(iterator.hasNext()){
			Entry<RoomType, Integer> entry=iterator.next();
			ResultMessage message=this.minusRoom(hotelId, entry.getKey(), entry.getValue());
			if(!message.isSuccess())
				return message;
		}
		return new ResultMessage(true);
	}

}

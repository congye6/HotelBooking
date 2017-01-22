package congye6.HotelBooking.blservice.client.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.client.LevelBlService;
import congye6.HotelBooking.mapper.client.LevelMapper;
import congye6.HotelBooking.po.LevelPO;
import congye6.HotelBooking.vo.CreditLevelVO;
import congye6.HotelBooking.vo.ResultMessage;
@Service
public class LevelBl implements LevelBlService{

	@Autowired
	private LevelMapper mapper;
	
	@Override
	public ResultMessage setCreditLevel(List<CreditLevelVO> list) {
		
		for(CreditLevelVO vo:list){
			LevelPO po=new LevelPO();
			BeanUtils.copyProperties(vo, po);
			mapper.updateLevel(po);
		}
		
		return new ResultMessage(true);
	}

	@Override
	public int getLevel(int credit) {
		int level=mapper.getLevel(credit);
		return level;
	}

}

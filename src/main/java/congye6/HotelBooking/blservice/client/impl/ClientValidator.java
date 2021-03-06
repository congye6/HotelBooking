package congye6.HotelBooking.blservice.client.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.client.ClientValidatorService;
import congye6.HotelBooking.mapper.client.ClientMapper;
import congye6.HotelBooking.po.ClientPO;
@Service
public class ClientValidator implements ClientValidatorService{

	@Autowired
	private ClientMapper mapper;
	
	@Override
	public boolean isClient(int userId) {
		
		ClientPO po=mapper.getClient(userId);
		if(po==null)
			return false;
		return true;
	}

	@Override
	public boolean isGoodClient(int userId) {
		ClientPO po=mapper.getClient(userId);
		if(po==null)
			return false;
		if(po.getCredit()<0)
			return false;
		
		return true;
	}

}

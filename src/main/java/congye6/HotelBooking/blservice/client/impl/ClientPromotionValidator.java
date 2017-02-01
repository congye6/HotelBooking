package congye6.HotelBooking.blservice.client.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.client.ClientBlService;
import congye6.HotelBooking.blservice.client.ClientPromotionValidatorService;
import congye6.HotelBooking.util.DateUtil;
import congye6.HotelBooking.util.StringUtil;
import congye6.HotelBooking.vo.ClientVO;

@Service
public class ClientPromotionValidator implements ClientPromotionValidatorService{

	@Autowired
	private ClientBlService clientBl;
	
	@Override
	public boolean isBirthday(int userId) {
		ClientVO client=clientBl.getClientInfo(userId);
		if(client==null||StringUtil.isNull(client.birthday))
			return false;
		String today=DateUtil.getToday();
		if(!today.equals(client.birthday))
			return false;
		return true;
	}

	@Override
	public boolean isCooperativeEnterprise(int userId) {
		ClientVO client=clientBl.getClientInfo(userId);
		if(client==null||StringUtil.isNull(client.company))
			return false;
		return true;
	}

}

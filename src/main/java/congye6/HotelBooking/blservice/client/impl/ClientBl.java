package congye6.HotelBooking.blservice.client.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.client.ClientBlService;
import congye6.HotelBooking.blservice.user.AccountBlService;
import congye6.HotelBooking.enumeration.UserType;
import congye6.HotelBooking.mapper.client.ClientMapper;
import congye6.HotelBooking.po.ClientPO;
import congye6.HotelBooking.vo.AccountVO;
import congye6.HotelBooking.vo.ClientVO;
import congye6.HotelBooking.vo.ResultMessage;
@Service
public class ClientBl implements ClientBlService{

	@Autowired
	private ClientMapper mapper;
	
	@Autowired
	private AccountBlService accountBl;
	
	@Override
	public ResultMessage register(ClientVO vo) {
		
		if(vo==null){
			ResultMessage message=new ResultMessage(false);
			message.setMessage("系统错误");
			return message;
		}
		//检验vo
		ResultMessage isValid=vo.validate();
		if(!isValid.isSuccess())
			return isValid; 
		
		ClientPO po=new ClientPO();
		BeanUtils.copyProperties(vo, po);
		//添加登录账号，获得注册的id
		int id=accountBl.addAccount(new AccountVO(0, vo.password,UserType.CLIENT));
		po.setId(id);
		po.setCredit(3000);//初始信用值为3000
		mapper.addClient(po);
		
		ResultMessage message=new ResultMessage(true, id+"");
		return message;
	}

	@Override
	public ResultMessage modifyClientInfo(ClientVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientVO getClientInfo(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}

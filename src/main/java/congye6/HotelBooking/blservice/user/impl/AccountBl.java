package congye6.HotelBooking.blservice.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.user.AccountBlService;
import congye6.HotelBooking.enumeration.UserType;
import congye6.HotelBooking.mapper.user.AccountMapper;
import congye6.HotelBooking.po.AccountPO;
import congye6.HotelBooking.vo.AccountVO;
import congye6.HotelBooking.vo.ResultMessage;
@Service
public class AccountBl implements AccountBlService{

	@Autowired
	private AccountMapper mapper;
	
	@Override
	public ResultMessage login(int id, String password) {
		ResultMessage message=new ResultMessage(false);
		if(password==null||password.length()==0){
			message.setMessage("密码不能为空");
			return message;
		}
		
		AccountPO account=mapper.getAccount(id);
		if(account==null){
			message.setMessage("id不存在");
			return message;
		}
		
		if(!account.getPassword().equals(password)){
			message.setMessage("密码不正确");
			return message;
		}
		
		message.setSuccess(true);
		
		return message;
	}

	@Override
	public UserType getUserType(int id, String password) {
		
		if(password==null||password.length()==0)
			return UserType.UNKNOW;
		
		AccountPO account=mapper.getAccount(id);
		if(account==null)
			return UserType.UNKNOW;
		
		
		return UserType.valueOf(account.getType());
	}

	@Override
	public int addAccount(AccountVO vo) {
		AccountPO po=new AccountPO(vo);
		mapper.addAccount(po);
		return po.getId();
	}

	@Override
	public ResultMessage changePassword(int id, String password) {
		mapper.updatePassword(id, password);
		return new ResultMessage(true);
	}

}

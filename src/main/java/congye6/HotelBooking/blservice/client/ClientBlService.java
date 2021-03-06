package congye6.HotelBooking.blservice.client;

import java.util.List;

import congye6.HotelBooking.vo.ClientVO;
import congye6.HotelBooking.vo.ResultMessage;

/**
 * @author congye6
 * 下午2:55:56
 */
public interface ClientBlService {
	
	/**
	 * 用户注册，填写客户信息
	 * 信用值为默认值3000
	 * @author congye6
	 * @param vo
	 * @return
	 */
	public ResultMessage register(ClientVO vo);
	
	/**
	 * 修改客户信息
	 * 用户名和信用值不能改
	 * @author congye6
	 * @param vo
	 * @return
	 */
	public ResultMessage modifyClientInfo(ClientVO vo);
	
	/**
	 * 获取用户信息
	 * @author congye6
	 * @param userId
	 * @return
	 */
	public ClientVO getClientInfo(int userId);
}

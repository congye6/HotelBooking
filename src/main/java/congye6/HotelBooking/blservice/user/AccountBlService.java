package congye6.HotelBooking.blservice.user;

import congye6.HotelBooking.enumeration.UserType;
import congye6.HotelBooking.vo.AccountVO;
import congye6.HotelBooking.vo.ResultMessage;

/**
 * 登录账号
 * @author congye6
 * 2016年12月21日
 * 下午4:54:34
 */
public interface AccountBlService {

	/**
	 * 登录
	 * 检查用户名是否存在
	 * 检查密码是否正确
	 * @author congye6
	 * @param id
	 * @param password
	 * @return
	 */
	public ResultMessage login(int id,String password);
	
	/**
	 * 返回登录用户的类型
	 * 密码不正确返回UNKNOW
	 * @author congye6
	 * @param id
	 * @param password
	 * @return
	 */
	public UserType getUserType(int id,String password);
	
	/**
	 * 添加酒店工作人员和网站营销人员账号
	 * @author congye6
	 * @param vo
	 * @return
	 */
	public ResultMessage addAccount(AccountVO vo);
	
	/**
	 * 修改密码
	 * @author congye6
	 * @param id
	 * @param newPassword
	 * @return
	 */
	public ResultMessage changePassword(int id,String newPassword);
	
}

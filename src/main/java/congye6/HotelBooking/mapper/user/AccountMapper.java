package congye6.HotelBooking.mapper.user;


import org.apache.ibatis.annotations.Param;

import congye6.HotelBooking.po.AccountPO;

/**
 * @author 周聪
 * 2017年1月4日
 */
public interface AccountMapper {
	
	/**
	 * 获得account
	 * @param id
	 * @return
	 * 2017年1月4日
	 */
	public AccountPO getAccount(int id);
	
	/**
	 * 添加酒店工作人员和网站营销人员账号
	 * @author congye6
	 * @param vo
	 * @return
	 */
	public void addAccount(AccountPO po);
	
	/**
	 * 更新用户密码
	 * @param id
	 * @param password
	 * 2017年1月14日
	 */
	public void updatePassword(@Param("id")int id,@Param("password")String password);
}

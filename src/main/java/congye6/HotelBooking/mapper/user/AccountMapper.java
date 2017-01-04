package congye6.HotelBooking.mapper.user;


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
	public AccountPO getAccount(String id);
	
	/**
	 * 添加酒店工作人员和网站营销人员账号
	 * @author congye6
	 * @param vo
	 * @return
	 */
	public void addAccount(AccountPO po);
	
	/**
	 * 更新账号信息
	 * @author congye6
	 * @param id
	 * @param newPassword
	 * @return
	 */
	public void updateAccount(AccountPO po);
}

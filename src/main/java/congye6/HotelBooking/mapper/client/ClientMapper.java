package congye6.HotelBooking.mapper.client;

import org.apache.ibatis.annotations.Param;

import congye6.HotelBooking.po.ClientPO;

public interface ClientMapper {
	/**
	 * 根据id查找客户
	 * @param clientId
	 * @return
	 * 2017年1月5日
	 */
	public ClientPO getClient(int clientId);
	
	/**
	 * 添加客户
	 * 前置：已经添加客户的账号
	 * @param po
	 * 2017年1月5日
	 */
	public void addClient(ClientPO po);
	
	/**
	 * 更新客户信息
	 * @param po
	 * 2017年1月5日
	 */
	public void updateClient(ClientPO po);
	
	/**
	 * 修改信用值
	 * @param id
	 * @param credit
	 * 2017年1月5日
	 */
	public void updateCredit(@Param("id")int id,@Param("credit")int credit);
}

package congye6.HotelBooking.mapper.client;

import congye6.HotelBooking.po.LevelPO;

public interface LevelMapper {
	/**
	 * 初始化等级所需的信用值
	 * @param po
	 * 2017年1月7日
	 */
	public void addLevel(LevelPO po);
	
	/**
	 * 
	 * @param po
	 * 2017年1月7日
	 */
	public void updateLevel(LevelPO po);
	
	/**
	 * 根据信用值获取等级
	 * @param credit
	 * @return
	 * 2017年1月7日
	 */
	public int getLevel(int credit);
}

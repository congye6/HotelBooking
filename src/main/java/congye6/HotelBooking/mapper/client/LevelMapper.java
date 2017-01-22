package congye6.HotelBooking.mapper.client;

import congye6.HotelBooking.po.LevelPO;

public interface LevelMapper {
	
	
	/**
	 * level存在则更新
	 * 不存在则插入
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

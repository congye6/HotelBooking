package congye6.HotelBooking.mapper.client;

import java.util.List;

import congye6.HotelBooking.po.CreditRecordPO;

public interface CreditRecordMapper {
	/**
	 * 添加信用使用记录
	 * @param po
	 * 2017年1月6日
	 */
	public void addCreditRecord(CreditRecordPO po);
	
	/**
	 * 根据用户id获取信用使用记录
	 * @param userId
	 * @return
	 * 2017年1月6日
	 */
	public List<CreditRecordPO> getCreditRecords(int userId);
}

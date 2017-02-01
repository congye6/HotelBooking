package congye6.HotelBooking.blservice.client;
/**
 * 验证用户是否符合促销条件
 * @author 周聪
 * 2017年2月1日
 */
public interface ClientPromotionValidatorService {

	/**
	 * 是否是生日
	 * 用户不存在为false
	 * @param userId
	 * @return
	 * 2017年2月1日
	 */
	public boolean isBirthday(int userId);
	
	/**
	 * 是否是合作企业
	 * 用户不存在为false
	 * @param userId
	 * @return
	 * 2017年2月1日
	 */
	public boolean isCooperativeEnterprise(int userId);
	
}

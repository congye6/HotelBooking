package congye6.HotelBooking.blservice.client;
/**
 * 验证id是否为客户id
 * @author 周聪
 * 2017年1月22日
 */
public interface ClientValidatorService {
	/**
	 * 验证id是否为客户
	 * @param userId
	 * @return
	 * 2017年1月22日
	 */
	public boolean isClient(int userId);
	
	/**
	 * 验证客户是否可以订酒店
	 * 信用值小于零不能预订
	 * @param userId
	 * @return
	 * 2017年2月1日
	 */
	public boolean isGoodClient(int userId);
}

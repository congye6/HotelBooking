package congye6.HotelBooking.blservice.hotel;
/**
 * 验证是否为酒店id
 * @author 周聪
 * 2017年1月22日
 */
public interface HotelValidatorService {
	/**
	 * 验证是否为酒店id
	 * @param hotelId
	 * @return
	 * 2017年1月22日
	 */
	public boolean isHotel(int hotelId);
	
}

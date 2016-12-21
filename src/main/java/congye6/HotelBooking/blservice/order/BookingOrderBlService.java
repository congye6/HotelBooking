package congye6.HotelBooking.blservice.order;

import java.util.List;

import congye6.HotelBooking.vo.OrderVO;

/**
 * @author congye6
 * 2016年12月21日
 * 下午8:00:50
 */
public interface BookingOrderBlService {
	/**
	 * 根据用户id获取未执行订单
	 * 可取消未执行订单
	 * @author congye6
	 * @param userId
	 * @return
	 */
	public List<OrderVO> getBookingOrdersByUser(String userId);
	
	/**
	 * 根据酒店id获取未执行订单
	 * 可取消未执行订单
	 * @author congye6
	 * @param userId
	 * @return
	 */
	public List<OrderVO> getBookingOrdersByHotel(String hotelId);
	
}

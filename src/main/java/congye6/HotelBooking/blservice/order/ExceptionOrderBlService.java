package congye6.HotelBooking.blservice.order;

import java.util.List;

import congye6.HotelBooking.vo.CheckInVO;
import congye6.HotelBooking.vo.OrderVO;
import congye6.HotelBooking.vo.ResultMessage;

/**
 * @author congye6
 * 2016年12月21日
 * 下午7:34:47
 */
public interface ExceptionOrderBlService {
	/**
	 * 将订单置为异常状态
	 * 前置：订单为未执行状态，超过最晚执行时间
	 * @author congye6
	 * @param orderId
	 * @return
	 */
	public ResultMessage exceptionOrder(String orderId);
	
	/**
	 * 将异常订单延期
	 * @author congye6
	 * @param orderId
	 * @param checkInVO
	 * @return
	 */
	public ResultMessage delayOrder(String orderId,CheckInVO checkInVO);
	
	/**
	 * 根据用户id查找订单
	 * @author congye6
	 * @param userId
	 * @return
	 */
	public List<OrderVO> getExceptionOrdersByUser(String userId);
	
	/**
	 * 根据酒店id查找订单
	 * @author congye6
	 * @param userId
	 * @return
	 */
	public List<OrderVO> getExceptionOrdersByHotel(String hotelId);
	
	/**
	 * 根据酒店id和用户id查找订单
	 * @author congye6
	 * @param userId
	 * @return
	 */
	public List<OrderVO> getExceptionOrders(String hotelId,String userId);
	
	/**
	 * 获取今天异常订单
	 * @author congye6
	 * @return
	 */
	public List<OrderVO> getTodayExceptionOrders();
	
	/**
	 * 根据日期查找异常订单
	 * @author congye6
	 * @param date
	 * @return
	 */
	public List<OrderVO> getExcetionOrdersbyDate(String date);
}

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
	public ResultMessage exceptionOrder(int orderId);
	
	/**
	 * 将异常订单延期
	 * @author congye6
	 * @param orderId
	 * @param checkInVO
	 * @return
	 */
	public ResultMessage delayOrder(int orderId,CheckInVO checkInVO);
	
	
}

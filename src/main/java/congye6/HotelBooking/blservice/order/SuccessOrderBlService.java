package congye6.HotelBooking.blservice.order;

import java.util.List;

import congye6.HotelBooking.vo.OrderVO;
import congye6.HotelBooking.vo.ResultMessage;

/**
 * @author congye6
 * 2016年12月21日
 * 下午7:46:54
 */
public interface SuccessOrderBlService {
	/**
	 * 完成订单
	 * 增加信用值
	 * @author congye6
	 * @param orderId
	 * @return
	 */
	public ResultMessage successOrder(String orderId);
	
	/**
	 * 获取用户完成的订单
	 * @author congye6
	 * @param userId
	 * @return
	 */
	public List<OrderVO> getSuccessOrdersByUser(String userId);
	
	/**
	 * 获取酒店完成的订单
	 * @author congye6
	 * @param userId
	 * @return
	 */
	public List<OrderVO> getSuccessOrdersByHotel(String id);
	
	
}

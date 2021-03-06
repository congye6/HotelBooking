package congye6.HotelBooking.blservice.order;

import java.util.List;

import congye6.HotelBooking.enumeration.OrderState;
import congye6.HotelBooking.vo.CheckInVO;
import congye6.HotelBooking.vo.OrderVO;
import congye6.HotelBooking.vo.ResultMessage;

/**
 * @author congye6
 * 2016年12月21日
 * 下午6:29:04
 */
public interface OrderBlService {
	
	/**
	 * 预订酒店
	 * 前置：酒店房间数足够，只有房间实际退房后才可继续预订
	 * 后置：减少酒店的房间数量
	 * @author congye6
	 * @param vo
	 * @return
	 */
	public ResultMessage makeOrder(OrderVO vo);
	
	/**
	 * 更新订单入住信息
	 * @author congye6
	 * @param orderId
	 * @param checkInVO
	 * @return
	 */
	public ResultMessage updateOrder(int orderId,CheckInVO checkInVO);
	
	/**
	 * 根据id获得订单信息
	 * @param orderId
	 * @return
	 * 2017年1月21日
	 */
	public OrderVO getOrderById(int orderId);
	
	/**
	 * 根据用户id获取具体状态的订单
	 * @author congye6
	 * @param userId
	 * @return
	 */
	public List<OrderVO> getOrdersByUser(int userId,OrderState orderState);
	
	/**
	 * 根据酒店id获取具体状态的订单
	 * @author congye6
	 * @param userId
	 * @return
	 */
	public List<OrderVO> getOrdersByHotel(int hotelId,OrderState orderState);
	
	
	/**
	 * 获取用户在酒店的订单信息
	 * @author congye6
	 * @param userId
	 * @param hotelId
	 * @return
	 */
	public List<OrderVO> getOrders(int userId,int hotelId);
	
	/**
	 * 获取用户在酒店的订单状态
	 * @author congye6
	 * @param userId
	 * @param hotelId
	 * @return
	 */
	public List<OrderState> hasOrdered(int userId,int hotelId);
	
	/**
	 * 查看所有未执行订单
	 * @return
	 * 2017年1月9日
	 */
	public List<OrderVO> getUnfinishOrder();
}

package congye6.HotelBooking.mapper.order;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import congye6.HotelBooking.po.CheckInPO;
import congye6.HotelBooking.po.OrderPO;

/**
 * 维护订单的基本信息
 * 不包含具体的房间信息
 * @author 周聪
 * 2017年1月9日
 */
public interface OrderMapper {
	/**
	 * 添加订单基本信息
	 * @param po
	 * 2017年1月9日
	 */
	public void addOrder(OrderPO po);
	
	/**
	 * 更新订单状态
	 * @param orderId
	 * @param state
	 * 2017年1月9日
	 */
	public void updateOrderState(@Param("orderId")int orderId,@Param("state")String state);
	
	/**
	 * 更改订单入住时间
	 * @param po
	 * 2017年1月9日
	 */  
	public void updateOrderDate(CheckInPO po);
	
	/**
	 * 根据id获取订单信息
	 * @param orderId
	 * @return
	 * 2017年1月21日
	 */
	public OrderPO getOrderById(int orderId);
	
	/**
	 * 根据用户id获取具体状态的订单
	 * @author congye6
	 * @param userId
	 * @return
	 */
	public List<OrderPO> getOrdersByUser(@Param("userId")int userId,@Param("state")String state);
	
	/**
	 * 根据酒店id获取具体状态的订单
	 * @author congye6
	 * @param userId
	 * @return
	 */
	public List<OrderPO> getOrdersByHotel(@Param("hotelId")int hotelId,@Param("state")String state);
	
	/**
	 * 获取用户在酒店的订单信息
	 * @author congye6
	 * @param userId
	 * @param hotelId
	 * @return
	 */
	public List<OrderPO> getOrders(@Param("userId")int userId,@Param("hotelId")int hotelId);
	
	/**
	 * 获取用户在酒店的订单状态
	 * @author congye6
	 * @param userId
	 * @param hotelId
	 * @return
	 */
	public List<String> getOrderState(@Param("userId")int userId,@Param("hotelId")int hotelId);

	/**
	 * 查看所有未执行订单
	 * @return
	 * 2017年1月9日
	 */
	public List<OrderPO> getUnfinishOrder();
}

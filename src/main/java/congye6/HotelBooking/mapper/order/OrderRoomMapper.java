package congye6.HotelBooking.mapper.order;

import java.util.List;

import congye6.HotelBooking.po.OrderRoomPO;

/**
 * 订单预订的具体房间类型与数量
 * @author 周聪
 * 2017年1月11日
 */
public interface OrderRoomMapper {
	/**
	 * 添加预订的房间
	 * @param po
	 * 2017年1月11日
	 */
	public void addOrderRoom(OrderRoomPO po);
	
	/**
	 * 根据订单号获取订单预订的房间
	 * @param orderId
	 * @return
	 * 2017年1月11日
	 */
	public List<OrderRoomPO> getOrderRoom(int orderId);
}

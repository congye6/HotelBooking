package congye6.HotelBooking.blservice.order;

public interface HasOrderedService {
	/**
	 * 是否预订过酒店
	 * 包括取消的订单
	 * @param userId
	 * @param hotelId
	 * @return
	 * 2017年1月25日
	 */
	public boolean hasOrdered(int userId,int hotelId);
}

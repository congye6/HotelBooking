package congye6.HotelBooking.blservice.order;

import congye6.HotelBooking.vo.ResultMessage;

public interface CheckOutBlService {
	
	/**
	 * 前置：订单状态为success
	 * 后置：将订单状态置为checkout，房间数加一
	 * 退房
	 * @param orderId
	 * @return
	 * 2017年1月26日
	 */
	public ResultMessage checkOut(int orderId);
	
}

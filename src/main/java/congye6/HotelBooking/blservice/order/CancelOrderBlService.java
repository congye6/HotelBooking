package congye6.HotelBooking.blservice.order;

import java.util.List;

import congye6.HotelBooking.vo.OrderVO;
import congye6.HotelBooking.vo.ResultMessage;

/**
 * @author congye6
 * 2016年12月21日
 * 下午7:47:12
 */
public interface CancelOrderBlService {
	/**
	 * 撤销订单
	 * 如果撤销的订单距离最晚订单执行时间不足6个小时，撤销的同时扣除信用值，信用值为订单的（总价值*1/2）
	 * @author congye6
	 * @param orderId
	 * @return
	 */
	public ResultMessage cancelOrder(int orderId);
	
	/**
	 * 将异常订单置为撤销订单
	 * @author congye6
	 * @param orderId
	 * @param recoverRate 回复信用值的比例
	 * @return
	 */
	public ResultMessage cancelExceptionOrder(int orderId,double recoverRate);
	
}

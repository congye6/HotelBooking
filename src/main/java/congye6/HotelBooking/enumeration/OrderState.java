package congye6.HotelBooking.enumeration;

/**
 * @author congye6
 * 2016年12月21日
 * 下午7:19:17
 */
public enum OrderState {
	BOOKING,//预订
	SUCCESS,//完成入住
	EXCEPTION,//异常（最晚执行时间之前未完成入住）
	CANCEL//取消订单
}

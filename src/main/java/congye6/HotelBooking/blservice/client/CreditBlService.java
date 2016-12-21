package congye6.HotelBooking.blservice.client;

import java.util.List;

import congye6.HotelBooking.vo.CreditRecordVO;
import congye6.HotelBooking.vo.ResultMessage;

/**
 * @author congye6
 * 2016年12月20日
 * 下午3:26:47
 */
public interface CreditBlService {
	/**
	 * 取消订单，减少订单额/2的信用值
	 * 操作后添加使用记录
	 * @author congye6
	 * @param record
	 * @return
	 */
	public ResultMessage cancelOrder(String orderId,int money);
	
	/**
	 * 执行期未办理入住为异常订单
	 * 扣除等于订单额的信用值
	 * 操作后添加使用记录
	 * @author congye6
	 * @param orderId
	 * @param money
	 * @return
	 */
	public ResultMessage exceptionOrder(String orderId,int money);
	
	/**
	 * 完成入住的订单可以增加等于订单额的信用值
	 * 操作后添加使用记录
	 * @author congye6
	 * @param orderId
	 * @param money
	 * @return
	 */
	public ResultMessage successOrder(String orderId,int money);
	
	/**
	 * 充值信用值=money*100
	 * 操作后添加使用记录
	 */
	public ResultMessage recharge(int money);
	
	/**
	 * 根据用户名查找信用使用记录
	 * @author congye6
	 * @param userName
	 * @return
	 */
	public List<CreditRecordVO> getCreditRecords(String userName);
}

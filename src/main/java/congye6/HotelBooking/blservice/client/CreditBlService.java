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
	public ResultMessage cancelOrder(int userId,int orderId,double money);
	
	/**
	 * 执行期未办理入住为异常订单
	 * 扣除等于订单额的信用值
	 * 操作后添加使用记录
	 * @author congye6
	 * @param orderId
	 * @param money
	 * @return
	 */
	public ResultMessage exceptionOrder(int userId,int orderId,double money);
	
	/**
	 * 申诉取消异常的订单
	 * 恢复相应比例的信用值
	 * @param userId
	 * @param orderId
	 * @param money
	 * @param recoverRate
	 * @return
	 * 2017年1月29日
	 */
	public ResultMessage cancelException(int userId,int orderId,double money,double recoverRate);
	
	/**
	 * 完成入住的订单可以增加等于订单额的信用值
	 * 操作后添加使用记录
	 * @author congye6
	 * @param orderId
	 * @param money
	 * @return
	 */
	public ResultMessage successOrder(int userId,int orderId,double money);
	
	/**
	 * 充值信用值=money*100
	 * 操作后添加使用记录
	 */
	public ResultMessage recharge(int userId,double money);
	
	/**
	 * 根据用户名查找信用使用记录
	 * @author congye6
	 * @param userName
	 * @return
	 */
	public List<CreditRecordVO> getCreditRecords(int userId);
}

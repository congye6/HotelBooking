package congye6.HotelBooking.vo;

import congye6.HotelBooking.enumeration.CreditOperation;

/**
 * 用户信用使用记录
 * @author congye6
 * 2016年12月20日
 * 下午7:02:20
 */
public class CreditRecordVO {
	
	/**
	 * user id
	 */
	public String userName;

	/**
	 * 日期
	 */
	public String date;
	
	/**
	 * 订单编号
	 */
	public String orderId;
	
	/**
	 * 信用操作
	 */
	public CreditOperation operation;
	
	/**
	 * 改变的信用值
	 */
	public int change;
	
	/**
	 * 改变后的信用值
	 */
	public int currentCredit;

	/**
	 * @param date
	 * @param orderId
	 * @param operation
	 * @param change
	 * @param currentCredit
	 */
	public CreditRecordVO(String date, String orderId, CreditOperation operation, int change, int currentCredit) {
		super();
		this.date = date;
		this.orderId = orderId;
		this.operation = operation;
		this.change = change;
		this.currentCredit = currentCredit;
	}

	/**
	 * 
	 */
	public CreditRecordVO() {
		super();
	}
	
	
}

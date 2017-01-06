package congye6.HotelBooking.po;

import java.sql.Date;

public class CreditRecordPO {
	/**
	 * user id
	 */
	private int userId;

	/**
	 * 日期
	 */
	private Date date;
	
	/**
	 * 订单编号
	 */
	private String orderId;
	
	/**
	 * 信用操作
	 */
	private String operation;
	
	/**
	 * 改变的信用值
	 */
	private int change;
	
	/**
	 * 改变后的信用值
	 */
	private int currentCredit;

	public CreditRecordPO(int userId, Date date, String orderId, String operation, int change,
			int currentCredit) {
		super();
		this.userId = userId;
		this.date = date;
		this.orderId = orderId;
		this.operation = operation;
		this.change = change;
		this.currentCredit = currentCredit;
	}

	public CreditRecordPO() {
		super();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCreditOperation() {
		return operation;
	}

	public void setCreditOperation(String operation) {
		this.operation = operation;
	}

	public int getChange() {
		return change;
	}

	public void setChange(int change) {
		this.change = change;
	}

	public int getCurrentCredit() {
		return currentCredit;
	}

	public void setCurrentCredit(int currentCredit) {
		this.currentCredit = currentCredit;
	}
	
	
}

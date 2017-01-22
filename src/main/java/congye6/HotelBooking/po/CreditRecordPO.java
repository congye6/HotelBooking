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
	private String date;
	
	/**
	 * 订单编号
	 */
	private int orderId;
	
	/**
	 * 信用操作
	 */
	private String operation;
	
	/**
	 * 改变的信用值
	 */
	private double change;
	
	/**
	 * 改变后的信用值
	 */
	private double currentCredit;

	

	public CreditRecordPO(int userId, String date, int orderId, String operation, double change,
			double currentCredit) {
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCreditOperation() {
		return operation;
	}

	public void setCreditOperation(String operation) {
		this.operation = operation;
	}

	public double getChange() {
		return change;
	}

	public void setChange(double change) {
		this.change = change;
	}

	public double getCurrentCredit() {
		return currentCredit;
	}

	public void setCurrentCredit(double currentCredit) {
		this.currentCredit = currentCredit;
	}
	
	
}

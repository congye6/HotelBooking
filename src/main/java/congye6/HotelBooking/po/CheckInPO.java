package congye6.HotelBooking.po;

public class CheckInPO {
	private int orderId;
	
	/**
	 * 入住时间
	 */
	private String startDate;
	
	/**
	 * 退房时间
	 */
	private String endDate;
	
	/**
	 * 最晚执行时间
	 */
	private String deadline;

	public CheckInPO(int orderId, String startDate, String endDate, String deadline) {
		super();
		this.orderId = orderId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.deadline = deadline;
	}

	public CheckInPO() {
		super();
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	
	
	
	
}

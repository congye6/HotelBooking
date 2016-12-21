package congye6.HotelBooking.vo;

/**
 * @author congye6
 * 2016年12月21日
 * 下午7:06:59
 */
public class CheckInVO {
	/**
	 * 入住时间
	 */
	public String startDate;
	
	/**
	 * 退房时间
	 */
	public String endDate;
	
	/**
	 * 最晚执行时间
	 */
	public String deadline;

	/**
	 * @param startDate
	 * @param endDate
	 * @param deadline
	 */
	public CheckInVO(String startDate, String endDate, String deadline) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.deadline = deadline;
	}

	/**
	 * 
	 */
	public CheckInVO() {
		super();
	}
	
	
}

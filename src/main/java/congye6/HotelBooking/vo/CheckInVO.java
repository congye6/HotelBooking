package congye6.HotelBooking.vo;

import org.hibernate.validator.constraints.NotEmpty;

import congye6.HotelBooking.validator.annotation.FutureDate;

/**
 * @author congye6
 * 2016年12月21日
 * 下午7:06:59
 */
public class CheckInVO {
	/**
	 * 入住时间
	 */
	@NotEmpty(message="{checkin.startDate.null}")
	public String startDate;
	
	/**
	 * 退房时间
	 */
	@NotEmpty(message="{checkin.endDate.null}")
	public String endDate;
	
	/**
	 * 最晚执行时间
	 */
	@NotEmpty(message="{checkin.deadline.null}")
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

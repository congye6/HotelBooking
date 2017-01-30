package congye6.HotelBooking.vo;

import org.hibernate.validator.constraints.NotEmpty;

import congye6.HotelBooking.po.CheckInPO;
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
	
	public CheckInPO getPO(int orderId){
		CheckInPO po=new CheckInPO(orderId, startDate, endDate, deadline);
		return po;
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

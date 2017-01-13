package congye6.HotelBooking.vo;

/**
 * 方法调用的返回结果
 * @author congye6
 * 2016年12月20日
 * 下午3:01:59
 */
public class ResultMessage {
	/**
	 * 表示调用是否成功
	 */
	private boolean success;
	
	/**
	 * 返回消息
	 */
	private String message;
	
	public ResultMessage(boolean success){
		this.success=success;
	}
	
	public ResultMessage(boolean success,String message){
		this.success=success;
		this.message=message;
	}

	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}

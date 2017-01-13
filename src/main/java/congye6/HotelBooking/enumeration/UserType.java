package congye6.HotelBooking.enumeration;

/**
 * @author congye6
 * 2016年12月21日
 * 下午4:30:45
 */
public enum UserType {
	UNKNOW(),//未知用户
	CLIENT(),//客户
	HOTEL_STAFF(),//酒店工作人员
	PROMOTION_STAFF(),//网站促销人员
	ADMIN();//管理员
	
	/*private String toString;
	
	private UserType(String toString){
		this.toString=toString;
	}
	
	public String toString(){
		return toString;
	}*/
}

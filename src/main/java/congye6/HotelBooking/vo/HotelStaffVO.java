package congye6.HotelBooking.vo;

/**
 * 酒店工作人员信息
 * @author congye6
 * 2016年12月21日
 * 下午4:22:45
 */
public class HotelStaffVO {
	/**
	 * 所属酒店id
	 */
	public String hotelId;
	
	/**
	 * 
	 */
	public String hotelName;
	
	/**
	 * 账号id
	 */
	public String id;
	
	/**
	 * 姓名
	 */
	public String name;
	
	public String password;

	/**
	 * @param hotelId
	 * @param hotelName
	 * @param id
	 * @param name
	 */
	public HotelStaffVO(String hotelId, String hotelName, String id, String name,String password) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.id = id;
		this.name = name;
		this.password=password;
	}

	/**
	 * 
	 */
	public HotelStaffVO() {
		super();
	}
	
	
}

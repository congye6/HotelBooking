package congye6.HotelBooking.vo;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

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
	@Min(value=1,message="{hotelId.min}")
	public int hotelId;
	
	/**
	 * 
	 */
	public String hotelName;
	
	/**
	 * 账号id
	 */
	public int id;
	
	/**
	 * 姓名
	 */
	@NotEmpty(message="{name.null}")
	public String name;
	
	@NotEmpty(message="{password.null}")
	public String password;

	/**
	 * @param hotelId
	 * @param hotelName
	 * @param id
	 * @param name
	 */
	public HotelStaffVO(int hotelId, String hotelName, int id, String name,String password) {
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

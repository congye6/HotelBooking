package congye6.HotelBooking.vo;

import congye6.HotelBooking.enumeration.UserType;

/**
 * 登录账号信息
 * @author congye6
 * 2016年12月21日
 * 下午4:29:33
 */
public class AccountVO {

	
	public int id;
	
	public String password;
	
	/**
	 * 用户类型
	 */
	public UserType type;

	/**
	 * @param id
	 * @param password
	 * @param type
	 */
	public AccountVO(int id, String password, UserType type) {
		super();
		this.id = id;
		this.password = password;
		this.type = type;
	}

	/**
	 * @param id
	 * @param password
	 */
	public AccountVO(int id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	/**
	 * 
	 */
	public AccountVO() {
		super();
	}
	
	
}

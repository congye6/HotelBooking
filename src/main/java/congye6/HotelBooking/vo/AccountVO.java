package congye6.HotelBooking.vo;

import org.hibernate.validator.constraints.NotEmpty;

import congye6.HotelBooking.enumeration.UserType;

/**
 * 登录账号信息
 * @author congye6
 * 2016年12月21日
 * 下午4:29:33
 */
public class AccountVO {

	
	public int id;
	
	@NotEmpty(message="{client.password.isNull}")
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}
	
	
}

package congye6.HotelBooking.vo;

/**
 * 客户基本信息
 * @author congye6
 * 2016年12月20日
 * 下午3:11:23
 */
public class ClientVO {
	/**
	 * 用户名
	 */
	public String userName;
	
	/**
	 * 用户密码，已加密
	 */
	public String password;
	
	/**
	 * 客户姓名
	 */
	public String name;
	
	/**
	 * 客户联系方式
	 */
	public String phoneNumber;
	
	/**
	 * 客户信用值，客户不能修改，初始值为3000
	 */
	public int credit;

	/**
	 * @param userName
	 * @param password
	 * @param name
	 * @param phoneNumber
	 */
	public ClientVO(String userName, String password, String name, String phoneNumber) {
		super();
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	/**
	 * 
	 */
	public ClientVO() {
		super();
	}
}

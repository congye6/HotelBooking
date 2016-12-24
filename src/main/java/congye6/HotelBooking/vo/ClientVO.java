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
	public String id;
	

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
	 * 
	 */
	public String birthday;
	
	public String company;
	
	public String password;

	
	/**
	 * @param id
	 * @param name
	 * @param phoneNumber
	 * @param credit
	 */
	public ClientVO(String id, String name, String phoneNumber, int credit,String password,String birthday) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.credit = credit;
		this.password=password;
		this.birthday=birthday;
	}
	
	/**
	 * 
	 */
	public ClientVO() {
		super();
	}
}

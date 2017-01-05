package congye6.HotelBooking.po;

import java.sql.Date;

public class ClientPO {
	/**
	 * 用户名
	 */
	private String id;
	

	/**
	 * 客户姓名
	 */
	private String name;
	
	/**
	 * 客户联系方式
	 */
	private String phoneNumber;
	
	/**
	 * 客户信用值，客户不能修改，初始值为3000
	 */
	private int credit;
	
	/**
	 * 
	 */
	private Date birthday;
	
	private String company;

	public ClientPO(String id, String name, String phoneNumber, int credit, Date birthday, String company) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.credit = credit;
		this.birthday = birthday;
		this.company = company;
	}

	public ClientPO() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
	
	
	
}

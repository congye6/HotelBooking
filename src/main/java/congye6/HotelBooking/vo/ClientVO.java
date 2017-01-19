package congye6.HotelBooking.vo;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import congye6.HotelBooking.util.StringUtil;
import congye6.HotelBooking.validator.annotation.PastDate;

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
	public int id;
	

	/**
	 * 客户姓名
	 */
	@NotEmpty(message="{client.name.isNull}")
	public String name;
	
	/**
	 * 客户联系方式
	 */
	@Pattern(message="{phoneNumber}", regexp =StringUtil.PHONE_NUMBER_PATTERN)
	public String phoneNumber;
	
	/**
	 * 客户信用值，客户不能修改，初始值为3000
	 */
	public int credit;
	
	/**
	 * 
	 */
	@PastDate(message="{client.birthday.past}")
	public String birthday;
	
	public String company;
	
	@NotEmpty(message="{client.password.isNull}")
	public String password;

	
	/**
	 * @param id
	 * @param name
	 * @param phoneNumber
	 * @param credit
	 */
	public ClientVO(int id, String name, String phoneNumber, int credit,String password,String birthday) {
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

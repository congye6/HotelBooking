package congye6.HotelBooking.vo;

import congye6.HotelBooking.Util.StringUtil;

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
	 * 检验vo
	 * @return
	 * 2017年1月14日
	 */
	public ResultMessage validate(){
		ResultMessage message=new ResultMessage(false);
		if(StringUtil.isNull(name)||StringUtil.isNull(password)){
			message.setMessage("请填写用户名和密码");
			return message;
		}
			
		
		return message;
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

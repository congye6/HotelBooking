package congye6.HotelBooking.vo;



import java.sql.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import congye6.HotelBooking.util.DateUtil;
import congye6.HotelBooking.util.StringUtil;
import jdk.internal.instrumentation.TypeMapping;

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
	@DateTimeFormat(pattern="yyyy-mm-dd")
	@Past(message="{client.birthday.past}")
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
	public ClientVO(int id, String name, String phoneNumber, int credit,String password,Date birthday) {
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
	/*public ResultMessage validate(){
		ResultMessage message=new ResultMessage(false);
		if(StringUtil.isNull(name)||StringUtil.isNull(password)){
			message.setMessage("请填写用户名和密码");
			return message;
		}
		//如果填写了手机号，手机号码必须符合格式
		if(!StringUtil.isNull(phoneNumber)&&!StringUtil.isPhoneNumber(phoneNumber)){
			message.setMessage("请填写正确的手机号");
			return message;
		}
		
		if(!StringUtil.isDate(birthday)||!DateUtil.isBeforeDate(birthday)){
			message.setMessage("请输入正确的生日");
			return message;
		}
		
		message.setSuccess(true);
		return message;
	}*/
	
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

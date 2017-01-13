package congye6.HotelBooking.po;

import congye6.HotelBooking.vo.AccountVO;

public class AccountPO {
	private int id;
	
	private String password;
	
	/**
	 * 用户类型
	 */
	private String type;
	
	

	public AccountPO() {
		super();
	}

	public AccountPO( String password, String type) {
		super();
		this.password = password;
		this.type = type;
	}
	
	public AccountPO(AccountVO vo){
		this.password=vo.password;
		this.id=vo.id;
		this.type=vo.type.toString();
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}

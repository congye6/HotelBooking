package congye6.HotelBooking.po;

public class HotelPO {
	/**
	 * 
	 */
	private int id;
	
	/**
	 * 酒店名称
	 */
	private String name;
	
	/**
	 * 地址
	 */
	private String address;
	
	/**
	 * 所属城市
	 */
	private String city;
	
	/**
	 * 所属商圈
	 */
	private String circle;
	
	/**
	 * 简介
	 */
	private String introduction;
	
	/**
	 * 酒店星级
	 */
	private int star;
	
	

	public HotelPO() {
		super();
	}

	public HotelPO(int id, String name, String address, String city, String circle, String introduction, int star) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.circle = circle;
		this.introduction = introduction;
		this.star = star;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}
	
	
}

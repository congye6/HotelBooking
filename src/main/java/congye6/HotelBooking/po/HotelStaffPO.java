package congye6.HotelBooking.po;

public class HotelStaffPO {
	/**
	 * 员工id
	 */
	private int id;
	
	/**
	 * 所属酒店id，一个酒店一个员工
	 */
	private int hotelId;

	private String name;

	public HotelStaffPO(int id, int hotelId, String name) {
		super();
		this.id = id;
		this.hotelId = hotelId;
		this.name = name;
	}
	
	

	public HotelStaffPO() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
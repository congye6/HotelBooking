package congye6.HotelBooking.po;

public class RoomPO {
	/**
	 * 所属酒店
	 */
	private int hotelId;
	
	/**
	 * 房间类型
	 */
	private String type;
	
	/**
	 * 房间数量
	 */
	private int number;
	
	/**
	 * 价格
	 */
	private double price;

	public RoomPO(int hotelId, String type, int number, double price) {
		super();
		this.hotelId = hotelId;
		this.type = type;
		this.number = number;
		this.price = price;
	}

	public RoomPO() {
		super();
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}

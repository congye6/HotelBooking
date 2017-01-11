package congye6.HotelBooking.po;

public class DiscountPO {
	private int hotelId;
	
	private String type;
	
	private double discount;

	public DiscountPO(int hotelId, String type, double discount) {
		super();
		this.hotelId = hotelId;
		this.type = type;
		this.discount = discount;
	}

	public DiscountPO() {
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

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
}

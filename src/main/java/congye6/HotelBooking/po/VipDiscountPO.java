package congye6.HotelBooking.po;

public class VipDiscountPO {
	private int level;
	
	private String circle;
	
	private double discount;

	public VipDiscountPO(int level, String circle, double discount) {
		super();
		this.level = level;
		this.circle = circle;
		this.discount = discount;
	}

	public VipDiscountPO() {
		super();
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
}

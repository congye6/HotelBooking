package congye6.HotelBooking.po;

import java.sql.Date;

public class OrderPO {
	private int id;
	
	private int userId;
	
	private int hotelId;
	
	private String startDate;
	
	private String endDate;
	
	private String deadline;
	
	private double price;
	
	private String state;
	
	private int numberOfPeople;
	
	private boolean withChildren;

	public OrderPO(int id, int userId, int hotelId, String startDate, String endDate, String deadline, double price,
			String state, int numberOfPeople, boolean withChildren) {
		super();
		this.id = id;
		this.userId = userId;
		this.hotelId = hotelId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.deadline = deadline;
		this.price = price;
		this.state = state;
		this.numberOfPeople = numberOfPeople;
		this.withChildren = withChildren;
	}

	public OrderPO() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	public boolean isWithChildren() {
		return withChildren;
	}

	public void setWithChildren(boolean withChildren) {
		this.withChildren = withChildren;
	}
	
	
}

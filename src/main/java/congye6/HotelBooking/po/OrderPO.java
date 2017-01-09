package congye6.HotelBooking.po;

import java.sql.Date;

public class OrderPO {
	private int id;
	
	private int userId;
	
	private int hotelId;
	
	private Date startDate;
	
	private Date endDate;
	
	private Date deadline;
	
	private double price;
	
	private String state;
	
	private int numberOfPeople;
	
	private boolean withChildren;
	

	public OrderPO(int id, int userId, int hotelId, Date startDate, Date endDate, Date deadline, double price,
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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
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

	public boolean getWithChildren() {
		return withChildren;
	}

	public void setWithChildren(boolean withChildren) {
		this.withChildren = withChildren;
	}
}

package congye6.HotelBooking.po;
/**
 * 订单预订的具体房间类型与数量
 * @author 周聪
 * 2017年1月11日
 */
public class OrderRoomPO {
	private int orderId;
	
	private String type;
	
	private int number;

	public OrderRoomPO(int orderId, String type, int number) {
		super();
		this.orderId = orderId;
		this.type = type;
		this.number = number;
	}

	public OrderRoomPO() {
		super();
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
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
	
	
}

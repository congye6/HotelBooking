package congye6.HotelBooking.po;

public class CommentPO {
	/**
	 * 评论人
	 */
	private int userId;
	
	/**
	 * 酒店id
	 */
	private int hotelId;
	
	private String comment;
	
	/**
	 * 评分
	 * 1-5星
	 */
	private int score;

	public CommentPO(int userId, int hotelId, String comment, int score) {
		super();
		this.userId = userId;
		this.hotelId = hotelId;
		this.comment = comment;
		this.score = score;
	}

	public CommentPO() {
		super();
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}

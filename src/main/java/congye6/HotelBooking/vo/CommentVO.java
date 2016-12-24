package congye6.HotelBooking.vo;

/**
 * 评论
 * @author congye6
 * 2016年12月24日
 * 上午9:51:06
 */
public class CommentVO {
	/**
	 * 评论人
	 */
	public String userId;
	
	/**
	 * 酒店id
	 */
	public String hotelId;
	
	public String comment;
	
	/**
	 * 评分
	 * 1-5星
	 */
	public int score;

	/**
	 * @param userId
	 * @param hotelId
	 * @param comment
	 * @param star
	 */
	public CommentVO(String userId, String hotelId, String comment, int score) {
		super();
		this.userId = userId;
		this.hotelId = hotelId;
		this.comment = comment;
		this.score = score;
	}

	/**
	 * 
	 */
	public CommentVO() {
		super();
	}
	
	
}

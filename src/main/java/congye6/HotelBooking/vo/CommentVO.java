package congye6.HotelBooking.vo;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

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
	@Min(value=1,message="{userId.min}")
	public int userId;
	
	/**
	 * 酒店id
	 */
	@Min(value=1,message="{hotelId.min}")
	public int hotelId;
	
	@NotEmpty(message="{comment.null}")
	public String comment;
	
	/**
	 * 评分
	 * 1-5星
	 */
	@Range(min=1,max=5,message="{comment.score.range}")
	public int score;

	/**
	 * @param userId
	 * @param hotelId
	 * @param comment
	 * @param star
	 */
	public CommentVO(int userId, int hotelId, String comment, int score) {
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

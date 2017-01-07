package congye6.HotelBooking.mapper.hotel;

import java.util.List;

import congye6.HotelBooking.po.CommentPO;

public interface CommentMapper {
	/**
	 * 添加评论
	 * @param po
	 * 2017年1月7日
	 */
	public void addComment(CommentPO po);
	
	/**
	 * 获取酒店的评论
	 * @param hotelId
	 * @return
	 * 2017年1月7日
	 */
	public List<CommentPO> getComments(int hotelId);
}

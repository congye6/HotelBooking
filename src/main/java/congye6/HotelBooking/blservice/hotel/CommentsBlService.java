package congye6.HotelBooking.blservice.hotel;

import java.util.List;

import congye6.HotelBooking.vo.CommentVO;
import congye6.HotelBooking.vo.ResultMessage;

/**
 * @author congye6
 * 2016年12月21日
 * 下午8:39:23
 */
public interface CommentsBlService {
	/**
	 * 添加评论和评分
	 * @author congye6
	 * @param vo
	 * @return
	 */
	public ResultMessage sendComment(CommentVO vo);
	
	/**
	 * 获取酒店的评分
	 * @author congye6
	 * @param hotelId
	 * @return
	 */
	public double getScore(String hotelId);
	
	/**
	 * 获取酒店的评论
	 * @param hotelId
	 * @return
	 * 2017年1月7日
	 */
	public List<CommentVO> getComments(int hotelId);
}

package congye6.HotelBooking.blservice.hotel.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.client.ClientBlService;
import congye6.HotelBooking.blservice.client.ClientValidatorService;
import congye6.HotelBooking.blservice.hotel.CommentsBlService;
import congye6.HotelBooking.blservice.hotel.HotelBlService;
import congye6.HotelBooking.blservice.hotel.HotelValidatorService;
import congye6.HotelBooking.mapper.hotel.CommentMapper;
import congye6.HotelBooking.po.CommentPO;
import congye6.HotelBooking.util.DoubleUtil;
import congye6.HotelBooking.vo.ClientVO;
import congye6.HotelBooking.vo.CommentVO;
import congye6.HotelBooking.vo.ResultMessage;
@Service
public class CommentBl implements CommentsBlService{

	@Autowired
	private CommentMapper mapper;
	
	@Autowired
	private ClientValidatorService clientValidator;
	
	@Autowired
	private HotelValidatorService hotelValidator;
	
	@Override
	public ResultMessage sendComment(CommentVO comment) {
		//验证用户id与酒店id是否存在
		if(!clientValidator.isClient(comment.userId))
			return new ResultMessage(false,"用户id不存在");
		if(!hotelValidator.isHotel(comment.hotelId))
			return new ResultMessage(false, "酒店id不存在");
		
		CommentPO po=new CommentPO();
		BeanUtils.copyProperties(comment, po);
		mapper.addComment(po);
		return new ResultMessage(true);
	}

	@Override
	public double getScore(int hotelId) {
		List<CommentPO> comments=mapper.getComments(hotelId);
		
		//暂无评分
		if(comments.size()==0)
			return 0;
		
		double sum=0;
		for(CommentPO comment:comments){
			sum+=comment.getScore();
		}
		return  DoubleUtil.round(sum/comments.size(), 2);
	}

	@Override
	public List<CommentVO> getComments(int hotelId) {
		List<CommentPO> comments=mapper.getComments(hotelId);
		List<CommentVO> results=new ArrayList<>();
		for(CommentPO comment:comments){
			CommentVO vo=new CommentVO();
			BeanUtils.copyProperties(comment, vo);
			results.add(vo);
		}
		return results;
	}

}

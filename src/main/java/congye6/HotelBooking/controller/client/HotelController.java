/**
 * 
 */
package congye6.HotelBooking.controller.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import congye6.HotelBooking.blservice.hotel.CommentsBlService;
import congye6.HotelBooking.blservice.hotel.HotelBlService;
import congye6.HotelBooking.blservice.hotel.RoomBlService;
import congye6.HotelBooking.vo.CommentVO;
import congye6.HotelBooking.vo.HotelVO;
import congye6.HotelBooking.vo.RoomVO;

/**
 * @author congye6
 *
 */
@Controller
public class HotelController {

	@Autowired
	private HotelBlService hotelBl;
	
	@Autowired
	private RoomBlService roomBl;
	
	@Autowired
	private CommentsBlService commentBl;
	
	/**
	 * 进入酒店主页
	 * @return
	 */
	@RequestMapping(value="/hotel/{id}",method=RequestMethod.GET)
	public ModelAndView getHotel(@PathVariable Integer id){
		ModelAndView modelAndView=new ModelAndView("client/hotelInfo");
		//酒店基本信息
		HotelVO hotel=hotelBl.getHotel(id);
		modelAndView.addObject("hotel",hotel);
		//酒店评论
		List<CommentVO> comments=commentBl.getComments(id);
		modelAndView.addObject("comments",comments);
		//酒店客房信息
		List<RoomVO> rooms=roomBl.getRoomInfos(id);
		modelAndView.addObject("rooms", rooms);
		
		return modelAndView;
	}
	
}

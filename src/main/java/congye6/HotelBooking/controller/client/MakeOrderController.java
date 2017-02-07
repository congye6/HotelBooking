/**
 * 
 */
package congye6.HotelBooking.controller.client;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import congye6.HotelBooking.blservice.hotel.HotelBlService;
import congye6.HotelBooking.blservice.hotel_promotion.HotelPromotionBlService;
import congye6.HotelBooking.blservice.order.OrderBlService;
import congye6.HotelBooking.blservice.website_promotion.SitePromotionBlService;
import congye6.HotelBooking.enumeration.RoomType;
import congye6.HotelBooking.util.CookieHelper;
import congye6.HotelBooking.util.DoubleUtil;
import congye6.HotelBooking.vo.OrderVO;
import congye6.HotelBooking.vo.ResultMessage;

/**
 * @author congye6
 *
 */
@Controller
public class MakeOrderController {
	
	@Autowired
	private SitePromotionBlService sitePromotion;
	
	@Autowired
	private HotelPromotionBlService hotelPromotion;
	
	@Autowired
	private OrderBlService orderBl;;

	/**
	 * 生成预订单
	 * 提交给用户
	 * @return
	 */
	@RequestMapping(value="/order/{hotelId}/{type}",method=RequestMethod.GET)
	public ModelAndView makeOrder(@PathVariable("hotelId") Integer hotelId
			,@PathVariable("type")String type,HttpServletRequest request){
		ModelAndView modelAndView=new ModelAndView("client/order");
		String userId=CookieHelper.getCookie(request, CookieHelper.ID);
		OrderVO order=new OrderVO(Integer.parseInt(userId), null, hotelId, 0, false,null, 0);
		
		//添加预订房间数量，模拟只能预订一间
		Map<RoomType,Integer> roomOrder=new HashMap<>();
		roomOrder.put(RoomType.valueOf(type), 1);
		order.roomOrder=roomOrder;
		
		//网站折扣
		double siteDiscount=sitePromotion.getDiscount(order);
		//酒店折扣价
		double price=hotelPromotion.getPrice(order);
		order.setPrice(DoubleUtil.round(price*siteDiscount, 2));
		
		modelAndView.addObject("order",order);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/order",method=RequestMethod.PUT)
	public @ResponseBody ResultMessage addOrder(@RequestBody OrderVO order){
		return orderBl.makeOrder(order);
	}
	
}

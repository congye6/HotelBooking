package congye6.HotelBooking.controller.index;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import congye6.HotelBooking.blservice.user.AccountBlService;
import congye6.HotelBooking.enumeration.UserType;
import congye6.HotelBooking.util.CookieHelper;
@Controller
public class IndexController {

	@Autowired
	private AccountBlService accountBl;
	
	@Autowired
	private IndexDispatcher dispatcher;
	
	/**
	 * 已登录用户根据id进入不同身份的界面
	 * 2017年1月18日
	 * @throws IOException 
	 * @throws ServletException 
	 */
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		int id=Integer.parseInt(CookieHelper.getCookie(request, CookieHelper.USER_NAME));
		String password=CookieHelper.getCookie(request, CookieHelper.PASSWORD);
		UserType userType=accountBl.getUserType(id, password);
		String url=dispatcher.getUrl(userType);
		return new ModelAndView("forward:"+url);
	}
	
	
	
}

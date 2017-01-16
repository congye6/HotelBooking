package congye6.HotelBooking.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping("/loginPage")
	public ModelAndView loginPage(){
		ModelAndView modelAndView=new ModelAndView("user/login");
		return modelAndView;
	}
}

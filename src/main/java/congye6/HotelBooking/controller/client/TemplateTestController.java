package congye6.HotelBooking.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TemplateTestController {
	
	@RequestMapping("/client")
	public ModelAndView client(){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("client/clientTemplate");
		
		return modelAndView;
	}
	
	
}

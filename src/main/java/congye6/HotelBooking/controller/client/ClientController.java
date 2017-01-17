package congye6.HotelBooking.controller.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import congye6.HotelBooking.blservice.client.ClientBlService;
import congye6.HotelBooking.vo.ClientVO;
import congye6.HotelBooking.vo.ResultMessage;

@Controller("/client")
public class ClientController {
	
	@Autowired
	private ClientBlService clientBl;
	
	
	@RequestMapping(method=RequestMethod.PUT)
	public @ResponseBody ResultMessage client(@RequestBody ClientVO vo){
		System.out.println(vo.name);
		ResultMessage message=clientBl.register(vo);
		return message;
	}

}

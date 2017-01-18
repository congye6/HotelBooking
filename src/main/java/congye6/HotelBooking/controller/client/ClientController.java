package congye6.HotelBooking.controller.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import congye6.HotelBooking.blservice.client.ClientBlService;
import congye6.HotelBooking.vo.ClientVO;
import congye6.HotelBooking.vo.ResultMessage;

@Controller("/client")
public class ClientController {
	
	@Autowired
	private ClientBlService clientBl;
	
	
	@RequestMapping(method=RequestMethod.PUT)
	public @ResponseBody ResultMessage client(@RequestBody @Validated ClientVO vo,BindingResult validateResult){
		if(validateResult.hasErrors()){
			List<ObjectError> errors=validateResult.getAllErrors();
			ResultMessage message=new ResultMessage(false, errors.get(0).getDefaultMessage());
			return message;
		}
		
		ResultMessage message=clientBl.register(vo);
		return message;
	}

}

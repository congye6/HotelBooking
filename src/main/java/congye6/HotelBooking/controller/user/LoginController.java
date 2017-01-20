package congye6.HotelBooking.controller.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import congye6.HotelBooking.blservice.user.AccountBlService;
import congye6.HotelBooking.util.CookieHelper;
import congye6.HotelBooking.vo.AccountVO;
import congye6.HotelBooking.vo.ResultMessage;

@Controller
public class LoginController {
	
	@Autowired
	private AccountBlService accountBl;
	
	@RequestMapping(value="/loginPage",method=RequestMethod.GET)
	public ModelAndView loginPage(){
		ModelAndView modelAndView=new ModelAndView("user/login");
		return modelAndView;
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public @ResponseBody ResultMessage login(@RequestBody @Validated AccountVO vo,
			HttpServletResponse response,HttpServletRequest request,BindingResult validateResult){
		if(validateResult.hasErrors()){
			List<ObjectError> errors=validateResult.getAllErrors();
			ResultMessage message=new ResultMessage(false, errors.get(0).getDefaultMessage());
			return message;
		}
		
		ResultMessage message=accountBl.login(vo.id, vo.password);
		if(message.isSuccess()){
			CookieHelper.addCookie(CookieHelper.ID, vo.id+"", response, request);
			CookieHelper.addCookie(CookieHelper.PASSWORD, vo.password, response, request);
		}
			
		return message;
	}
}

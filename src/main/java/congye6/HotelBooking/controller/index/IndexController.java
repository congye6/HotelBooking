package congye6.HotelBooking.controller.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import congye6.HotelBooking.blservice.user.AccountBlService;
import congye6.HotelBooking.enumeration.UserType;
@Controller
public class IndexController {

	@Autowired
	private AccountBlService accountBl;
	
	/**
	 * 已登录用户根据id进入不同身份的界面
	 * 2017年1月18日
	 */
	@RequestMapping("/{id}/{password}")
	public void index(@PathVariable("id") Integer id,@PathVariable("password")String password){
		UserType userType=accountBl.getUserType(id, password);
	}
	
	/**
	 * 未登录用户进入选酒店页面
	 * 2017年1月18日
	 */
	public void index(){
		
	}
}

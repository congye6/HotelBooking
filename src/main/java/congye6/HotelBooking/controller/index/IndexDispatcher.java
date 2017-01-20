package congye6.HotelBooking.controller.index;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import congye6.HotelBooking.controller.client.ClientController;
import congye6.HotelBooking.enumeration.UserType;

/**
 * 根据不同身份
 * 将请求交给不同controller处理
 * @author 周聪
 * 2017年1月19日
 */
public class IndexDispatcher {
	/**
	 * 用户身份映射到不同用户主页的url
	 */
	private static final Map<UserType,String> INDEX_URL_MAP=new HashMap<>();
	static{
		INDEX_URL_MAP.put(UserType.CLIENT, "/client");
	}
	
	public String getUrl(UserType type){
		return INDEX_URL_MAP.get(type);
	}

}

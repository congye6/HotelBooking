package congye6.HotelBooking.controller.index;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import congye6.HotelBooking.controller.client.ClientController;
import congye6.HotelBooking.enumeration.UserType;

/**
 * 根据不同身份
 * 将请求交给不同controller处理
 * @author 周聪
 * 2017年1月19日
 */
public class IndexDispatcher {
	
	private static final Map<UserType,Method> CONTROLLER_MAP=new HashMap<>();
	static{
		try {
			CONTROLLER_MAP.put(UserType.CLIENT, ClientController.class.getMethod("index", int.class));
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

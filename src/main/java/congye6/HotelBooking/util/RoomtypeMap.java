/**
 * 
 */
package congye6.HotelBooking.util;

import java.util.HashMap;
import java.util.Map;

import congye6.HotelBooking.enumeration.RoomType;

/**
 * @author congye6
 *
 */
public class RoomtypeMap {

	private static final Map<String,RoomType> ROOMTYPE_MAP=new HashMap<>();
	
	static{
		ROOMTYPE_MAP.put("单人间", RoomType.SINGLE);
		ROOMTYPE_MAP.put("双人间", RoomType.DOUBLE);
		ROOMTYPE_MAP.put("三人间", RoomType.TRIPLE);
		ROOMTYPE_MAP.put("套房", RoomType.SUIT);
		ROOMTYPE_MAP.put("总统套房", RoomType.PRESIDENT);
	}
	
	/**
	 * 根据字符串获取房间类型
	 * @param str
	 * @return
	 */
	public static RoomType getRoomType(String str){
		if(!ROOMTYPE_MAP.containsKey(str))
			return null;
		return ROOMTYPE_MAP.get(str);
	}
	
	
}

package congye6.HotelBooking.vo;

import java.util.ArrayList;
import java.util.List;

import congye6.HotelBooking.enumeration.RoomType;
import congye6.HotelBooking.enumeration.SearchHotelCondition;
import congye6.HotelBooking.util.RoomtypeMap;

public class HotelSearchVO {
	
	public String city;
	
	public String circle;
	

	/**
	 * 酒店名称
	 */
	public String name;
	
	/**
	 * 星级
	 */
	public Integer star;
	
	/**
	 * 评分
	 */
	public Double score;
	
	/**
	 * 房间类型
	 */
	public String roomType;
	
	/**
	 * 房间数量
	 */
	public Integer number;
	
	/**
	 * 入住时间
	 */
	public String checkInDate;
	
	/**
	 * 房间最高价
	 */
	public Double high;
	
	/**
	 * 
	 */
	public Double low;
	
	
	public List<ConditionVO> getConditions(){
		List<ConditionVO> conditions=new ArrayList<>();
		if(name!=null){
			ConditionVO condition=new ConditionVO(SearchHotelCondition.NAME,name);
			conditions.add(condition);
		}
		
		if(star!=null){
			ConditionVO condition=new ConditionVO(SearchHotelCondition.STAR, star);
			conditions.add(condition);
		}
		
		if(score!=null){
			ConditionVO condition=new ConditionVO(SearchHotelCondition.SCORE, score);
			conditions.add(condition);
		}
		
		//获取房间类型，如果不存在之间返回结果
		RoomType type=RoomtypeMap.getRoomType(roomType);
		if(type==null)
			return conditions;
		
		if(number!=null&&checkInDate!=null){
			ConditionVO condition=new ConditionVO(SearchHotelCondition.ROOM_NUMBER, 
					new RoomNumberVO(type,number,checkInDate));
			conditions.add(condition);
		}
		
		if(high!=null||low!=null){
			ConditionVO condition=new ConditionVO(SearchHotelCondition.ROOM_PRICE, 
					new RoomPriceVO(type, low, high));
			conditions.add(condition);
		}
		
		return conditions;
	}
}

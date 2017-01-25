package congye6.HotelBooking.vo;

import congye6.HotelBooking.enumeration.SearchHotelCondition;

/**
 * 搜索酒店的条件
 * @author 周聪
 * 2017年1月22日
 */
public class ConditionVO {

	/**
	 * 搜索的方法
	 */
	public SearchHotelCondition condition;
	
	/**
	 * 搜索的范围
	 */
	public Object value;

	public ConditionVO(SearchHotelCondition condition, Object value) {
		super();
		this.condition = condition;
		this.value = value;
	}

	public ConditionVO() {
		super();
	}
	
	
	
}

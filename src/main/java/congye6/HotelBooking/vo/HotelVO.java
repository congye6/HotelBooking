package congye6.HotelBooking.vo;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

/**
 * 酒店基本信息
 * @author congye6
 * 2016年12月20日
 * 下午7:41:51
 */
public class HotelVO {
	/**
	 * 
	 */
	public int id;
	
	/**
	 * 酒店名称
	 */
	@NotEmpty(message="{hotel.name.null}")
	public String name;
	
	/**
	 * 地址
	 */
	public String address;
	
	/**
	 * 所属城市
	 */
	@NotEmpty(message="{hotel.city.null}")
	public String city;
	
	/**
	 * 所属商圈
	 */
	@NotEmpty(message="{hotel.circle.null}")
	public String circle;
	
	/**
	 * 简介
	 */
	public String introduction;
	
	/**
	 * 酒店星级
	 */
	@Range(min=0 ,max=6, message="{hotel.star.range}")
	public int star;
}

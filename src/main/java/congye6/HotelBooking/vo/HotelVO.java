package congye6.HotelBooking.vo;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.BeanUtils;

import congye6.HotelBooking.po.HotelPO;

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
	
	public HotelVO(){
		
	}
	
	public HotelVO(HotelPO po){
		BeanUtils.copyProperties(po, this);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}
}

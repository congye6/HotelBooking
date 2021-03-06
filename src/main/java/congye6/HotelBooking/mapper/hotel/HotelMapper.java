package congye6.HotelBooking.mapper.hotel;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import congye6.HotelBooking.po.HotelPO;

public interface HotelMapper {
	
	/**
	 * 根据酒店id获取酒店信息
	 * @param hotelId
	 * @return
	 * 2017年1月22日
	 */
	public HotelPO getHotel(int hotelId);
	
	/**
	 * 根据城市和商圈查找酒店
	 * @author congye6
	 * @param city
	 * @param commecialCircle
	 * @return
	 */
	public List<HotelPO> getHotels(@Param("city")String city,@Param("circle")String circle);
	
	/**
	 * 管理员添加酒店
	 * 有酒店名称即可
	 * @author congye6
	 * @param hotel
	 * @return
	 */
	public int addHotel(HotelPO hotel);
	
	/**
	 * 酒店管理人员更新酒店信息
	 * @author congye6
	 * @param hotel
	 * @return
	 */
	public void updateHotel(HotelPO hotel);
}

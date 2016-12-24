package congye6.HotelBooking.blservice.hotel;

import java.util.List;
import java.util.Map;

import congye6.HotelBooking.vo.HotelVO;
import congye6.HotelBooking.vo.ResultMessage;

/**
 * @author congye6
 * 2016年12月20日
 * 下午8:17:06
 */
public interface HotelBlService {

	/**
	 * 根据城市和商圈查找酒店
	 * @author congye6
	 * @param city
	 * @param commecialCircle
	 * @return
	 */
	public List<HotelVO> getHotels(String city,String commecialCircle);
	
	/**
	 * 酒店筛选
	 * 前置：已填写城市和商圈
	 * @author congye6
	 * @param city
	 * @param commecialCircle
	 * @param conditions
	 * @return
	 */
	public List<HotelVO> getHotels(String city,String commecialCircle,Map<String,?> conditions);
	
	/**
	 * 管理员添加酒店
	 * 有酒店名称即可
	 * @author congye6
	 * @param hotel
	 * @return
	 */
	public ResultMessage addHotel(HotelVO hotel);
	
	/**
	 * 酒店管理人员更新酒店信息
	 * @author congye6
	 * @param hotel
	 * @return
	 */
	public ResultMessage updateHotel(HotelVO hotel);
	
}

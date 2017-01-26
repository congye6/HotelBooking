package congye6.HotelBooking.blservice.hotel;

import java.util.List;

import congye6.HotelBooking.enumeration.RoomType;
import congye6.HotelBooking.vo.ResultMessage;
import congye6.HotelBooking.vo.RoomVO;

/**
 * 酒店客房数量管理
 * @author congye6
 * 2016年12月20日
 * 下午8:24:10
 */
public interface RoomBlService {
	
	/**
	 * 获得酒店各类型的可用客房数和价格
	 * @author congye6
	 * @param hotelId
	 * @return
	 */
	public List<RoomVO> getRoomInfos(int hotelId);
	
	/**
	 * 录入可用客房
	 * @author congye6
	 * @param vo
	 * @return
	 */
	public ResultMessage addRoomInfo(RoomVO vo);
	
	/**
	 * 预订客房后，房间数减num
	 * @author congye6
	 * @param hotelId
	 * @param type
	 * @return
	 */
	public ResultMessage minusRoom(int hotelId,RoomType type,int num);
	
	/**
	 * 退房后房间数加num
	 * @author congye6
	 * @param hotelId
	 * @param type
	 * @return
	 */
	public ResultMessage addRoom(int hotelId,RoomType type,int num);
}

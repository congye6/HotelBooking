package congye6.HotelBooking.mapper.hotel;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import congye6.HotelBooking.enumeration.RoomType;
import congye6.HotelBooking.po.RoomPO;
import congye6.HotelBooking.vo.ResultMessage;
import congye6.HotelBooking.vo.RoomVO;

public interface RoomMapper {
	/**
	 * 获得酒店各类型的可用客房数和价格
	 * @author congye6
	 * @param hotelId
	 * @return
	 */
	public List<RoomPO> getRoomInfos(int hotelId);
	
	/**
	 * 录入可用客房
	 * @author congye6
	 * @param vo
	 * @return
	 */
	public void addRoomInfo(RoomPO po);
	
	/**
	 * 预订客房后，房间数减一
	 * @author congye6
	 * @param hotelId
	 * @param type
	 * @return
	 */
	public void minusRoom(@Param("hotelId")int hotelId,@Param("type")String type);
		
	/**
	 * 退房后房间数加一
	 * @author congye6
	 * @param hotelId
	 * @param type
	 * @return
	 */
	public void addRoom(@Param("hotelId")int hotelId,@Param("type")String type);
}

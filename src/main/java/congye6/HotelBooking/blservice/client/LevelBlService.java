package congye6.HotelBooking.blservice.client;

import java.util.List;

import congye6.HotelBooking.vo.CreditLevelVO;
import congye6.HotelBooking.vo.ResultMessage;

/**
 * @author congye6
 * 2016年12月24日
 * 下午2:48:29
 */
public interface LevelBlService {
	/**
	 * 设置相应等级所需的信用值
	 * @author congye6
	 * @param list
	 * @return
	 */
	public ResultMessage setCreditLevel(List<CreditLevelVO> list);
	
	/**
	 * 根据信用值获取所属等级
	 * @author congye6
	 * @param credit
	 * @return
	 */
	public int getLevel(int credit);
}

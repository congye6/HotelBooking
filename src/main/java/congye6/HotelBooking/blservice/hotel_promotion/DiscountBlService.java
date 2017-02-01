package congye6.HotelBooking.blservice.hotel_promotion;

import java.util.List;

import congye6.HotelBooking.vo.DiscountVO;
import congye6.HotelBooking.vo.ResultMessage;

public interface DiscountBlService {
	/**
	 * 设置折扣
	 * @author congye6
	 * @param vo
	 * @return
	 */
	public ResultMessage setDiscount(DiscountVO vo);
	
	/**
	 * 设置多个折扣
	 * @author congye6
	 * @param vo
	 * @return
	 */
	public ResultMessage setDiscount(List<DiscountVO> vo);
	
	/**
	 * 获取某酒店所有折扣
	 * @param hotelId
	 * @return
	 * 2017年1月11日
	 */
	public List<DiscountVO> getDiscountByHotel(int hotelId);
}

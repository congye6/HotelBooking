package congye6.HotelBooking.blservice.user;

import java.util.List;

import congye6.HotelBooking.vo.HotelStaffVO;
import congye6.HotelBooking.vo.ResultMessage;

/**
 * 酒店工作人员信息管理
 * @author congye6
 * 2016年12月21日
 * 下午4:40:15
 */
public interface HotelStaffBlService {
	/**
	 * 前置：酒店存在
	 * 添加酒店工作人员账号
	 * 每个酒店一个账号
	 * @author congye6
	 * @param vo
	 * @return
	 */
	public ResultMessage addHotelStaff(HotelStaffVO vo);
	
	/**
	 * 获取所有酒店工作人员信息
	 * @author congye6
	 * @return
	 */
	public List<HotelStaffVO> getHotelStaffs();
	
	/**
	 * 根据id或名称或酒店名称查找酒店工作人员
	 * @author congye6
	 * @param key
	 * @return
	 */
	public List<HotelStaffVO> searchHotelStaffs(String key);
	
}

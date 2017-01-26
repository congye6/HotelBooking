package congye6.HotelBooking.mapper.user;

import java.util.List;

import congye6.HotelBooking.po.HotelStaffPO;


public interface HotelStaffMapper {
	/**
	 * 前置：酒店存在
	 * 添加酒店工作人员账号
	 * 每个酒店一个账号
	 * @author congye6
	 * @param vo
	 * @return
	 */
	public int addHotelStaff(HotelStaffPO po);
	
	/**
	 * 获取所有酒店工作人员信息
	 * @author congye6
	 * @return
	 */
	public List<HotelStaffPO> getHotelStaffs();
	
	/**
	 * 根据名称或酒店名称查找酒店工作人员
	 * @author congye6
	 * @param key
	 * @return
	 */
	public List<HotelStaffPO> getHotelStaffsByName(String key);
	
	/**
	 * 根据id查找
	 * @param id
	 * @return
	 * 2017年1月5日
	 */
	public HotelStaffPO  getHotelStaffById(int id);
}

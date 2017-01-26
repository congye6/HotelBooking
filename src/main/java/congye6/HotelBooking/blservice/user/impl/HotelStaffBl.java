package congye6.HotelBooking.blservice.user.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import congye6.HotelBooking.blservice.hotel.HotelBlService;
import congye6.HotelBooking.blservice.user.HotelStaffBlService;
import congye6.HotelBooking.enumeration.UserType;
import congye6.HotelBooking.mapper.user.AccountMapper;
import congye6.HotelBooking.mapper.user.HotelStaffMapper;
import congye6.HotelBooking.po.AccountPO;
import congye6.HotelBooking.po.HotelStaffPO;
import congye6.HotelBooking.vo.HotelStaffVO;
import congye6.HotelBooking.vo.HotelVO;
import congye6.HotelBooking.vo.ResultMessage;

public class HotelStaffBl implements HotelStaffBlService{

	@Autowired
	private HotelStaffMapper staffMapper;
	
	@Autowired
	private AccountMapper accountMapper;
	
	@Autowired
	private HotelBlService hotelBl;
	
	@Override
	public ResultMessage addHotelStaff(HotelStaffVO vo) {
		//添加登录账号
		AccountPO account=new AccountPO(vo.password, UserType.HOTEL_STAFF.toString());
		accountMapper.addAccount(account);
		//登录id在po中
		int id=account.getId();
		//保存员工信息
		HotelStaffPO po=new HotelStaffPO(id, vo.hotelId, vo.name);
		staffMapper.addHotelStaff(po);
		return new ResultMessage(true,id+"" );
	}

	@Override
	public List<HotelStaffVO> getHotelStaffs() {
		List<HotelStaffPO> staffs=staffMapper.getHotelStaffs();
		List<HotelStaffVO> result=getVO(staffs);
		return result;
	}

	@Override
	public List<HotelStaffVO> searchHotelStaffs(String key) {
		List<HotelStaffPO> staffs=staffMapper.getHotelStaffsByName(key);
		List<HotelStaffVO> result=getVO(staffs);
		return result;
	}
	
	/**
	 * 将po转换成vo
	 * @param staffs
	 * @return
	 * 2017年1月26日
	 */
	private List<HotelStaffVO> getVO(List<HotelStaffPO> staffs){
		List<HotelStaffVO> result=new ArrayList<>();
		for(HotelStaffPO staff:staffs){
			//根据id获取酒店详细信息
			HotelVO hotelInfo=hotelBl.getHotel(staff.getHotelId());
			HotelStaffVO vo=new HotelStaffVO(staff.getHotelId(), hotelInfo.name, staff.getId(),
					staff.getName(), null);
			result.add(vo);
		}
		return result;
	}

}

package congye6.HotelBooking.test.mapper.user;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import congye6.HotelBooking.mapper.user.HotelStaffMapper;
import congye6.HotelBooking.po.HotelStaffPO;
import congye6.HotelBooking.test.mapper.ConstValue;

public class HotelStaffMapperTest {

	private HotelStaffMapper mapper;
	
	@Before
	public void setup(){
		ApplicationContext context=new ClassPathXmlApplicationContext(ConstValue.SPRING_XML_PATH);
		mapper=context.getBean(HotelStaffMapper.class);
	}
	
	@Test
	public void addHotelStaff() {
		HotelStaffPO po=new HotelStaffPO(5, 2, "李小花");
		mapper.addHotelStaff(po);
	}
	
	@Test
	public void getHotelStaffs(){
		List<HotelStaffPO> list=mapper.getHotelStaffs();
		assertEquals(2,list.size());
	}
	
	@Test
	public void getHotelStaffsByName(){
		List<HotelStaffPO> list=mapper.getHotelStaffsByName("小");
		assertEquals(5, list.get(0).getId());
	}
	
	@Test
	public void getHotelStaffById(){
		HotelStaffPO po=mapper.getHotelStaffById(5);
		assertEquals("李小花",po.getName());
	}
	

}

package congye6.HotelBooking.test.mapper.hotel;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import congye6.HotelBooking.mapper.hotel.HotelMapper;
import congye6.HotelBooking.po.HotelPO;

public class HotelMapperTest {
	private HotelMapper mapper;
	
	@Before
	public void setup(){
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:configure/spring/applicationContext-dao.xml");
		mapper=context.getBean(HotelMapper.class);
	}
	
	@Test
	public void addHotel() {
		HotelPO po=new HotelPO(0, "金龙大酒店", "玄武区新街口23号", "南京", "新街口","妙，不可言",5);
		mapper.addHotel(po);
	}
	
	@Test
	public void getHotels(){
		List<HotelPO> list=mapper.getHotels("南京", "新街口");
		assertEquals("金龙大酒店",list.get(0).getName());
	}
	
	@Test
	public void updateHotel(){
		HotelPO po=new HotelPO(2, "万达酒店", "玄武区新街口24号", "南京", "新街口","认真你就输了",5);
		mapper.updateHotel(po);
	}

}

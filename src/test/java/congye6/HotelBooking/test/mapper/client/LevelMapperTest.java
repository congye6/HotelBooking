package congye6.HotelBooking.test.mapper.client;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import congye6.HotelBooking.mapper.client.LevelMapper;
import congye6.HotelBooking.po.LevelPO;
import congye6.HotelBooking.test.ConstValue;

public class LevelMapperTest {

	private LevelMapper mapper;
	
	@Before
	public void setup(){
		ApplicationContext context=new ClassPathXmlApplicationContext(ConstValue.SPRING_DAO_PATH);
		mapper=context.getBean(LevelMapper.class);
	}
	
	
	
	@Test
	public void getLevel(){
		int level=mapper.getLevel(3009);
		assertEquals(4,level);
	}
	
	@Test
	public void updateLevel(){
		LevelPO po=new LevelPO(1, -9999990, 999);
		mapper.updateLevel(po);
	}
}

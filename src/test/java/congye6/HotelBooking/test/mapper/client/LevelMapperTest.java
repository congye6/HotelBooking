package congye6.HotelBooking.test.mapper.client;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import congye6.HotelBooking.mapper.client.LevelMapper;
import congye6.HotelBooking.po.LevelPO;
import congye6.HotelBooking.test.mapper.ConstValue;

public class LevelMapperTest {

	private LevelMapper mapper;
	
	@Before
	public void setup(){
		ApplicationContext context=new ClassPathXmlApplicationContext(ConstValue.SPRING_XML_PATH);
		mapper=context.getBean(LevelMapper.class);
	}
	
	@Test
	public void addLevel(){
		LevelPO level1=new LevelPO(1, -9999999, 999);
		LevelPO level2=new LevelPO(2, 1000, 1999);
		LevelPO level3=new LevelPO(3, 2000, 2999);
		LevelPO level4=new LevelPO(4, 3000, 3999);
		LevelPO level5=new LevelPO(5, 4000, 9999999);
		mapper.addLevel(level1);
		mapper.addLevel(level2);
		mapper.addLevel(level3);
		mapper.addLevel(level4);
		mapper.addLevel(level5);
	}
	
	@Test
	public void getLevel(){
		int level=mapper.getLevel(3009);
		assertEquals(4,level);
	}
	
	@Test
	public void updateLevel(){
		LevelPO po=new LevelPO(1, -9999998, 999);
		mapper.updateLevel(po);
	}
}

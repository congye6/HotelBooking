package congye6.HotelBooking.test.mapper.site_promotion;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import congye6.HotelBooking.mapper.site_promotion.HolidayDiscountMapper;
import congye6.HotelBooking.test.ConstValue;

public class HolidayDiscountMapperTest {
	private HolidayDiscountMapper mapper;
	
	@Before
	public void setup(){
		ApplicationContext context=new ClassPathXmlApplicationContext(ConstValue.SPRING_DAO_PATH);
		mapper=context.getBean(HolidayDiscountMapper.class);
	}
	
	@Test
	public void setDiscount(){
		mapper.setDiscount(0.8);
	}
	
	@Test
	public void getDiscount(){
		mapper.getDiscount();
	}
}

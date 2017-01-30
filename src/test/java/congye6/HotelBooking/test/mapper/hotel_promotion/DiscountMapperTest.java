package congye6.HotelBooking.test.mapper.hotel_promotion;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import congye6.HotelBooking.mapper.hotel_promotion.DiscountMapper;
import congye6.HotelBooking.po.DiscountPO;
import congye6.HotelBooking.test.ConstValue;

public class DiscountMapperTest {
	private DiscountMapper mapper;
	
	@Before
	public void setup(){
		ApplicationContext context=new ClassPathXmlApplicationContext(ConstValue.SPRING_DAO_PATH);
		mapper=context.getBean(DiscountMapper.class);
	}
	
	@Test
	public void setDiscount(){
		mapper.setDiscount(new DiscountPO(1, "birthday", 0.9));
	}
	
	@Test
	public void getDiscountByHotel(){
		List<DiscountPO> list=mapper.getDiscountByHotel(9);
		System.out.println(list);
	}
	
	@Test
	public void getDiscount(){
		Double discount=mapper.getDiscount(9, "birthday");
		System.out.println(discount);
	}
}

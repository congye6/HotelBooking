package congye6.HotelBooking.test.mapper.site_promotion;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import congye6.HotelBooking.mapper.site_promotion.VipDiscountMapper;
import congye6.HotelBooking.po.VipDiscountPO;
import congye6.HotelBooking.test.mapper.ConstValue;

public class VipDiscountMapperTest {
	private VipDiscountMapper mapper;
	
	@Before
	public void setup(){
		ApplicationContext context=new ClassPathXmlApplicationContext(ConstValue.SPRING_XML_PATH);
		mapper=context.getBean(VipDiscountMapper.class);
	}
	
	@Test
	public void setDiscount(){
		mapper.setDiscount(new VipDiscountPO(1, "南京市新街口", 0.97));
	}
	
	@Test
	public void getDiscount(){
		mapper.getDiscount("南京市新街口", 1);
	}
}

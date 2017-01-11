package congye6.HotelBooking.test.mapper.order;

import java.sql.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import congye6.HotelBooking.mapper.order.OrderMapper;
import congye6.HotelBooking.po.CheckInPO;
import congye6.HotelBooking.po.OrderPO;
import congye6.HotelBooking.test.mapper.ConstValue;

public class OrderMapperTest {
	
	private OrderMapper mapper;
	
	@Before
	public void setup(){
		ApplicationContext context=new ClassPathXmlApplicationContext(ConstValue.SPRING_XML_PATH);
		mapper=context.getBean(OrderMapper.class);
	}
	
	@Test
	public void addOrder(){
		OrderPO po=new OrderPO(0, 6, 1,"2016-07-12","2016-07-13", 
				"2016-07-11", 1000, "cancel",4, false);
		mapper.addOrder(po);
	}
	
	@Test
	public void updateOrderState(){
		mapper.updateOrderState(1, "booking");
	}
	
	@Test
	public void updateOrderDate(){
		mapper.updateOrderDate(new CheckInPO(1,"2016-07-12", "2016-07-13", "2016-07-11"));
	}
}

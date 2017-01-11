package congye6.HotelBooking.test.mapper.order;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import congye6.HotelBooking.mapper.order.OrderRoomMapper;
import congye6.HotelBooking.po.OrderRoomPO;
import congye6.HotelBooking.test.mapper.ConstValue;

public class OrderRoomMapperTest {
	private OrderRoomMapper mapper;
	
	@Before
	public void setup(){
		ApplicationContext context=new ClassPathXmlApplicationContext(ConstValue.SPRING_XML_PATH);
		mapper=context.getBean(OrderRoomMapper.class);
	}
	
	@Test
	public void addOrderRoom(){
		mapper.addOrderRoom(new OrderRoomPO(1, "suit", 1));
	}
	
	@Test
	public void getOrderRoom(){
		List<OrderRoomPO> list=mapper.getOrderRoom(1);
	}
}

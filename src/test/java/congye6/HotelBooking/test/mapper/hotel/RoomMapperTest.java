package congye6.HotelBooking.test.mapper.hotel;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import congye6.HotelBooking.mapper.hotel.RoomMapper;
import congye6.HotelBooking.po.RoomPO;
import congye6.HotelBooking.test.ConstValue;

public class RoomMapperTest {
	private RoomMapper mapper;
	
	@Before
	public void setup(){
		ApplicationContext context=new ClassPathXmlApplicationContext(ConstValue.SPRING_DAO_PATH);
		mapper=context.getBean(RoomMapper.class);
	}
	
	@Test
	public void getRoomInfos(){
		mapper.getRoomInfos(1);
	}
	
	@Test
	public void addRoomInfo(){
		RoomPO po=new RoomPO(1, "suit", 12, 2000);
		mapper.addRoomInfo(po);
	}
	
	@Test
	public void minusRoom(){
		mapper.minusRoom(1, "suit");
	}
	
	@Test
	public void addRoom(){
		mapper.addRoom(1,"single");
	}
}

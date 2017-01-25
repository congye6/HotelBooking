package congye6.HotelBooking.test.mapper.hotel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import congye6.HotelBooking.enumeration.RoomType;
import congye6.HotelBooking.mapper.hotel.RoomNumberMapper;
import congye6.HotelBooking.test.ConstValue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ConstValue.SPRING_SERVICE_PATH,ConstValue.SPRING_DAO_PATH})
public class RoomNumberMapperTest {

	@Autowired
	private RoomNumberMapper mapper;
	
	@Test
	public void getCheckOutNumber(){
		mapper.getCheckOutNumber(1, RoomType.SINGLE.toString(), "2017-01-01");
	}
	
}

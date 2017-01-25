package congye6.HotelBooking.test.mapper.hotel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import congye6.HotelBooking.mapper.hotel.RoomPriceMapper;
import congye6.HotelBooking.test.ConstValue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ConstValue.SPRING_SERVICE_PATH,ConstValue.SPRING_DAO_PATH})
public class RoomPriceMapperTest {

	@Autowired
	private RoomPriceMapper mapper;
	
	@Test
	public void getPrice(){
		double price=mapper.getPrice(1, "SINGLE");
	}
	
}

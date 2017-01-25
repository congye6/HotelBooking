package congye6.HotelBooking.test.bl.hotel;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import congye6.HotelBooking.blservice.hotel.HotelBlService;
import congye6.HotelBooking.enumeration.SearchHotelCondition;
import congye6.HotelBooking.test.ConstValue;
import congye6.HotelBooking.vo.ConditionVO;
import congye6.HotelBooking.vo.HotelVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ConstValue.SPRING_SERVICE_PATH,ConstValue.SPRING_DAO_PATH})
public class HotelBlTest {
	
	@Autowired
	private HotelBlService service;
	
	@Test
	public void searchHotel(){
		List<ConditionVO> conditions=new ArrayList<>();
		ConditionVO nameCondition=new ConditionVO(SearchHotelCondition.NAME, "酒店");
		conditions.add(nameCondition);
		ConditionVO starCondition=new ConditionVO(SearchHotelCondition.STAR, 5);
		conditions.add(starCondition);
		List<HotelVO> results=service.getHotels("南京", "新街口", conditions);
		assertEquals(2,results.size());
	}

}

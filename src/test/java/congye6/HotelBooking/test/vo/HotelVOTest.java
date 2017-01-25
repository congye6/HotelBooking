package congye6.HotelBooking.test.vo;

import static org.junit.Assert.*;

import org.junit.Test;

import congye6.HotelBooking.po.HotelPO;
import congye6.HotelBooking.vo.HotelVO;

public class HotelVOTest {

	
	@Test
	public void constructor(){
		HotelPO po=new HotelPO();
		po.setCity("nanjing");
		HotelVO vo=new HotelVO(po);
		assertEquals("nanjing",vo.city);
	}
	
}

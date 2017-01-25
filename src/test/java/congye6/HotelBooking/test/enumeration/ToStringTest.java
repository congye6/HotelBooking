package congye6.HotelBooking.test.enumeration;

import static org.junit.Assert.*;

import org.junit.Test;

import congye6.HotelBooking.enumeration.HotelPromotionType;

public class ToStringTest {

	
	@Test
	public void testToString(){
		HotelPromotionType type=HotelPromotionType.BIRTHDAY;
		assertEquals("BIRTHDAY",type.toString());
	}
}

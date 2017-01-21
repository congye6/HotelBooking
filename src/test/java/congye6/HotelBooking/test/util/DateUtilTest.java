package congye6.HotelBooking.test.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import congye6.HotelBooking.util.DateUtil;

public class DateUtilTest {
	
	
	@Test
	public void isBeforeDate(){
		assertEquals(true,DateUtil.isPastDate("1998-11-11"));
		assertEquals(false, DateUtil.isPastDate("1998-14-11"));
		assertEquals(false, DateUtil.isPastDate("2998-11-11"));
	}
}

package congye6.HotelBooking.test.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import congye6.HotelBooking.util.DateUtil;

public class DateUtilTest {
	
	
	@Test
	public void isBeforeDate(){
		assertEquals(true,DateUtil.isBeforeDate("1998-11-11"));
		assertEquals(false, DateUtil.isBeforeDate("1998-14-11"));
		assertEquals(false, DateUtil.isBeforeDate("2998-11-11"));
	}
}

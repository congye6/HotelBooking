package congye6.HotelBooking.test.util;

import java.util.Date;

import org.junit.Test;

import congye6.HotelBooking.util.DateTimeUtil;

public class DateTimeUtilTest {
	
	@Test
	public void getDateTime(){
		Date date=DateTimeUtil.getDateTime("2015-11-11 11:11:11.000");
		System.out.println(date);
	}

}

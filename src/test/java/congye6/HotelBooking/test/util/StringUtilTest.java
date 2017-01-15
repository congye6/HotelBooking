package congye6.HotelBooking.test.util;

import static org.junit.Assert.*;

import org.apache.commons.lang.text.StrSubstitutor;
import org.junit.Test;

import congye6.HotelBooking.util.StringUtil;

public class StringUtilTest {

	@Test
	public void isMatch(){
		assertEquals(true,StringUtil.isMatch("123", "^[0-9]*$"));
		assertEquals(false,StringUtil.isMatch("1i234", "^[0-9]*$"));
	}
	
	@Test
	public void isPhoneNumber(){
		assertEquals(true, StringUtil.isPhoneNumber("15902390023"));
		assertEquals(false, StringUtil.isPhoneNumber("1590239023"));
		assertEquals(false, StringUtil.isPhoneNumber("159023i0023"));
		assertEquals(false, StringUtil.isPhoneNumber("abghhhhhhhh"));
		assertEquals(false, StringUtil.isPhoneNumber("e59023902323"));
	}
	
	@Test
	public void isDate(){
		assertEquals(true,StringUtil.isDate("2016-11-31"));
		assertEquals(true,StringUtil.isDate("2016-09-08"));
		assertEquals(false,StringUtil.isDate("2016-00-08"));
		assertEquals(false, StringUtil.isDate("2011k-11-11"));
		assertEquals(false, StringUtil.isDate("201111-11"));
	}
	
}

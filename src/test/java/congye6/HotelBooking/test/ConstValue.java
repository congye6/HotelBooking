package congye6.HotelBooking.test;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class ConstValue {
	public static final String SPRING_DAO_PATH="classpath:configure/spring/applicationContext-dao.xml";
	
	public static final String SPRING_SERVICE_PATH="classpath:configure/spring/applicationContext-service.xml";

	public static final Class<SpringJUnit4ClassRunner> TEST_RUNNER=SpringJUnit4ClassRunner.class;
}

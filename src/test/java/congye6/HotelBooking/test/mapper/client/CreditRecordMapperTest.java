package congye6.HotelBooking.test.mapper.client;

import java.sql.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import congye6.HotelBooking.mapper.client.CreditRecordMapper;
import congye6.HotelBooking.po.CreditRecordPO;
import congye6.HotelBooking.test.mapper.ConstValue;

public class CreditRecordMapperTest {
	private CreditRecordMapper mapper;
	
	@Before
	public void setup(){
		ApplicationContext context=new ClassPathXmlApplicationContext(ConstValue.SPRING_XML_PATH);
		mapper=context.getBean(CreditRecordMapper.class);
	}
	
	@Test
	public void addCreditRecord(){
		CreditRecordPO po=new CreditRecordPO(6, Date.valueOf("2016-11-11"), "1", "订单执行", 10, 3009);
		mapper.addCreditRecord(po);
	}
	
	@Test
	public void getCreditRecord(){
		List<CreditRecordPO> list=mapper.getCreditRecords(6);
	}
	
}

package congye6.HotelBooking.test.mapper.client;

import java.sql.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import congye6.HotelBooking.mapper.client.ClientMapper;
import congye6.HotelBooking.po.ClientPO;
import congye6.HotelBooking.test.mapper.ConstValue;

public class ClientMapperTest {
	private ClientMapper mapper;
	
	@Before
	public void setup(){
		ApplicationContext context=new ClassPathXmlApplicationContext(ConstValue.SPRING_XML_PATH);
		mapper=context.getBean(ClientMapper.class);
	}
	
	@Test
	public void addClient(){
		ClientPO po=new ClientPO(6, "congye7", "15978012345", 3000, Date.valueOf("2001-11-11"), null);
		mapper.addClient(po);
	}
	
	@Test
	public void getClient(){
		ClientPO po=mapper.getClient(6);
		assert(null==po.getCompany());
	}
	
	@Test
	public void updateClient(){
		ClientPO po=new ClientPO(6, "congye6", "15978012345", 3000, Date.valueOf("2011-11-11"), null);
		mapper.updateClient(po);
	}
	
	@Test
	public void minusCredit(){
		mapper.minusCredit(6,1);
	}
	
	@Test
	public void addCredit(){
		mapper.addCredit(6, 10);
	}
}

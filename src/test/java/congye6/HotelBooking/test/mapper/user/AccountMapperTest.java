package congye6.HotelBooking.test.mapper.user;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import congye6.HotelBooking.mapper.user.AccountMapper;
import congye6.HotelBooking.po.AccountPO;

public class AccountMapperTest {
	private AccountMapper mapper;
	
	@Before
	public void setup(){
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:configure/spring/applicationContext-dao.xml");
		mapper=context.getBean(AccountMapper.class);
	}
	
	@Test
	public void addAccount(){
		AccountPO po=new AccountPO("666", "PROMOTION_STAFF");
		mapper.addAccount(po);
	}
	
	@Test
	public void getAccount(){
		AccountPO po=mapper.getAccount(2);
		assertEquals("ADMIN", po.getType());
	}
	
	@Test
	public void updateAccount(){
		AccountPO po=new AccountPO("666", "ADMIN");
		po.setId(2);
		mapper.updateAccount(po);
		AccountPO result=mapper.getAccount(2);
		assertEquals("ADMIN",result.getType());
	}
}

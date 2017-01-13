package congye6.HotelBooking.test.bl.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import congye6.HotelBooking.blservice.user.impl.AccountBl;
import congye6.HotelBooking.enumeration.UserType;
import congye6.HotelBooking.test.ConstValue;
import congye6.HotelBooking.vo.AccountVO;
@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试  
@ContextConfiguration({ConstValue.SPRING_DAO_PATH,ConstValue.SPRING_SERVICE_PATH}) //加载配置文件 
public class AccountBlTest {
	
	@Autowired
	private AccountBl bl;
	
	
	@Test
	public void addAccount(){
		AccountVO vo=new AccountVO(1, "666", UserType.CLIENT);
		bl.addAccount(vo);
	}
}

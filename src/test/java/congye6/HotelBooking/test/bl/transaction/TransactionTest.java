package congye6.HotelBooking.test.bl.transaction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import congye6.HotelBooking.blservice.user.AccountBlService;
import congye6.HotelBooking.enumeration.UserType;
import congye6.HotelBooking.mapper.user.AccountMapper;
import congye6.HotelBooking.po.AccountPO;

import congye6.HotelBooking.test.ConstValue;
import congye6.HotelBooking.vo.AccountVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ConstValue.SPRING_SERVICE_PATH,ConstValue.SPRING_DAO_PATH})
public class TransactionTest {

	@Autowired
	private AccountBlService bl;
	
	@Test
	public void transaction(){
		bl.addAccount(new AccountVO(0, "666", UserType.PROMOTION_STAFF));
	}
	
}

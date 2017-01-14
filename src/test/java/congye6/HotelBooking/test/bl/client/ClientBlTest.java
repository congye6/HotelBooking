package congye6.HotelBooking.test.bl.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import congye6.HotelBooking.blservice.client.ClientBlService;
import congye6.HotelBooking.test.ConstValue;
import congye6.HotelBooking.vo.ClientVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ConstValue.SPRING_SERVICE_PATH,ConstValue.SPRING_DAO_PATH})
public class ClientBlTest {

	@Autowired
	private ClientBlService bl;
	
	@Test
	public void register(){
		ClientVO vo=new ClientVO(0, "congye6", "15900879022", 3309,"666","2016-11-11");
		bl.register(vo);
	}
	
}

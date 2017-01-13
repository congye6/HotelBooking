package congye6.HotelBooking.test.mapper.hotel;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import congye6.HotelBooking.mapper.hotel.CommentMapper;
import congye6.HotelBooking.po.CommentPO;
import congye6.HotelBooking.test.ConstValue;

public class CommentMapperTest {
	private CommentMapper mapper;
	
	@Before
	public void setup(){
		ApplicationContext context=new ClassPathXmlApplicationContext(ConstValue.SPRING_DAO_PATH);
		mapper=context.getBean(CommentMapper.class);
	}
	
	@Test
	public void addComment(){
		CommentPO po=new CommentPO(6, 1, "强", 5);
		mapper.addComment(po);
	}
	
	@Test
	public void getComments(){
		mapper.getComments(1);
	}
	
}

package congye6.HotelBooking.blservice.hotel_promotion.impl.strategy;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.hotel.RoomBlService;
import congye6.HotelBooking.enumeration.RoomType;
import congye6.HotelBooking.vo.RoomVO;

/**
 * 计算原价
 * @author 周聪
 * 2017年2月1日
 */
@Service
public class PriceCalculator {
	
	@Autowired
	private RoomBlService roomBl;
	
	/**
	 * 酒店所有房间的价格
	 */
	private List<RoomVO> prices;
	
	public PriceCalculator(){
		
	}

	public PriceCalculator(int hotelId){
		prices=roomBl.getRoomInfos(hotelId);
	}
	
	/**
	 * 计算订单的原价
	 * @param hotelId
	 * @param roomOrder
	 * @return
	 * 2017年2月1日
	 */
	public double getOriginalPrice(int hotelId,Map<RoomType,Integer> roomOrder){
		double sum=0.0;
		prices=roomBl.getRoomInfos(hotelId);
		Iterator<Entry<RoomType, Integer>> iterator=roomOrder.entrySet().iterator();
		while(iterator.hasNext()){
			Entry<RoomType, Integer> entry=iterator.next();
			double price=getPrice(entry.getKey());
			sum+=price*entry.getValue();
		}
		return sum;
	}
	
	/**
	 * 根据房间类型获取单价
	 * @param type
	 * @return
	 * 2017年2月1日
	 */
	public double getPrice(RoomType type){
		for(RoomVO price:prices){
			if(price.type==type)
				return price.price;
		}
		//没找到房间类型
		return 0;
	}
	
}

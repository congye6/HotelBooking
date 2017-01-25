package congye6.HotelBooking.vo;
/**
 * 酒店评分区间
 * @author 周聪
 * 2017年1月22日
 */
public class ScoreIntervalVO {

	public double high;
	
	public double low;

	public ScoreIntervalVO(double high, double low) {
		super();
		this.high = high;
		this.low = low;
	}

	public ScoreIntervalVO() {
		super();
	}
	
	/**
	 * 判断是否在区间内
	 * 包括边界值
	 * @param num
	 * @return
	 * 2017年1月25日
	 */
	public boolean isBetween(double num){
		if(num>high)
			return false;
		if(num<low)
			return false;
		return true;
	}
	
}

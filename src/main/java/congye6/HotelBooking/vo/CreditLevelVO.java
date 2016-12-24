package congye6.HotelBooking.vo;

/**
 * @author congye6
 * 2016年12月24日
 * 下午2:49:54
 */
public class CreditLevelVO {
	/**
	 * vip等级
	 */
	public int level;
	
	/**
	 * 相应等级最低信用值
	 */
	public int lowCredit;
	
	/**
	 * 相应等级最高信用值
	 */
	public int highCredit;

	/**
	 * @param level
	 * @param lowCredit
	 * @param highCredit
	 */
	public CreditLevelVO(int level, int lowCredit, int highCredit) {
		super();
		this.level = level;
		this.lowCredit = lowCredit;
		this.highCredit = highCredit;
	}

	/**
	 * 
	 */
	public CreditLevelVO() {
		super();
	}

}

package congye6.HotelBooking.po;

public class LevelPO {
	private int level;
	
	private int lowCredit;
	
	private int highCredit;

	public LevelPO(int level, int lowCredit, int highCredit) {
		super();
		this.level = level;
		this.lowCredit = lowCredit;
		this.highCredit = highCredit;
	}

	public LevelPO() {
		super();
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLowCredit() {
		return lowCredit;
	}

	public void setLowCredit(int lowCredit) {
		this.lowCredit = lowCredit;
	}

	public int getHighCredit() {
		return highCredit;
	}

	public void setHighCredit(int highCredit) {
		this.highCredit = highCredit;
	}
	
	
}

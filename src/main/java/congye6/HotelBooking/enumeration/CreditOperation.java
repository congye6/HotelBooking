package congye6.HotelBooking.enumeration;

/**
 * @author congye6
 * 2016年12月20日
 * 下午3:31:29
 */
public enum CreditOperation {
	ORDER_EXCUTE(){
		public String toString(){
			return "订单执行";
		}
	},
	ORDER_EXCEPTION(){
		public String toString(){
			return "订单异常";
		}
	},
	ORDER_CANCEL(){
		public String toString(){
			return "订单撤销";
		}
	},
	RECHARGE(){
		public String toString(){
			return "充值";
		}
	}
}

package congye6.HotelBooking.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import congye6.HotelBooking.util.DateUtil;
import congye6.HotelBooking.util.StringUtil;
import congye6.HotelBooking.validator.annotation.PastDate;

public class PastDateValidator implements ConstraintValidator<PastDate, String>{

	@Override
	public void initialize(PastDate arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	/**
	 * 允许为null
	 * 必须符合格式yyyy-mm-dd
	 */
	public boolean isValid(String date, ConstraintValidatorContext arg1) {
		if(StringUtil.isNull(date))
			return true;
		if(!DateUtil.isBeforeDate(date))
			return false;
		return true;
	}

}

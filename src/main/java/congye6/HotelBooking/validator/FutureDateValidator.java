package congye6.HotelBooking.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import congye6.HotelBooking.util.DateUtil;
import congye6.HotelBooking.util.StringUtil;
import congye6.HotelBooking.validator.annotation.FutureDate;

public class FutureDateValidator implements ConstraintValidator<FutureDate, String>{

	@Override
	public void initialize(FutureDate arg0) {
		
		
	}

	@Override
	public boolean isValid(String date, ConstraintValidatorContext arg1) {
		if(StringUtil.isNull(date))
			return true;
		if(!DateUtil.isFutureDate(date))
			return false;
		return true;
	}

}

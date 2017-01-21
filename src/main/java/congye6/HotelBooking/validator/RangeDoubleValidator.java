package congye6.HotelBooking.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import congye6.HotelBooking.validator.annotation.RangeDouble;

public class RangeDoubleValidator implements ConstraintValidator<RangeDouble, Double>{

	private double min;
	
	private double max;
	
	@Override
	public void initialize(RangeDouble range) {
		this.min=range.min();
		this.max=range.max();
	}

	@Override
	public boolean isValid(Double num, ConstraintValidatorContext arg1) {
		if(num<min)
			return false;
		if(num>max)
			return false;
		return true;
	}

}

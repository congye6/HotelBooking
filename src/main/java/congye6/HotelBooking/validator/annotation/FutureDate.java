package congye6.HotelBooking.validator.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import congye6.HotelBooking.validator.FutureDateValidator;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=FutureDateValidator.class)
public @interface FutureDate {
	String message() default"不是未来时间";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

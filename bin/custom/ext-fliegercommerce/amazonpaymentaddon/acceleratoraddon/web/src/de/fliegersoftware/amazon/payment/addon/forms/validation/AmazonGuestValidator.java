package de.fliegersoftware.amazon.payment.addon.forms.validation;

import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import de.fliegersoftware.amazon.payment.addon.forms.AmazonGuestForm;
import de.hybris.platform.acceleratorstorefrontcommons.forms.GuestForm;

@Component("amazonGuestValidator")
public class AmazonGuestValidator implements Validator {

	public static final String EMAIL_REGEX = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b";

	@Override
	public boolean supports(Class<?> clazz) {
		return AmazonGuestForm.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		final AmazonGuestForm guestForm = (AmazonGuestForm) target;
		final String amazonOrderReferenceId = guestForm.getAmazonOrderReferenceId();
		final String email = guestForm.getAmazonGuestEmail();

		if (StringUtils.isEmpty(amazonOrderReferenceId))
		{
			errors.rejectValue("amazonOrderReferenceId", "amazon.profile.orderreferenceid.invalid");
		}
		if (StringUtils.isEmpty(email))
		{
			errors.rejectValue("email", "amazon.profile.email.invalid");
		}
		else if (StringUtils.length(email) > 255 || !Pattern.matches(EMAIL_REGEX, email))
		{
			errors.rejectValue("email", "amazon.profile.email.invalid");
		}
	}
}

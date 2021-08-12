package eCommerceAutomation.business.abstracts;

import eCommerceAutomation.entities.concrete.User;

public interface IUserCheckService {
	boolean checkFirstName(User user);

	boolean checkLastName(User user);

	boolean checkPassword(User user);

	boolean checkEmail(User user);

	boolean uniqueEmail(User user);

	boolean isValidEmail(User user);

}

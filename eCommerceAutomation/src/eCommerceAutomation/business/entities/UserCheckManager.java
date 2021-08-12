package eCommerceAutomation.business.entities;

import java.util.ArrayList;

import java.util.List;

import java.util.regex.Pattern;

import eCommerceAutomation.business.abstracts.IUserCheckService;
import eCommerceAutomation.entities.concrete.User;

public class UserCheckManager implements IUserCheckService {

	List<String> listOfEmail = new ArrayList<String>();

	@Override
	public boolean checkFirstName(User user) {
		if (user.getFirstName().length() < 2) {
			System.out.println("name must contain at least 3 letters");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkLastName(User user) {
		if (user.getLastName().length() < 1) {
			System.out.println("lastname must contain at least 2 letters");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkPassword(User user) {

		if (user.getPassword().isEmpty()) {
			System.out.println("please enter your password.");
			return false;
		} else {
			if (user.getPassword().length() < 8) {
				System.out.println("password cannot be less than 8 characters");
				return false;
			}
		}
		return true;

	}

	@Override
	public boolean checkEmail(User user) {

		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		if (user.getEmail().isEmpty()) {
			System.out.println(" Email field cannot be left blank.");
			return false;
		} else {
			if (pattern.matcher(user.getEmail()).find() == false) {
				System.out.println(
						"The email address entered is not in accordance with the format. Example: example@example.com");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean uniqueEmail(User user) {
		boolean result = true;
		if (listOfEmail.contains(user.getEmail())) {
			System.out.println(
					"Please try a different e-mail address registered to the system with this e-mail address.");
			result = false;
		} else {
			result = true;
			listOfEmail.add(user.getEmail());
		}
		return result;
	}

	@Override
	public boolean isValidEmail(User user) {
		if (checkFirstName(user) && checkLastName(user) && checkEmail(user) && checkPassword(user)
				&& uniqueEmail(user) == true) {
			return true;
		}
		return false;
	}

}

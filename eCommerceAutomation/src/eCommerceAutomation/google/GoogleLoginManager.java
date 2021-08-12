package eCommerceAutomation.google;

import eCommerceAutomation.entities.concrete.User;

public class GoogleLoginManager {
	public void sendVerificationeMail(User user) {

		System.out.println("send Verification eMail" + user.getEmail());

	}

	public void verifyMail(User user) {
		System.out.println("validation successful");

	}

}

package eCommerceAutomation.core;

import eCommerceAutomation.entities.concrete.User;

public class GoogleLoginManagerAdapter {
	
	public void sendVertificationMail(User user) {
		System.out.println("verification code sent :  " + user.getEmail());
		
	}

	public void verifyMail(User user) {
		System.out.println("Verification successful");
		
	}

}

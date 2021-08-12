package eCommerceAutomation.business.entities;

import eCommerceAutomation.business.abstracts.IVertificationMailService;
import eCommerceAutomation.entities.concrete.User;

public class VerificationMailManager implements IVertificationMailService {

	@Override
	public void sendVertificationMail(User user) {
		System.out.println("verification code sent : " + user.getEmail());

	}

	@Override
	public void verifyMail(User user) {
		System.out.println("Verification successful  ");

	}

}

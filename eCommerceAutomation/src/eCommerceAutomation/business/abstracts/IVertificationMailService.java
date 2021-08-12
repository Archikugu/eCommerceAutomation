package eCommerceAutomation.business.abstracts;

import eCommerceAutomation.entities.concrete.User;

public interface IVertificationMailService {
	void sendVertificationMail(User user);

	void verifyMail(User user);

}

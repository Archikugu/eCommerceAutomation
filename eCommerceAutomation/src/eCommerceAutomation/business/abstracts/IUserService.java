package eCommerceAutomation.business.abstracts;

import eCommerceAutomation.entities.concrete.User;

public interface IUserService {
	
	void signUp(User user);
	void signIn(String email, String password);

}

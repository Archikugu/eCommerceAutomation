package eCommerceAutomation;


import eCommerceAutomation.business.entities.UserCheckManager;
import eCommerceAutomation.business.entities.UserManager;
import eCommerceAutomation.business.entities.VerificationMailManager;
import eCommerceAutomation.dataAccess.entities.HibernateUserDao;
import eCommerceAutomation.entities.concrete.User;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setFirstname("Gökhan");
		user.setLastName("Gök");
		user.setEmail("engokhangok@gmail.com");
		user.setPassword("123456789");
		
		
		UserManager userManager = new UserManager(new UserCheckManager(),new HibernateUserDao(),new VerificationMailManager() );
		
		
		userManager.signIn("engokhangok@gmail.com", "123456789");
		userManager.signUp(user);
		

	

	}

}

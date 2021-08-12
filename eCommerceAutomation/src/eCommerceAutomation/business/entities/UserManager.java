package eCommerceAutomation.business.entities;

import eCommerceAutomation.business.abstracts.IUserCheckService;
import eCommerceAutomation.business.abstracts.IUserService;
import eCommerceAutomation.business.abstracts.IVertificationMailService;
import eCommerceAutomation.dataAccess.abstracts.IUserDao;
import eCommerceAutomation.entities.concrete.User;

public class UserManager implements IUserService {
	IUserCheckService checkService;
	IUserDao userDao;
	IVertificationMailService mailService;

	public UserManager(IUserCheckService checkService, IUserDao userDao, IVertificationMailService mailService) {
		super();
		this.checkService = checkService;
		this.userDao = userDao;
		this.mailService = mailService;
	}

	@Override
	public void signIn(String email, String password) {

		if (userDao.email(email)==true && userDao.password(password) == true) {
			
			System.out.println("Login successful");
		} else {
			System.out.println("Email or password is incorrect");
		}

	}

	@Override
	public void signUp(User user) {
		if (checkService.isValidEmail(user) == true) {
			mailService.sendVertificationMail(user);
			mailService.verifyMail(user);
			userDao.add(user);

		} 
	}

}

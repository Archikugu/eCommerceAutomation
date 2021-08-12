package eCommerceAutomation.dataAccess.abstracts;

import java.util.List;

import eCommerceAutomation.entities.concrete.User;

public interface IUserDao {
	
	


	void add(User user);
	void update(User user);
	void remove(User user);
	boolean email(String email);
	boolean password(String password);
	
	
	List<User>getAll();
	

}

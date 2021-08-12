package eCommerceAutomation.dataAccess.entities;

import java.util.ArrayList;
import java.util.List;
import eCommerceAutomation.dataAccess.abstracts.IUserDao;
import eCommerceAutomation.entities.concrete.User;

public class HibernateUserDao implements IUserDao {

	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean email(String email) {

		for (User user : users) {
			if (user.getEmail() == email) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean password(String password) {
		for (User user : users) {
			if (user.getEmail() == password) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

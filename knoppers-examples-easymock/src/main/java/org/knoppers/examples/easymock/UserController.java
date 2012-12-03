/**
 * 
 */
package org.knoppers.examples.easymock;

import java.util.List;

/**
 * @author jkonopka
 * 
 */
public class UserController {

	private UserDAO userDAO;
	private List<User> userList;
	private User user;

	/**
	 * @param name
	 */
	public void search(final String name) {
		setUserList(userDAO.select());
		setUser(userDAO.select(name));
	}

	/**
	 * @return the userList
	 */
	public List<User> getUserList() {
		return userList;
	}

	/**
	 * @param userList
	 *            the userList to set
	 */
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	/**
	 * @return the userDAO
	 */
	public UserDAO getUserDAO() {
		return userDAO;
	}

	/**
	 * @param userDAO
	 *            the userDAO to set
	 */
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

}

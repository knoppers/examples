/**
 * 
 */
package org.spring.junit.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jkonopka
 * 
 */
public class UserManager {

	@Autowired
	private User user;

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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "org/spring/junit/test/context.xml" });

		final UserManager userManager = (UserManager) context
				.getBean("userManager");
		userManager.setUser((User) context.getBean("user"));

		System.out.println(userManager.getUser());
	}

}

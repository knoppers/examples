/**
 * 
 */
package org.knoppers.examples.easymock;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

/**
 * @author jkonopka
 * 
 */
public class UserControllerTest {

	private UserController userController;
	private List<User> userList = new ArrayList<User>();
	private User user = new User();

	/**
	 * 
	 */
	@Before
	public void setUp() {
		userController = new UserController();
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void test() throws Exception {
		userController.setUserDAO(EasyMock.createMock(UserDAO.class));
		EasyMock.expect(userController.getUserDAO().select()).andReturn(
				userList);
		EasyMock.expect(userController.getUserDAO().select("a"))
				.andReturn(user);

		EasyMock.replay(userController.getUserDAO());

		userController.search("a");
		Assert.assertEquals(user, userController.getUser());
		Assert.assertEquals(userList, userController.getUserList());
	}
}

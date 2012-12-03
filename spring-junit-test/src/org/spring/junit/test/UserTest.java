/**
 * 
 */
package org.spring.junit.test;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author jkonopka
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "context.xml")
public class UserTest {

	@Autowired
	private UserManager userManager;

	/**
	 * @throws Exception
	 */
	@Test
	public void testGetUser() throws Exception {
		Assert.assertNotNull(userManager.getUser());
	}

}

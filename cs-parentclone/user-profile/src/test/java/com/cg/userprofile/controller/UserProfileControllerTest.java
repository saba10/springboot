package com.cg.userprofile.controller;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import com.cg.userprofile.User;
import com.cg.userprofile.repo.UserProfileRepo;

/**
 * The class <code>UserProfileControllerTest</code> contains tests for the class <code>{@link UserProfileController}</code>.
 *
 * @generatedBy CodePro at 1/31/18 10:23 AM
 * @author shahulha
 * @version $Revision: 1.0 $
 */
public class UserProfileControllerTest {
	
	@Mock
	private UserProfileRepo userMockRepo;
	
	@InjectMocks
	private UserProfileController userMockController;
	
	@Before
	public void setUp()
		throws Exception {
		
		MockitoAnnotations.initMocks(this);
		
	}
	
	//static User user =new User();
	
	
	
	@Test
	public void testCreateUser_1()
		throws Exception {
		//UserProfileController fixture = new UserProfileController();
	    List<User> users = new ArrayList<User>();
		User user =new User();
		user.setFirstName("Bala");
		user.setLastName("Bharath");
		user.setUserName("gbbr@linkedin.com");
		user.setMobileNo("9873959252");
		user.setBalance(300);
		user.setRole("user");
		users.add(user);
		
		Mockito.when(userMockRepo.save(Mockito.isA(User.class))).thenReturn(user);
		
        //when(userMockRepo.save(user)).thenReturn(new User());
		User result = userMockController.createUser(user);
        assertNotNull(result);
	}

	@Test
	public void testCredit_1()
		throws Exception {
	//	UserProfileController fixture = new UserProfileController();
		String userName = "";
		String amount = "";
		Long userId=10L;

		User user = new User();
		user.setFirstName("abc");
		user.setLastName("xyz");
		user.setBalance(1000);
		
		Mockito.when(userMockRepo.save(Mockito.isA(User.class))).thenReturn(user);
		
		when(userMockRepo.findOne(userId)).thenReturn(user);
		
		User result = userMockController.credit(10L,"510");
		assertNotNull(result);
	}

	@Test
	public void testDebit_1()
		throws Exception {
		//UserProfileController fixture = new UserProfileController();
		String userName = "";
		String amount = "";
		User user = new User();
		user.setFirstName("bcd");
		user.setLastName("uvw");
		user.setBalance(300);
		
		Mockito.when(userMockRepo.save(Mockito.isA(User.class))).thenReturn(user);
		
		
		when(userMockRepo.findOne(10L)).thenReturn(user);
		
		User result = userMockController.debit(10L, "100");
		
		assertNotNull(result);
	}
	
	/*@Test(expected = RuntimeException.class)
	public void testCredit_2()
		throws Exception {
		UserProfileController fixture = new UserProfileController();
		String userName = "";
		String amount = "";
		List<User> users = new ArrayList<User>();
		when(userMockRepo.findByUserName(userName)).thenReturn(users);
		User result = userMockController.credit(userName, amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.cg.userprofile.controller.UserProfileController.credit(UserProfileController.java:42)
		assertNotNull(result);
	}
*/

	/**
	 * Run the User debit(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/18 10:23 AM
	 */
	/*@Test(expected = RuntimeException.class)
	public void testDebit_2()
		throws Exception {
		UserProfileController fixture = new UserProfileController();
		String userName = "";
		String amount = "";
		List<User> users = new ArrayList<User>();
		when(userMockRepo.findByUserName(userName)).thenReturn(users);
		User result = userMockController.debit(userName, amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.cg.userprofile.controller.UserProfileController.debit(UserProfileController.java:51)
		assertNotNull(result);
	}*/

	/**
	 * Run the List<User> getUserByUserName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/18 10:23 AM
	 */
	@Test
	public void testGetUserByUserName_1()
		throws Exception {
		UserProfileController fixture = new UserProfileController();
		String userName = "";
		List<User> users = new ArrayList<User>();
		User user = new User();
		user.setFirstName("cde");
		user.setLastName("mno");
		
		user.setBalance(300);
		users.add(user);
		
		Mockito.when(userMockRepo.findByUserName(Mockito.isA(String.class))).thenReturn(users);
		
		
		//when(userMockRepo.findByUserName(userName)).thenReturn(users);
		
		List<User> result = userMockController.getUserByUserName(userName);
		
		assertNotNull(result);
	}

	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}
	
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(UserProfileControllerTest.class);
	}
}
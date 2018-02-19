package com.capgemini.usercart.model;

import java.util.LinkedList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>UserCartModelTest</code> contains tests for the class <code>{@link UserCartModel}</code>.
 *
 * @generatedBy CodePro at 1/30/18 6:40 PM
 * @author dsriniv1
 * @version $Revision: 1.0 $
 */
public class UserCartModelTest {
	/**
	 * Run the UserCartModel() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	@Test
	public void testUserCartModel_1()
		throws Exception {

		UserCartModel result = new UserCartModel();

		// add additional test code here
		assertNotNull(result);
		assertEquals("UserCartModel(userId=null, cartItemList=null)", result.toString());
		assertEquals(null, result.getUserId());
		assertEquals(null, result.getCartItemList());
	}

	/**
	 * Run the UserCartModel(String,List<ProductCartModel>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	@Test
	public void testUserCartModel_2()
		throws Exception {
		String userId = "";
		List<ProductCartModel> cartItemList = new LinkedList();

		UserCartModel result = new UserCartModel(userId, cartItemList);

		// add additional test code here
		assertNotNull(result);
		assertEquals("UserCartModel(userId=, cartItemList=[])", result.toString());
		assertEquals("", result.getUserId());
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		UserCartModel fixture = new UserCartModel("", new LinkedList());
		Object obj = new UserCartModel("", new LinkedList());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		UserCartModel fixture = new UserCartModel("", new LinkedList());
		Object obj = null;

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		UserCartModel fixture = new UserCartModel("", new LinkedList());
		Object obj = new Object();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		UserCartModel fixture = new UserCartModel("", new LinkedList());
		Object obj = new UserCartModel("", new LinkedList());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		UserCartModel fixture = new UserCartModel("", new LinkedList());
		Object obj = new UserCartModel("", new LinkedList());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		UserCartModel fixture = new UserCartModel("", new LinkedList());
		Object obj = new UserCartModel("", new LinkedList());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		UserCartModel fixture = new UserCartModel((String) null, new LinkedList());
		Object obj = new UserCartModel((String) null, new LinkedList());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the List<ProductCartModel> getCartItemList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	@Test
	public void testGetCartItemList_1()
		throws Exception {
		UserCartModel fixture = new UserCartModel("", new LinkedList());

		List<ProductCartModel> result = fixture.getCartItemList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getUserId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	@Test
	public void testGetUserId_1()
		throws Exception {
		UserCartModel fixture = new UserCartModel("", new LinkedList());

		String result = fixture.getUserId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		UserCartModel fixture = new UserCartModel("", (List<ProductCartModel>) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(961, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		UserCartModel fixture = new UserCartModel((String) null, new LinkedList());

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(992, result);
	}

	/**
	 * Run the void setCartItemList(List<ProductCartModel>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	@Test
	public void testSetCartItemList_1()
		throws Exception {
		UserCartModel fixture = new UserCartModel("", new LinkedList());
		List<ProductCartModel> cartItemList = new LinkedList();

		fixture.setCartItemList(cartItemList);

		// add additional test code here
	}

	/**
	 * Run the void setUserId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	@Test
	public void testSetUserId_1()
		throws Exception {
		UserCartModel fixture = new UserCartModel("", new LinkedList());
		String userId = "";

		fixture.setUserId(userId);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	
}

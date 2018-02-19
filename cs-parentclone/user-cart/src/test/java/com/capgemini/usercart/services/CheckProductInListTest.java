package com.capgemini.usercart.services;

import java.util.LinkedList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import com.capgemini.usercart.model.ProductCartModel;

/**
 * The class <code>CheckProductInListTest</code> contains tests for the class <code>{@link CheckProductInList}</code>.
 *
 * @generatedBy CodePro at 1/30/18 7:16 PM
 * @author dsriniv1
 * @version $Revision: 1.0 $
 */
public class CheckProductInListTest {
	/**
	 * Run the CheckProductInList() constructor test.
	 *
	 * @generatedBy CodePro at 1/30/18 7:16 PM
	 */
	@Test
	public void testCheckProductInList_1()
		throws Exception {
		CheckProductInList result = new CheckProductInList();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the int getUserDetail(List<ProductCartModel>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 7:16 PM
	 */
	@Test
	public void testGetUserDetail_1()
		throws Exception {
		List<ProductCartModel> list = new LinkedList();
		String productId = "";

		int result = CheckProductInList.getUserDetail(list, productId);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int getUserDetail(List<ProductCartModel>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 7:16 PM
	 */
	@Test
	public void testGetUserDetail_2()
		throws Exception {
		List<ProductCartModel> list = new LinkedList();
		String productId = "";

		int result = CheckProductInList.getUserDetail(list, productId);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int getUserDetail(List<ProductCartModel>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 7:16 PM
	 */
	@Test
	public void testGetUserDetail_3()
		throws Exception {
		List<ProductCartModel> list = new LinkedList();
		String productId = "";

		int result = CheckProductInList.getUserDetail(list, productId);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 1/30/18 7:16 PM
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
	 * @generatedBy CodePro at 1/30/18 7:16 PM
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
	 * @generatedBy CodePro at 1/30/18 7:16 PM
	 */
	
}

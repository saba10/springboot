package com.capgemini.usercart.model;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ProductCartModelTest</code> contains tests for the class <code>{@link ProductCartModel}</code>.
 *
 * @generatedBy CodePro at 1/30/18 6:40 PM
 * @author dsriniv1
 * @version $Revision: 1.0 $
 */
public class ProductCartModelTest {
	/**
	 * Run the ProductCartModel() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	@Test
	public void testProductCartModel_1()
		throws Exception {

		ProductCartModel result = new ProductCartModel();

		// add additional test code here
		assertNotNull(result);
		assertEquals("ProductCartModel(productId=null, quantity=null)", result.toString());
		assertEquals(null, result.getProductId());
		assertEquals(null, result.getQuantity());
	}

	/**
	 * Run the ProductCartModel(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	@Test
	public void testProductCartModel_2()
		throws Exception {
		String productId = "";
		String quantity = "";

		ProductCartModel result = new ProductCartModel(productId, quantity);

		// add additional test code here
		assertNotNull(result);
		assertEquals("ProductCartModel(productId=, quantity=)", result.toString());
		assertEquals("", result.getProductId());
		assertEquals("", result.getQuantity());
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
		ProductCartModel fixture = new ProductCartModel("", "");
		Object obj = new ProductCartModel("", "");

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
		ProductCartModel fixture = new ProductCartModel("", "");
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
		ProductCartModel fixture = new ProductCartModel("", "");
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
		ProductCartModel fixture = new ProductCartModel("", "");
		Object obj = new ProductCartModel("", "");

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
		ProductCartModel fixture = new ProductCartModel("", "");
		Object obj = new ProductCartModel("", "");

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
		ProductCartModel fixture = new ProductCartModel("", "");
		Object obj = new ProductCartModel("", "");

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
		ProductCartModel fixture = new ProductCartModel("", (String) null);
		Object obj = new ProductCartModel("", (String) null);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the String getProductId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	@Test
	public void testGetProductId_1()
		throws Exception {
		ProductCartModel fixture = new ProductCartModel("", "");

		String result = fixture.getProductId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getQuantity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	@Test
	public void testGetQuantity_1()
		throws Exception {
		ProductCartModel fixture = new ProductCartModel("", "");

		String result = fixture.getQuantity();

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
		ProductCartModel fixture = new ProductCartModel((String) null, "");

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
		ProductCartModel fixture = new ProductCartModel("", (String) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(961, result);
	}

	/**
	 * Run the void setProductId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	@Test
	public void testSetProductId_1()
		throws Exception {
		ProductCartModel fixture = new ProductCartModel("", "");
		String productId = "";

		fixture.setProductId(productId);

		// add additional test code here
	}

	/**
	 * Run the void setQuantity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	@Test
	public void testSetQuantity_1()
		throws Exception {
		ProductCartModel fixture = new ProductCartModel("", "");
		String quantity = "";

		fixture.setQuantity(quantity);

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

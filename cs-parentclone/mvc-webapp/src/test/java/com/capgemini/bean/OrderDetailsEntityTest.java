package com.capgemini.bean;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>OrderDetailsEntityTest</code> contains tests for the class
 * <code>{@link OrderDetailsEntity}</code>.
 *
 * @generatedBy CodePro at 1/30/18 11:04 AM
 * @author vamshkri
 * @version $Revision: 1.0 $
 */
public class OrderDetailsEntityTest {
	/**
	 * Run the OrderDetailsEntity() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:04 AM
	 */
	@Test
	public void testOrderDetailsEntity_1() throws Exception {

		OrderDetailsEntity result = new OrderDetailsEntity();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getId());
		assertEquals(null, result.getProductId());
		assertEquals(0, result.getQuantity());
		assertEquals(null, result.getProductName());
		assertEquals(0, result.getPrice());
	}

	/**
	 * Run the OrderDetailsEntity(Long,Long,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:04 AM
	 */
	@Test
	public void testOrderDetailsEntity_2() throws Exception {
		Long id = new Long(1L);
		String productId = "aaaaa";
		String productName = "aaaaa";
		int price = 1;
		int quantity = 1;

		OrderDetailsEntity result = new OrderDetailsEntity(id, productId, productName, price, quantity);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Long(1L), result.getId());
		assertEquals(new Long(1L), result.getProductId());
		assertEquals(1, result.getQuantity());
		assertEquals("aaaaa", result.getProductName());
		assertEquals(1, result.getPrice());
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:04 AM
	 */
	@Test
	public void testEquals_1() throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", "aaaa", 100, 2);
		Object obj = new OrderDetailsEntity(new Long(1L), "", "aaaa", 100, 2);
		boolean result = fixture.equals(obj);
		assertEquals(true, result);
	}

	@Test
	public void testEquals_2() throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", "aaaa", 100, 1);
		Object obj = null;
		boolean result = fixture.equals(obj);
		assertEquals(false, result);
	}

	@Test
	public void testEquals_3() throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", "aaaa", 100, 1);
		Object obj = new OrderDetailsEntity(new Long(1L), "", "aaaa", 100, 2);
		boolean result = fixture.equals(obj);
		assertEquals(false, result);
	}
	
	@Test
	public void testEquals_4() throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", "aaaa", 1, 1);
		Object obj = new OrderDetailsEntity(new Long(1L), "", "aaaa", 100, 1);
		boolean result = fixture.equals(obj);
		assertEquals(false, result);
	}

	@Test
	public void testEquals_5() throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), null, "aaaa", 1, 1);
		Object obj = new OrderDetailsEntity(new Long(1L), "", "aaaa", 1, 1);
		boolean result = fixture.equals(obj);
		assertEquals(false, result);
	}

	@Test
	public void testEquals_6() throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", (String)null, 1, 1);
		Object obj = new OrderDetailsEntity(new Long(1L), "1", "", 1, 1);
		boolean result = fixture.equals(obj);
		assertEquals(false, result);
	}
	
	@Test
	public void testEquals_7() throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L),  null, (String) null, 1, 1);
		Object obj = new OrderDetailsEntity(new Long(1L), null, (String) null, 1, 1);
		boolean result = fixture.equals(obj);
		assertEquals(true, result);
	}

	@Test
	public void testEquals_8() throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", (String)null , 1, 1);
		Object obj = new OrderDetailsEntity(new Long(1L), "", "aaaa", 1, 1);
		boolean result = fixture.equals(obj);
		assertEquals(false, result);
	}

	@Test
	public void testEquals_9() throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", "bbbb" , 1, 1);
		Object obj = new OrderDetailsEntity(new Long(1L), "", "aaaa", 1, 1);
		boolean result = fixture.equals(obj);
		assertEquals(false, result);
	}
	
	@Test
	public void testEquals_10() throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L),"", "bbbb" , 1, 10);
		Object obj = new OrderDetailsEntity(new Long(1L), "", "aaaa", 1, 1);
		boolean result = fixture.equals(obj);
		assertEquals(false, result);
	}

	@Test
	public void testEquals_11() throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", "bbbb" , 1, 10);
		//Object obj = new OrderDetailsEntity(new Long(1L), new Long(1L), "aaaa", 1, 1);
		boolean result = fixture.equals("HIii");
		assertEquals(false, result);
	}
	
	@Test
	public void testEquals_12() throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", "bbbb" , 1, 10);
		Object obj = new OrderDetailsEntity(new Long(1L), "", "aaaa", 1, 1);
		boolean result = fixture.equals(obj);
		assertEquals(false, result);
	}
	
	@Test
	public void testGetId_1() throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", "", 1, 1);

		Long result = fixture.getId();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the int getPrice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:04 AM
	 */
	@Test
	public void testGetPrice_1() throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", "", 1, 1);

		int result = fixture.getPrice();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Long getProductId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:04 AM
	 */
	@Test
	public void testGetProductId_1() throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", "", 1, 1);

		String result = fixture.getProductId();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		/*assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);*/
	}

	/**
	 * Run the String getProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:04 AM
	 */
	@Test
	public void testGetProductName_1() throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", "", 1, 1);

		String result = fixture.getProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getQuantity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:04 AM
	 */
	@Test
	public void testGetQuantity_1() throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", "", 1, 1);

		int result = fixture.getQuantity();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:04 AM
	 */
	@Test
	public void testHashCode_1() throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), null, "", 1, 1);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(953313, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:04 AM
	 */
	@Test
	public void testHashCode_2() throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", (String) null, 1, 1);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(954274, result);
	}

	/**
	 * Run the void setId(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:04 AM
	 */
	@Test
	public void testSetId_1() throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", "", 1, 1);
		Long id = new Long(1L);

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setPrice(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:04 AM
	 */
	@Test
	public void testSetPrice_1() throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", "", 1, 1);
		int price = 1;

		fixture.setPrice(price);

		// add additional test code here
	}

	/**
	 * Run the void setProductId(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:04 AM
	 */
	@Test
	public void testSetProductId_1() throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", "", 1, 1);
		String productId = "";

		fixture.setProductId(productId);

		// add additional test code here
	}

	/**
	 * Run the void setProductName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:04 AM
	 */
	@Test
	public void testSetProductName_1() throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L),"", "", 1, 1);
		String productName = "";

		fixture.setProductName(productName);

		// add additional test code here
	}

	/**
	 * Run the void setQuantity(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:04 AM
	 */
	@Test
	public void testSetQuantity_1() throws Exception {
		OrderDetailsEntity fixture = new OrderDetailsEntity(new Long(1L), "", "", 1, 1);
		int quantity = 1;

		fixture.setQuantity(quantity);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 1/30/18 11:04 AM
	 */
	@Before
	public void setUp() throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *             if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 1/30/18 11:04 AM
	 */
	@After
	public void tearDown() throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args
	 *            the command line arguments
	 *
	 * @generatedBy CodePro at 1/30/18 11:04 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(OrderDetailsEntityTest.class);
	}
}
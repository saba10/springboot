package com.cg.catalog.app.bean;

import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

/**
 * The class <code>GiftCardCatalogTest</code> contains tests for the class <code>{@link GiftCardCatalog}</code>.
 *
 * @generatedBy CodePro at 2/2/18 5:39 PM
 * @author preekm
 * @version $Revision: 1.0 $
 */
public class GiftCardCatalogTest {
	@InjectMocks
	GiftCardCatalog giftCardCatalog;
	/**
	 * Run the String getGiftCardId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testGetGiftCardId_1()
		throws Exception {
		GiftCardCatalog fixture = new GiftCardCatalog();
		fixture.setGiftCardValue("500");
		fixture.setGiftCardId("gc11");

		String result = fixture.getGiftCardId();

		// add additional test code here
		assertEquals("gc11", result);
	}

	/**
	 * Run the String getGiftCardValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testGetGiftCardValue_1()
		throws Exception {
		GiftCardCatalog fixture = new GiftCardCatalog();
		fixture.setGiftCardValue("500");
		fixture.setGiftCardId("gc11");

		String result = fixture.getGiftCardValue();

		// add additional test code here
		assertEquals("500", result);
	}

	/**
	 * Run the void setGiftCardId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testSetGiftCardId_1()
		throws Exception {
		GiftCardCatalog fixture = new GiftCardCatalog();
		fixture.setGiftCardValue("500");
		fixture.setGiftCardId("gc11");
		String giftCardId = "gc11";

		fixture.setGiftCardId(giftCardId);

		// add additional test code here
	}

	/**
	 * Run the void setGiftCardValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testSetGiftCardValue_1()
		throws Exception {
		GiftCardCatalog fixture = new GiftCardCatalog();
		fixture.setGiftCardValue("500");
		fixture.setGiftCardId("gc11");
		String giftCardValue = "500";

		fixture.setGiftCardValue(giftCardValue);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		GiftCardCatalog fixture = new GiftCardCatalog();
		fixture.setGiftCardValue("500");
		fixture.setGiftCardId("gc11");

		String result = fixture.toString();

		// add additional test code here
		assertEquals("{\"giftCardId\":\"gc11\", \"giftCardValue\":\"500\"}", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		MockitoAnnotations.initMocks(this);	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
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
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GiftCardCatalogTest.class);
	}
}

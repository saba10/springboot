package com.capgemini.serviceimpl;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ProductCartModelTest</code> contains tests for the class
 * <code>{@link ProductCartModel}</code>.
 *
 * @author vamshkri
 * @version $Revision: 1.0 $
 */
public class ProductCartModelTest {

	ProductCartModel productCartModel;
	
	@Before
	public void setUp() throws Exception {
		productCartModel = new ProductCartModel();
		productCartModel.setPrice("399");
		productCartModel.setProductId("1452");
		productCartModel.setQuantity("2");
	}

	@Test
	public void testProductCartModel() throws Exception {
		ProductCartModel result = new ProductCartModel();
		assertNotNull(result);
	}

	@Test
	public void testGetPrice() throws Exception {
		String result = productCartModel.getPrice();
		assertEquals("399", result);
	}

	@Test
	public void testGetProductId() throws Exception {
		String result = productCartModel.getProductId();
		assertEquals("1452", result);
	}

	@Test
	public void testGetQuantity() throws Exception {
		String result = productCartModel.getQuantity();
		assertEquals("2", result);
	}

	@Test
	public void testSetPrice() throws Exception {
		String price = "799";
		productCartModel.setPrice(price);
	}

	@Test
	public void testSetProductId() throws Exception {
		String productId = "2563";
		productCartModel.setProductId(productId);
	}

	@Test
	public void testSetQuantity() throws Exception {
		String quantity = "3";
		productCartModel.setQuantity(quantity);
	}

	@Test
	public void testToString() throws Exception {
		String result = productCartModel.toString();
		assertEquals("ProductCartModel [productId=1452, quantity=2, price=399]", result);
	}

	@After
	public void tearDown() throws Exception {
		productCartModel=null;
		System.gc();
	}
}
package com.capgemini.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

public class UserCartModelTest {

	UserCartModel userCartModel;

	@Before
	public void setUp() throws Exception {
		List<ProductCartModel> cartItemList = new ArrayList<ProductCartModel>();
		ProductCartModel cartModel = new ProductCartModel();
		cartModel.setPrice("800");
		cartModel.setProductId("1111");
		cartModel.setQuantity("1");
		cartItemList.add(cartModel);

		userCartModel = new UserCartModel();
		userCartModel.setUserId("capgemini");
		userCartModel.setCartItemList(cartItemList);
	}

	@Test
	public void testUserCartModel() throws Exception {
		UserCartModel result = new UserCartModel();
		assertNotNull(result);
	}

	@Test
	public void testGetCartItemList() throws Exception {
		List<ProductCartModel> list = userCartModel.getCartItemList();
		assertNotNull(list);
		assertEquals("[ProductCartModel [productId=1111, quantity=1, price=800]]", list.toString());
	}

	@Test
	public void testGetUserId() throws Exception {
		String userId = userCartModel.getUserId();
		assertEquals("capgemini", userId);
	}

	@Test
	public void testSetCartItemList() throws Exception {
		List<ProductCartModel> list = userCartModel.getCartItemList();
		assertNotNull(list);
		List<ProductCartModel> cartItemList = new ArrayList<ProductCartModel>();
		ProductCartModel productcartModel = new ProductCartModel();
		productcartModel.setPrice("399");
		productcartModel.setProductId("7896");
		productcartModel.setQuantity("1");
		cartItemList.add(productcartModel);

		userCartModel.setCartItemList(cartItemList);
		assertEquals("[ProductCartModel [productId=7896, quantity=1, price=399]]", cartItemList.toString());

	}

	@Test
	public void testSetUserId_1() throws Exception {
		assertEquals("capgemini", userCartModel.getUserId());
		String replace = "dtp";
		userCartModel.setUserId(replace);
		assertNotEquals("capgemini", replace);
	}

	@Test
	public void testToString_1() throws Exception {
		String result = userCartModel.toString();
		assertEquals(
				"UserCartModel [userId=capgemini, cartItemList=[ProductCartModel [productId=1111, quantity=1, price=800]]]",
				result);
	}

	@After
	public void tearDown() throws Exception {
		userCartModel = null;
	}

	/**
	 * Launch the test.
	 *
	 * @param args
	 *            the command line arguments
	 *
	 * @generatedBy CodePro at 2/1/18 9:52 AM
	 */
}
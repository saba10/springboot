package com.capgemini.bean;

import org.junit.*;
import static org.junit.Assert.*;

public class ProductListTest {

	ProductList list;
	
	@Before
	public void setUp() throws Exception {
		list=new ProductList();
		list.setProductId("1456");
		list.setProductPrice("800");
		list.setProductName("Nike Shoes");
		list.setOrderNumber("7896");
		list.setQuantity(1);
	}

	@Test
	public void testGetOrderNumber() throws Exception {
		String result = list.getOrderNumber();
		assertEquals("7896", result);
		assertNotNull(list);
		assertTrue(list.getProductId().equals("1456"));
		assertNotEquals("aaaa", list.getProductName());
	}

	@Test
	public void testGetProductId() throws Exception {
		String result = list.getProductId();
		assertEquals("1456", result);
		assertFalse(list.getQuantity() == 2);
		assertNotNull(list.getProductName());
	}

	@Test
	public void testGetProductName() throws Exception {
		String result = list.getProductName();
		assertEquals("Nike Shoes", result);
		assertNotEquals("1455", list.getProductId());
		assertNotNull(list.getQuantity());
	}

	@Test
	public void testGetProductPrice() throws Exception {
		String result = list.getProductPrice();
		assertNotEquals("100", result);
		assertEquals("Nike Shoes", list.getProductName());
		assertTrue(list.getProductId().equals("1456"));
	}

	@Test
	public void testGetQuantity() throws Exception {
		int result = list.getQuantity();
		assertEquals(1, result);
		assertNotEquals("1111", list.getOrderNumber());
		assertTrue(list.getProductId().equals("1456"));
	}

	@Test
	public void testSetOrderNumber() throws Exception {
		assertEquals("7896", list.getOrderNumber());
		String orderNumber = "";
		list.setOrderNumber(orderNumber);
		assertNotEquals("1111", list.getOrderNumber());
		assertNotNull(list.getProductId());
		
	}

	@Test
	public void testSetProductId() throws Exception {
		assertEquals("1456", list.getProductId());
		String productId = "6936";
		list.setProductId(productId);
		assertNotEquals("1456", list.getProductId());
		assertTrue(list.getProductName().equals("Nike Shoes"));
	}

	@Test
	public void testSetProductName_1() throws Exception {
		String productName = "Puma Shoes";
		list.setProductName(productName);
		assertNotEquals("Nike Shoes", list.getProductName());
		assertNotNull(list.getQuantity());
	}

	@Test
	public void testSetProductPrice_1() throws Exception {
		String productPrice = "1500";
		list.setProductPrice(productPrice);
		assertTrue(list.getProductPrice().equals(productPrice));
		assertEquals("Nike Shoes", list.getProductName());
		assertNotNull(list);
	}

	@Test
	public void testSetQuantity_1() throws Exception {
		assertEquals(1, list.getQuantity());
		int quantity = 3;
		list.setQuantity(quantity);
		assertNotEquals(1, list.getQuantity());
		assertEquals(3, list.getQuantity());
	}

	@Test
	public void testToString_1() throws Exception {
		String result = list.toString();
		assertEquals("Product [productId=1456, productName=Nike Shoes, productPrice=800]", result);
		assertNotNull(list);
	}

	@After
	public void tearDown() throws Exception {
		list=null;
		System.gc();
	}
}
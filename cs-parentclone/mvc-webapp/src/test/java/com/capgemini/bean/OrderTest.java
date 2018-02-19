package com.capgemini.bean;

import org.junit.*;
import static org.junit.Assert.*;

public class OrderTest {

	Order order;
	
	@Before
	public void setUp() throws Exception {
		order=new Order();
		order.setQuantity(1);
		order.setProductPrice("800");
		order.setOrderDate("12-10-2017");
		order.setProductId("1576");
		order.setOrderNumber(1117);
		order.setProductName("Nike Shoes");
	}

	@Test
	public void testGetOrderDate() throws Exception {
		assertEquals("12-10-2017", order.getOrderDate());
		assertFalse(order.getOrderDate().equals("30-01-2018"));
		assertNotNull(order.getOrderNumber());
		assertEquals(1, order.getQuantity());
		assertEquals(1117, order.getOrderNumber());
		assertNotEquals("1111", order.getProductId());
		assertTrue(order.getProductPrice().equals("800"));
		
	}

	@Test
	public void testGetOrderNumber() throws Exception {
		assertEquals(1117, order.getOrderNumber());
		assertEquals("1576", order.getProductId());
		assertTrue(order.getProductPrice().equals("800"));
		assertNotEquals(2, order.getQuantity());
		assertNotNull(order);
	
	}

	@Test
	public void testGetProductId() throws Exception {
		String result = order.getProductId();
		assertNotNull(result);
		assertNotNull(order.getQuantity());
		assertEquals("Nike Shoes", order.getProductName());
		assertTrue(order.getOrderDate().equals("12-10-2017"));
	}

	@Test
	public void testGetProductName() throws Exception {
		String result = order.getProductName();
		assertEquals("Nike Shoes", result);
		assertNotNull(order.getQuantity());
		assertTrue(order.getProductPrice().equals("800"));
		assertFalse(order.getOrderNumber()==1);
	}

	@Test
	public void testGetProductPrice() throws Exception {
		String result = order.getProductPrice();
		assertEquals("800", result);
		assertNotNull(order.getProductName());
		assertTrue(order.getQuantity()==1);
		assertFalse(order.getOrderNumber()==1);
	}

	@Test
	public void testGetQuantity() throws Exception {
		int result = order.getQuantity();
		assertEquals(1, result);
		assertFalse(order.getOrderNumber()==1);
		assertEquals("Nike Shoes", order.getProductName());
		assertNotNull(order.getOrderDate());
		assertTrue(order.getProductPrice().equals("800"));
	}

	@Test
	public void testSetOrderDate() throws Exception {
		assertEquals("12-10-2017", order.getOrderDate());
		String orderDate = "30-01-2018";
		order.setOrderDate(orderDate);
		assertEquals("30-01-2018", order.getOrderDate());
		assertNotNull(order);
		assertTrue(order.getProductName().equals("Nike Shoes"));
	}

	@Test
	public void testSetOrderNumber() throws Exception {
		assertTrue(1117 == order.getOrderNumber());
		int i = 1;
		order.setOrderNumber(i);
		assertNotEquals(1117, order.getOrderNumber());
		assertNotNull(order);
		assertEquals(1, order.getQuantity());
	}

	@Test
	public void testSetProductId() throws Exception {
		String productId = "8856";
		order.setProductId(productId);
		assertEquals("8856", order.getProductId());
		assertFalse(order.getProductPrice().equals("650"));
	}

	@Test
	public void testSetProductName() throws Exception {
		String productName = "Puma Shoes";
		order.setProductName(productName);
		assertNotEquals("Nike Shoes", order.getProductName());
		assertTrue(order.getQuantity()==1);
	}

	@Test
	public void testSetProductPrice() throws Exception {
		assertNotEquals("1000", order.getProductPrice());
		String productPrice = "1000";
		order.setProductPrice(productPrice);
		assertEquals("1000", order.getProductPrice());
		assertNotNull(order.getOrderDate());
	}

	@Test
	public void testSetQuantity() throws Exception {
		assertEquals(1, order.getQuantity());
		int quantity = 10;
		order.setQuantity(quantity);
		assertNotEquals(1, order.getQuantity());
		assertNotNull(order);
	}

	@After
	public void tearDown() throws Exception {
		order=null;
		System.gc();
	}
	
}
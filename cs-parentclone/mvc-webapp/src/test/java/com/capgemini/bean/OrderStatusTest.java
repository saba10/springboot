package com.capgemini.bean;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class OrderStatusTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void test()
	{
		assertEquals(com.capgemini.bean.OrderStatus.inprogress, OrderStatus.inprogress);
	}

	@After
	public void tearDown() throws Exception {
	}

}
package com.capgemini.entity;

import java.util.LinkedList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>OrderEntityTest</code> contains tests for the class <code>{@link OrderEntity}</code>.
 *
 * @generatedBy CodePro at 2/7/18 11:00 AM
 * @author msisodia
 * @version $Revision: 1.0 $
 */
public class OrderEntityTest {
	/**
	 * Run the OrderEntity() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 11:00 AM
	 */
	@Test
	public void testOrderEntity_1()
		throws Exception {

		OrderEntity result = new OrderEntity();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getStatus());
		assertEquals(null, result.getUserId());
		assertEquals(null, result.getOrderId());
	}

	/**
	 * Run the OrderEntity(Long,String,OrderStatus,List<OrderDetailsEntity>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 11:00 AM
	 */
	@Test
	public void testOrderEntity_2()
		throws Exception {
		Long orderId = new Long(1L);
		Long userId = new Long(1L);
		OrderStatus status = OrderStatus.cancelled;
		List<OrderDetailsEntity> orderDetails = new LinkedList();

		OrderEntity result = new OrderEntity(orderId, userId, status, orderDetails);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getUserId());
		assertEquals(new Long(1L), result.getOrderId());
	}

	/**
	 * Run the List<OrderDetailsEntity> getOrderDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 11:00 AM
	 */
	@Test
	public void testGetOrderDetails_1()
		throws Exception {
		OrderEntity fixture = new OrderEntity(new Long(1L), new Long(1L), OrderStatus.cancelled, new LinkedList());

		List<OrderDetailsEntity> result = fixture.getOrderDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Long getOrderId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 11:00 AM
	 */
	@Test
	public void testGetOrderId_1()
		throws Exception {
		OrderEntity fixture = new OrderEntity(new Long(1L),new Long(1L), OrderStatus.cancelled, new LinkedList());

		Long result = fixture.getOrderId();

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
	 * Run the OrderStatus getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 11:00 AM
	 */
	@Test
	public void testGetStatus_1()
		throws Exception {
		OrderEntity fixture = new OrderEntity(new Long(1L),new Long(1L), OrderStatus.cancelled, new LinkedList());

		OrderStatus result = fixture.getStatus();

		// add additional test code here
		assertNotNull(result);
		assertEquals("cancelled", result.name());
		assertEquals("cancelled", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the String getUserId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 11:00 AM
	 */
	@Test
	public void testGetUserId_1()
		throws Exception {
		OrderEntity fixture = new OrderEntity(new Long(1L), new Long(1L), OrderStatus.cancelled, new LinkedList());

		Long result = fixture.getUserId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setOrderDetails(List<OrderDetailsEntity>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 11:00 AM
	 */
	@Test
	public void testSetOrderDetails_1()
		throws Exception {
		OrderEntity fixture = new OrderEntity(new Long(1L), new Long(1L), OrderStatus.cancelled, new LinkedList());
		List<OrderDetailsEntity> orderDetails = new LinkedList();

		fixture.setOrderDetails(orderDetails);

		// add additional test code here
	}

	/**
	 * Run the void setOrderId(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 11:00 AM
	 */
	@Test
	public void testSetOrderId_1()
		throws Exception {
		OrderEntity fixture = new OrderEntity(new Long(1L), new Long(1L), OrderStatus.cancelled, new LinkedList());
		Long orderId = new Long(1L);

		fixture.setOrderId(orderId);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(OrderStatus) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 11:00 AM
	 */
	@Test
	public void testSetStatus_1()
		throws Exception {
		OrderEntity fixture = new OrderEntity(new Long(1L), new Long(1L), OrderStatus.cancelled, new LinkedList());
		OrderStatus status = OrderStatus.cancelled;

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setUserId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 11:00 AM
	 */
	@Test
	public void testSetUserId_1()
		throws Exception {
		OrderEntity fixture = new OrderEntity(new Long(1L), new Long(1L), OrderStatus.cancelled, new LinkedList());
		Long userId = new Long(1L);

		fixture.setUserId(userId);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/7/18 11:00 AM
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
	 * @generatedBy CodePro at 2/7/18 11:00 AM
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
	 * @generatedBy CodePro at 2/7/18 11:00 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(OrderEntityTest.class);
	}
}
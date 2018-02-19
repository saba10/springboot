package com.capgemini.bean;

import java.util.ArrayList;
import java.util.List;
import net.minidev.json.JSONArray;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>OrderEntityTest</code> contains tests for the class <code>{@link OrderEntity}</code>.
 *
 * @author vamshkri
 * @version $Revision: 1.0 $
 */
public class OrderEntityTest {

	OrderEntity orderEntity;

	@Before
	public void setUp() throws Exception {
		List<OrderDetailsEntity> orderDetailsEntity = new ArrayList<OrderDetailsEntity>();
		orderDetailsEntity.add(new OrderDetailsEntity());
		orderEntity = new OrderEntity();
		orderEntity.setOrderId(4563L);
		orderEntity.setStatus(OrderStatus.inprogress);
		orderEntity.setUserId(4124L);
		orderEntity.setOrderDetails(orderDetailsEntity);
	}

	@Test
	public void testOrderEntity() throws Exception {
		assertNotNull(orderEntity);
		assertEquals(OrderStatus.inprogress, orderEntity.getStatus());
		assertTrue(4124L == orderEntity.getUserId());
		assertTrue(4563L == orderEntity.getOrderId());
	}

	@Test
	public void testGetOrderDetails() throws Exception {
		List<OrderDetailsEntity> list = orderEntity.getOrderDetails();
		assertNotNull(list);
	}

	@Test
	public void testGetOrderId() throws Exception {
		Long id = orderEntity.getOrderId();
		assertTrue(id == 4563L);
	}

	@Test
	public void testGetStatus_1() throws Exception {
		OrderStatus status = orderEntity.getStatus();
		assertTrue(OrderStatus.inprogress.equals(status));
	}

	@Test
	public void testGetUserId_1() throws Exception {
		Long id = orderEntity.getUserId();
		assertTrue(id == 4124L);
	}

	@Test
	public void testSetOrderDetails_1() throws Exception {
		List<OrderDetailsEntity> orderDetailsEntity = new ArrayList<OrderDetailsEntity>();
		orderDetailsEntity.add(new OrderDetailsEntity());
		orderEntity = new OrderEntity();
		orderEntity.setOrderId(4563L);
		orderEntity.setStatus(OrderStatus.delivered);
		orderEntity.setUserId(4124L);
		orderEntity.setOrderDetails(orderDetailsEntity);

		orderEntity.setOrderDetails(orderDetailsEntity);

	}

	@Test
	public void testSetOrderId_1() throws Exception {
		Long orderId = new Long(10L);
		orderEntity.setOrderId(orderId);
	}

	@Test
	public void testSetStatus_1() throws Exception {
		OrderStatus status = OrderStatus.ok;
		orderEntity.setStatus(status);
	}

	@Test
	public void testSetUserId_1() throws Exception {
		Long userId = new Long(4L);
		orderEntity.setUserId(userId);
	}

	@After
	public void tearDown() throws Exception {
		orderEntity = null;
		System.gc();
	}
}
package com.capgemini.controller;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.capgemini.entity.OrderEntity;
import com.capgemini.entity.OrderStatus;
import com.capgemini.service.OrderService;

/**
 * The class <code>OrderManagementControllerTest</code> contains tests for the
 * class <code>{@link OrderManagementController}</code>.
 *
 * @generatedBy CodePro at 2/5/18 10:11 AM
 * @author msisodia
 * @version $Revision: 1.0 $
 */
public class OrderManagementControllerTest {

	@InjectMocks
	OrderManagementController orderManagementController;

	@Mock
	OrderService orderService;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name
	 *            the name of the test
	 *
	 * @generatedBy CodePro at 2/6/18 5:39 PM
	 */
	// public OrderManagementControllerTest(String name) {
	// }

	/**
	 * Run the List<OrderEntity> getAll() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/18 5:39 PM
	 */
	/*
	 * @Test public void testGetAll_1() throws Exception {
	 * 
	 * List<OrderEntity> list = new ArrayList<OrderEntity>();
	 * 
	 * Mockito.when(orderService.getAll()).thenReturn(new list);
	 * 
	 * 
	 * OrderManagementController fixture = new OrderManagementController();
	 * 
	 * List<OrderEntity> result = fixture.getAll();
	 * 
	 * // add additional test code here // An unexpected exception was thrown in
	 * user code while executing this test: // java.lang.NullPointerException // at
	 * com.capgemini.order.controller.OrderManagementController.getAll(
	 * OrderManagementController.java:42) assertNotNull(result); }
	 */
	/**
	 * Run the List<OrderEntity> getOrdersByOkStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/18 5:39 PM
	 */
	@Test
	public void testGetOrdersByOkStatus_1() throws Exception {
		Mockito.when(orderService.getOrdersByStatus(Mockito.isA(Long.class), Mockito.isA(OrderStatus.class)))
				.thenReturn(new ArrayList<>());

		List<OrderEntity> result = orderManagementController.getOrdersByOkStatus(Long.parseLong("5465656"));

		assertNotNull(result);
	}

	/**
	 * Run the OrderEntity getOrdersByOrderId(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/18 5:39 PM
	 */
	@Test
	public void testGetOrdersByOrderId_1() throws Exception {
		Mockito.when(orderService.getOrdersByOrderId(Mockito.isA(Long.class))).thenReturn(new OrderEntity());

		OrderEntity result = orderManagementController.getOrdersByOrderId(Long.parseLong("7895469"));
		assertNotNull(result);
	}

	/**
	 * Run the List<OrderEntity> getOrdersByProgStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/18 5:39 PM
	 */
	@Test
	public void testGetOrdersByProgStatus_1() throws Exception {

		Mockito.when(orderService.getOrdersByStatus(Mockito.isA(Long.class), Mockito.isA(OrderStatus.class)))
				.thenReturn(new ArrayList<>());

		List<OrderEntity> result = orderManagementController.getOrdersByProgStatus(Long.parseLong("465656"));

		assertNotNull(result);
	}

	/**
	 * Run the List<OrderEntity> getOrdersByUserId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/18 5:39 PM
	 */
	@Test
	public void testGetOrdersByUserId_1() throws Exception {
		Mockito.when(orderService.getOrdersByUserId(Mockito.isA(long.class))).thenReturn(new ArrayList<>());

		List<OrderEntity> result = orderManagementController.getOrdersByUserId(586454L);

		assertNotNull(result);
	}

	/**
	 * Run the OrderEntity save(OrderEntity) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/18 5:39 PM
	 */
	@Test
	public void testSave_1() throws Exception {

		Mockito.when(orderService.saveOrder(Mockito.isA(OrderEntity.class))).thenReturn(new OrderEntity());
		OrderEntity oe = new OrderEntity();

		OrderEntity result = orderManagementController.save(oe);

		assertNotNull(result);
	}

	/**
	 * Run the OrderEntity updateOrders(OrderEntity) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/18 5:39 PM
	 */
	@Test
	public void testUpdateOrders_1() throws Exception {
		Mockito.when(orderService.updateOrders(Mockito.isA(OrderEntity.class))).thenReturn(new OrderEntity());
		OrderEntity oe = new OrderEntity();

		OrderEntity result = orderManagementController.updateOrders(oe);

		assertNotNull(result);
	}

	/**
	 * Launch the test.
	 *
	 * @param args
	 *            the command line arguments
	 *
	 * @generatedBy CodePro at 2/6/18 5:39 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(OrderManagementControllerTest.class);
	}
}
package com.capgemini.service;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.Sort;
import org.springframework.web.client.RestTemplate;

import com.capgemini.entity.OrderEntity;
import com.capgemini.entity.OrderStatus;
import com.capgemini.repo.OrderRepo;

/**
 * The class <code>OrderServiceImplTest</code> contains tests for the class
 * <code>{@link OrderServiceImpl}</code>.
 *
 * @generatedBy CodePro at 2/7/18 9:50 AM
 * @author msisodia
 * @version $Revision: 1.0 $
 */
public class OrderServiceImplTest {
	@InjectMocks
	OrderServiceImpl orderServiceImpl;

	@Mock
	OrderRepo orderRepo;
	@Mock
	RestTemplate restTemplate;

	@Before
	public void setupMock() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetAll_1() throws Exception {
		List<OrderEntity> oe = new ArrayList<OrderEntity>();
		Mockito.when(orderRepo.findAll(any(Sort.class))).thenReturn(oe);

		List<OrderEntity> result = orderServiceImpl.getAll();

		assertNotNull(result);
	}

	/**
	 * Run the OrderEntity getOrdersByOrderId(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 9:50 AM
	 */
	@Test
	public void testGetOrdersByOrderId_1() throws Exception {
		Mockito.when(orderRepo.findByOrderId(Mockito.isA(Long.class))).thenReturn(new OrderEntity());

		OrderEntity result = orderServiceImpl.getOrdersByOrderId(Long.parseLong("6574865"));

		assertNotNull(result);
	}

	/**
	 * Run the List<OrderEntity> getOrdersByStatus(Long,OrderStatus) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 9:50 AM
	 */
	@Test
	public void testGetOrdersByStatus_1() throws Exception {
		Mockito.when(orderRepo.findByUserIdAndStatus(Mockito.isA(Long.class), Mockito.isA(OrderStatus.class)))
				.thenReturn(new ArrayList<>());

		OrderStatus status = OrderStatus.cancelled;

		List<OrderEntity> result = orderServiceImpl.getOrdersByStatus(Long.parseLong("86846"), status);

		assertNotNull(result);
	}

	/**
	 * Run the List<OrderEntity> getOrdersByUserId(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 9:50 AM
	 */
	@Test
	public void testGetOrdersByUserId_1() throws Exception {
		Mockito.when(orderRepo.findByUserId(Mockito.isA(Long.class))).thenReturn(new ArrayList<>());

		List<OrderEntity> result = orderServiceImpl.getOrdersByUserId(755246L);

		assertNotNull(result);
	}

	/**
	 * Run the OrderEntity saveOrder(OrderEntity) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 9:50 AM
	 */
	@Test
	public void testSaveOrder_1() throws Exception {
		Mockito.when(orderRepo.save(Mockito.isA(OrderEntity.class))).thenReturn(new OrderEntity());

		OrderEntity entity = new OrderEntity();

		OrderEntity result = orderServiceImpl.saveOrder(entity);

		assertNotNull(result);
	}

	/**
	 * Run the OrderEntity updateOrders(OrderEntity) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 9:50 AM
	 */
	@Test
	public void testUpdateOrders_1() throws Exception {
		Mockito.when(orderRepo.save(Mockito.isA(OrderEntity.class))).thenReturn(new OrderEntity());

		OrderEntity entity = new OrderEntity();

		OrderEntity result = orderServiceImpl.updateOrders(entity);

		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/7/18 9:50 AM
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
	 * @generatedBy CodePro at 2/7/18 9:50 AM
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
	 * @generatedBy CodePro at 2/7/18 9:50 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(OrderServiceImplTest.class);
	}
}
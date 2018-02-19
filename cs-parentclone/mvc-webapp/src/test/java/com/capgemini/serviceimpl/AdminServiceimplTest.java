package com.capgemini.serviceimpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.capgemini.bean.AdminLogin;
import com.capgemini.bean.ClickStream;
import com.capgemini.bean.OrderDetailsEntity;
import com.capgemini.bean.OrderEntity;
import com.capgemini.bean.OrderStatus;
import com.capgemini.bean.ProductCatalog;
import com.capgemini.service.CatalogService;

/**
 * The class <code>AdminServiceimplTest</code> contains tests for the class <code>{@link AdminServiceimpl}</code>.
 *
 * @author vamshkri
 * @version $Revision: 1.0 $
 */

public class AdminServiceimplTest {

	@InjectMocks
	AdminServiceimpl adminService;
	
	@Mock
	RestTemplate restTemplate;
	
	@Mock
	CatalogService catalogService;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testAdminServiceimpl() throws Exception {
		AdminServiceimpl result = new AdminServiceimpl();
		assertNotNull(result);
	}

	@Test
	public void testAdminLogin_1()
		throws Exception {
		AdminServiceimpl admin = new AdminServiceimpl();
		AdminLogin adminValidate = new AdminLogin();
		adminValidate.setUsername("capgemini");
		adminValidate.setPassword("capgemini");
		boolean result = admin.adminLogin(adminValidate);
		assertEquals(true, result);
	}

	@Test
	public void testAdminLogin_2()
		throws Exception {
		AdminServiceimpl fixture = new AdminServiceimpl();
		AdminLogin adminValidate = new AdminLogin();
		adminValidate.setUsername("capgemini");
		adminValidate.setPassword("dtp");
		boolean result = fixture.adminLogin(adminValidate);
		assertEquals(false, result);
	}

	@Test
	public void testAdminLogin_3()
		throws Exception {
		AdminServiceimpl fixture = new AdminServiceimpl();
		AdminLogin adminValidate = new AdminLogin();
		adminValidate.setUsername("dtp");
		adminValidate.setPassword("capgemini");
		boolean result = fixture.adminLogin(adminValidate);
		assertEquals(false, result);
	}

	@Test
	public void testGetAllOrder_1() throws Exception {
		
		OrderEntity arr1[] = new OrderEntity[1];
		ResponseEntity<OrderEntity[]> orderlists = new ResponseEntity<>(arr1, HttpStatus.OK);

		Mockito.when(restTemplate.getForEntity(Mockito.isA(String.class), Mockito.isA(Class.class))).thenReturn(orderlists);
		adminService.getAllOrder();
	}

	
	/*@Test
	public void testGetAllOrder_2()
		throws Exception {
		OrderDetailsEntity orderDetails=new OrderDetailsEntity();
		orderDetails.setId(3L);
		orderDetails.setPrice(800);
		orderDetails.setProductId(4L);
		orderDetails.setProductName("Puma Shoes");
		orderDetails.setQuantity(1);

		List<OrderDetailsEntity> list1=new ArrayList<OrderDetailsEntity>();
		list1.add(orderDetails);
		
		OrderEntity order=new OrderEntity();
		order.setOrderId(1L);
		order.setStatus(OrderStatus.inprogress);
		order.setUserId(2L);
		order.setOrderDetails(list1);
		
		OrderEntity arr1[] = new OrderEntity[1];
		arr1[0]=order;
		
		
		ResponseEntity<OrderEntity[]> orderlists = new ResponseEntity<>(arr1, HttpStatus.OK);

		Mockito.when(restTemplate.getForEntity(Mockito.isA(String.class), Mockito.isA(Class.class))).thenReturn(orderlists);
		adminService.getAllOrder();
		
	}*/

	@Test
	public void testSar_1() throws Exception {
		
		ClickStream click=new ClickStream();
		click.setTimestam("60sec");
		click.setUserId("capgemini");
		click.setUserUrl("www.google.com");

		Mockito.when(restTemplate.getForObject(Mockito.isA(String.class), Mockito.isA(Class.class), Mockito.isA(String.class), Mockito.isA(String.class))).thenReturn(click);
		adminService.sar("capgemini");
		
		
	}
	
	@Test
	public void testAddToProduct_1() throws Exception {
		ProductCatalog prod=new ProductCatalog();
		prod.setCatagoryName("");
		prod.setImageUrl("");
		prod.setPrice("");
		prod.setProductIdChild("");
		prod.setProductIdParent("");
		prod.setProductName("");
		Mockito.when(restTemplate.postForObject(Mockito.isA(String.class), Mockito.isA(Class.class), Mockito.isA(Class.class))).thenReturn(prod);
		adminService.addToProduct(prod);
	}
	
	@Test
	public void testUpdateProduct_1() throws Exception {
		ProductCatalog prod=new ProductCatalog();
		prod.setCatagoryName("");
		prod.setImageUrl("");
		prod.setPrice("");
		prod.setProductIdChild("");
		prod.setProductIdParent("");
		prod.setProductName("");
		Mockito.when(restTemplate.postForObject(Mockito.isA(String.class), Mockito.isA(Class.class), Mockito.isA(Class.class))).thenReturn(prod);
		adminService.updateProduct(prod);
	}

	@Test
	public void testUpdateOrder_1() throws Exception {
		OrderDetailsEntity orderDetails=new OrderDetailsEntity();
		orderDetails.setId(3L);
		orderDetails.setPrice(800);
		orderDetails.setProductId("4L");
		orderDetails.setProductName("Puma Shoes");
		orderDetails.setQuantity(1);

		List<OrderDetailsEntity> list1=new ArrayList<OrderDetailsEntity>();
		list1.add(orderDetails);
		
		OrderEntity order=new OrderEntity();
		order.setOrderId(1L);
		order.setStatus(OrderStatus.inprogress);
		order.setUserId(2L);
		order.setOrderDetails(list1);
		
		Mockito.when(restTemplate.postForObject(Mockito.isA(String.class), Mockito.isA(Class.class), Mockito.isA(Class.class))).thenReturn(order);
		adminService.updateOrder(order);
		assertNotNull(order);
	}

	@After
	public void tearDown() throws Exception {
		// Add additional tear down code here
	}
}

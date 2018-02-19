package com.capgemini.serviceimpl;

import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.web.client.RestTemplate;
import com.capgemini.bean.ProductCatalog;

/**
 * The class <code>CatalogServiceImplTest</code> contains tests for the class
 * <code>{@link CatalogServiceImpl}</code>.
 *
 * @author vamshkri
 * @version $Revision: 1.0 $
 */
public class CatalogServiceImplTest {
	
	@InjectMocks
	CatalogServiceImpl catalogServiceImpl;
	
	@Mock
	RestTemplate restTemplate;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testCategorySearch_1() throws Exception 
	{
		ProductCatalog[] list=new ProductCatalog[1];
		list[0]=new ProductCatalog();
		Mockito.when(restTemplate.postForObject(Mockito.isA(String.class), Mockito.isA(Class.class), 
				Mockito.isA(Class.class), Mockito.isA(String.class))).thenReturn(list);
		catalogServiceImpl.categorySearch("shoes");
	}

	
	@Test
	public void testGetProduct_1() throws Exception {
		ProductCatalog[] list=new ProductCatalog[1];
		list[0]=new ProductCatalog();
		Mockito.when(restTemplate.getForObject(Mockito.isA(String.class), Mockito.isA(Class.class)))
		       .thenReturn(list);
		catalogServiceImpl.getProduct();
	}

	@Test
	public void testSearchProduct_1() throws Exception {
		ProductCatalog[] list=new ProductCatalog[1];
		list[0]=new ProductCatalog();
		Mockito.when(restTemplate.postForObject(Mockito.isA(String.class), Mockito.isA(Class.class), 
				Mockito.isA(Class.class), Mockito.isA(String.class))).thenReturn(list);
		catalogServiceImpl.searchProduct("shoes");
	}

	@After
	public void tearDown() throws Exception {
	
	}
}
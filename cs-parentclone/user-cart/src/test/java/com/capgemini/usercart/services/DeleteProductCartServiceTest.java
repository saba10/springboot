package com.capgemini.usercart.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.capgemini.usercart.model.UserCartModel;
import com.capgemini.usercart.repository.MongoRepositoryDataBaseOperations;

public class DeleteProductCartServiceTest {
	
	@InjectMocks
	DeleteProductCartService deleteProductCartService;

	@Mock
	MongoRepositoryDataBaseOperations mongoRepositoryDataBaseOperations;

	@Test
	public void testDeleteProductCartService_2()
		throws Exception {
		DeleteProductCartService result = new DeleteProductCartService();
		assertNotNull(result);
		// add additional test code here
	}

	
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testDeleteProductCartService_1()
		throws Exception {
		DeleteProductCartService result = new DeleteProductCartService();
		assertNotNull(result);
		// add additional test code here
	}

	
	@Test
	public void testDeleteProduct_1()
		throws Exception {
		Mockito.when(mongoRepositoryDataBaseOperations.exists(Mockito.isA(String.class))).thenReturn(true);
		Mockito.when(mongoRepositoryDataBaseOperations.findOne(Mockito.isA(String.class))).thenReturn(new UserCartModel());
		Mockito.when(mongoRepositoryDataBaseOperations.save(Mockito.isA(UserCartModel.class))).thenReturn(new UserCartModel());
		
UserCartModel userCartModel = deleteProductCartService.deleteProduct("xyz", "abc");
		assertEquals(null, userCartModel);
	}

	
	@Test
	public void testDeleteProduct_2()
		throws Exception {
		Mockito.when(mongoRepositoryDataBaseOperations.exists(Mockito.isA(String.class))).thenReturn(false);
		Mockito.when(mongoRepositoryDataBaseOperations.findOne(Mockito.isA(String.class))).thenReturn(new UserCartModel());
		Mockito.when(mongoRepositoryDataBaseOperations.save(Mockito.isA(UserCartModel.class))).thenReturn(new UserCartModel());
		
UserCartModel userCartModel = deleteProductCartService.deleteProduct("xyz", "abc");
		assertEquals(null, userCartModel);		
		}



	
	
	


}
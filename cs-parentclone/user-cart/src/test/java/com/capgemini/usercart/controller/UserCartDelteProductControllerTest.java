package com.capgemini.usercart.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.capgemini.usercart.model.UserCartModel;
import com.capgemini.usercart.services.DeleteProductCartService;


public class UserCartDelteProductControllerTest {
	
	
	@InjectMocks
	UserCartDelteProductController userCartDelteProductController;
	
	
	@Mock
	DeleteProductCartService deleteProductCartService;
	

	 @Before
	    public void setupMock() {
	        MockitoAnnotations.initMocks(this);
	    }
	

	
	@Test
	public void testDeleteProduct_1()
		throws Exception {
		
		  Mockito.when(deleteProductCartService.deleteProduct(Mockito.isA(String.class),Mockito.isA(String.class))).thenReturn(new UserCartModel());

		  UserCartModel userCartModel = userCartDelteProductController.deleteProduct("xyz","abc");
		  assertNotNull(userCartModel);
		//  assertEquals(null, userCartModel);
	}

	

	
	@Test
	public void testDeleteProduct_2()
		throws Exception {
		UserCartDelteProductController fixture = new UserCartDelteProductController();
		fixture.deleteProductCartService = new DeleteProductCartService();
		String userId = "";
		String productId = "";

		UserCartModel result = fixture.deleteProduct(userId, productId);

		// add additional test code here
		assertEquals(null, result);
	}

	
}
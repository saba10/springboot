package com.capgemini.usercart.controller;

import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import com.capgemini.usercart.model.UserCartModel;
import com.capgemini.usercart.services.AddProductCartService;

public class UserCartAddControllerTest {
		
	@InjectMocks
	UserCartAddController userCartAddController;
	

    @Mock
    AddProductCartService addProductCartService;
	
	
	 @Before
	    public void setupMock() {
	        MockitoAnnotations.initMocks(this);
	    }
	
	@Test
	public void testUserCartAddController_1()
		throws Exception {
		UserCartAddController result = new UserCartAddController();
		assertNotNull(result);
		// add additional test code here
	}

	
	@Test
	public void testCreate_1()
		throws Exception {
		
		  Mockito.when(addProductCartService.addProduct(Mockito.isA(String.class),Mockito.isA(String.class),Mockito.isA(String.class))).thenReturn(new UserCartModel());
		  UserCartModel userCartModel = userCartAddController.create("xyz", "abc", "3");
          assertNotNull(userCartModel);
	}

	
	
}
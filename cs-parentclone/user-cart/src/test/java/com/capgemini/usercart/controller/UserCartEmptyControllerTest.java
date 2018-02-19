package com.capgemini.usercart.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.capgemini.usercart.services.EmptyProductCartService;


public class UserCartEmptyControllerTest {
	
	
	@InjectMocks
	UserCartEmptyController userCartEmptyController;
	
	@Mock
	EmptyProductCartService emptyProductcartService;
	

	 @Before
	    public void setupMock() {
	        MockitoAnnotations.initMocks(this);
	    }

	@Test
	public void testCreate_1()
		throws Exception {
		
		  Mockito.when(emptyProductcartService.emptyCart(Mockito.isA(String.class))).thenReturn(Mockito.isA(String.class));
		  
		  String result = userCartEmptyController.create("xyz");

		
	

		// add additional test code here
		assertEquals(null, result);
	}

	

	

}
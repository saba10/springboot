package com.capgemini.usercart.controller;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.capgemini.usercart.model.UserCartModel;
import com.capgemini.usercart.services.UserCartDetailService;


public class UserCartDetailControllerTest {
	
	
	@InjectMocks
	UserCartDetailController userCartDetailController;
	@Mock
	UserCartDetailService userCartDetailService;
	
	 @Before
	    public void setupMock() {
	        MockitoAnnotations.initMocks(this);
	    }
	
	
	@Test
	public void testGetData_1()
		throws Exception {
		
		  Mockito.when(userCartDetailService.getData(Mockito.isA(String.class))).thenReturn(new UserCartModel());
		  UserCartModel userCartModel = userCartDetailController.getData("xyz");

		assertNotNull(userCartModel);
	}

	

	
	
	
}
package com.capgemini.usercart.services;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.capgemini.usercart.model.UserCartModel;
import com.capgemini.usercart.repository.MongoRepositoryDataBaseOperations;

public class UserCartDetailServiceTest {
	
	@InjectMocks
	UserCartDetailService userCartDetailService;
	
	@Mock
	MongoRepositoryDataBaseOperations mongoRepositoryDataBaseOperations;

	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	
	
	
	@Test
	public void testGetData_1()
		throws Exception {
		Mockito.when(mongoRepositoryDataBaseOperations.exists(Mockito.isA(String.class))).thenReturn(true);
		Mockito.when(mongoRepositoryDataBaseOperations.findOne(Mockito.isA(String.class))).thenReturn(new UserCartModel());
		UserCartModel userCartModel = userCartDetailService.getData("xyz");
		
		
		

		
		assertNotNull(userCartModel);
	}

	@Test(expected = RuntimeException.class)
	public void testGetData_3()
		throws Exception {
		Mockito.when(mongoRepositoryDataBaseOperations.exists(Mockito.isA(String.class))).thenThrow(RuntimeException.class);
		Mockito.when(mongoRepositoryDataBaseOperations.findOne(Mockito.isA(String.class))).thenReturn(new UserCartModel());
		UserCartModel userCartModel = userCartDetailService.getData("xyz");
		
		
		

		
		assertNotNull(userCartModel);
	}

	

	
}
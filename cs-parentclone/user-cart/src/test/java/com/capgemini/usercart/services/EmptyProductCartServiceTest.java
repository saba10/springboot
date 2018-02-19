package com.capgemini.usercart.services;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.capgemini.usercart.repository.MongoRepositoryDataBaseOperations;

public class EmptyProductCartServiceTest {
	
	
	@InjectMocks
	EmptyProductCartService emptyProductCartService;
	
	@Mock
	MongoRepositoryDataBaseOperations mongoRepositoryDataBaseOperations;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}


	
	@Test
	public void testEmptyCart_1()
		throws Exception {
		
		Mockito.when(mongoRepositoryDataBaseOperations.exists(Mockito.isA(String.class))).thenReturn(true);
		
		String emptyCart = emptyProductCartService.emptyCart("xyz");

	
		assertEquals("Success", emptyCart);
	}
	
	@Test
	public void testEmptyCart_2()
		throws Exception {
		
		Mockito.when(mongoRepositoryDataBaseOperations.exists(Mockito.isA(String.class))).thenReturn(false);
		Mockito.when(mongoRepositoryDataBaseOperations.exists(Mockito.isA(String.class))).thenThrow(Exception.class);

		String emptyCart = emptyProductCartService.emptyCart("xyz");

	
		assertEquals("Failed", emptyCart);
	}
}

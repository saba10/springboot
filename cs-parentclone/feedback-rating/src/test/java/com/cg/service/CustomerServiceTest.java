package com.cg.service;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.cg.entity.CustomerFeedback;
import com.cg.repository.CustomerRepository;

/**
 * The class <code>CustomerServiceTest</code> contains tests for the class <code>{@link CustomerService}</code>.
 *
 * @generatedBy CodePro at 1/31/18 12:05 PM
 * @author ppallama
 * @version $Revision: 1.0 $
 */
public class CustomerServiceTest {
	
	
	@InjectMocks
	private CustomerService customerService;
	
	@Mock
	private CustomerRepository customerRepository;
	
	@Before
    public void setUp() throws Exception {
         MockitoAnnotations.initMocks(this);
    }
	

	@Test
	public void testSaveData_1() throws Exception {

		CustomerFeedback custFeedback = new CustomerFeedback();
		Mockito.when(customerRepository.save(Mockito.isA(CustomerFeedback.class))).thenReturn(custFeedback);
		CustomerFeedback customer = customerService.saveData(custFeedback);
		assertNotNull(customer);	
		
	}
	
	
	@Test
	public void testGetData_1() throws Exception {
		
		ArrayList<CustomerFeedback> listReturn = new ArrayList<>();
		Mockito.when(customerRepository.findByProductId(Mockito.isA(String.class))).thenReturn(listReturn);
		List<CustomerFeedback> list = customerService.getData("abcd");
		assertNotNull(list);
	}

	
	@After
	public void tearDown() throws Exception {
		// Add additional tear down code here
	}

	
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CustomerServiceTest.class);
	}
}
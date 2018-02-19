package com.cg.controller;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import com.cg.entity.CustomerFeedback;
import com.cg.service.CustomerService;

/**
 * The class <code>FeedbackControllerTest</code> contains tests for the class <code>{@link FeedbackController}</code>.
 *
 * @generatedBy CodePro at 1/31/18 6:30 PM
 * @author ppallama
 * @version $Revision: 1.0 $
 */
public class FeedbackControllerTest {
	
	
	@InjectMocks
	private FeedbackController feedbackController;
	
	@Mock
	private CustomerService customerService;
	
	@Before
    public void setUp() throws Exception {
         MockitoAnnotations.initMocks(this);
    }

	
	@Test
	public void testSaveData_1() throws Exception {
		
		CustomerFeedback custFeedback = new CustomerFeedback();
		Mockito.when(customerService.saveData(Mockito.isA(CustomerFeedback.class))).thenReturn(custFeedback);
		CustomerFeedback customer = feedbackController.saveData(custFeedback);
    	assertNotNull(customer);
		
	}

	
	@Test
	public void testGetData_1() throws Exception {
		
		ArrayList<CustomerFeedback> listReturn = new ArrayList<>();
		Mockito.when(customerService.getData(Mockito.isA(String.class))).thenReturn(listReturn);
		List<CustomerFeedback> list = feedbackController.getData("abcd");
		assertNotNull(list);
	}


	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FeedbackControllerTest.class);
	}
}
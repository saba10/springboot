package com.cg.entity;

import java.util.UUID;
import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

/**
 * The class <code>CustomerFeedbackTest</code> contains tests for the class <code>{@link CustomerFeedback}</code>.
 *
 * @generatedBy CodePro at 2/1/18 7:12 PM
 * @author ppallama
 * @version $Revision: 1.0 $
 */
public class CustomerFeedbackTest {

	@InjectMocks
	private CustomerFeedback customerFeedback;
	
	@Before
    public void setUp() throws Exception {
         MockitoAnnotations.initMocks(this);
    }

	
	
	@Test
	public void testGetFeedback_1() throws Exception {
		CustomerFeedback fixture = new CustomerFeedback();
		fixture.setId(UUID.randomUUID());
		fixture.setUserId("");
		fixture.setProductId("");
		fixture.setRating("");
		fixture.setFeedback("");

		String result = fixture.getFeedback();

		// add additional test code here
		assertEquals("", result);
	}

	
	@Test
	public void testGetId_1() throws Exception {
		CustomerFeedback fixture = new CustomerFeedback();
		fixture.setId(UUID.randomUUID());
		fixture.setUserId("");
		fixture.setProductId("");
		fixture.setRating("");
		fixture.setFeedback("");

		fixture.getId();
		
	}


	
	
	@Test
	public void testGetProductId_1()  throws Exception {
		CustomerFeedback fixture = new CustomerFeedback();
		fixture.setId(UUID.randomUUID());
		fixture.setUserId("");
		fixture.setProductId("");
		fixture.setRating("");
		fixture.setFeedback("");

		String result = fixture.getProductId();

		// add additional test code here
		assertEquals("", result);
	}


	@Test
	public void testGetRating_1() throws Exception {
		CustomerFeedback fixture = new CustomerFeedback();
		fixture.setId(UUID.randomUUID());
		fixture.setUserId("");
		fixture.setProductId("");
		fixture.setRating("");
		fixture.setFeedback("");

		String result = fixture.getRating();

		// add additional test code here
		assertEquals("", result);
	}


	@Test
	public void testGetUserId_1() throws Exception {
		CustomerFeedback fixture = new CustomerFeedback();
		fixture.setId(UUID.randomUUID());
		fixture.setUserId("");
		fixture.setProductId("");
		fixture.setRating("");
		fixture.setFeedback("");

		String result = fixture.getUserId();

		// add additional test code here
		assertEquals("", result);
	}


	@Test
	public void testSetFeedback_1() throws Exception {
		CustomerFeedback fixture = new CustomerFeedback();
		fixture.setId(UUID.randomUUID());
		fixture.setUserId("");
		fixture.setProductId("");
		fixture.setRating("");
		fixture.setFeedback("");
		String feedback = "";

		fixture.setFeedback(feedback);

		// add additional test code here
	}

	
	@Test
	public void testSetId_1() throws Exception {
		CustomerFeedback fixture = new CustomerFeedback();
		fixture.setId(UUID.randomUUID());
		fixture.setUserId("");
		fixture.setProductId("");
		fixture.setRating("");
		fixture.setFeedback("");
		UUID id = UUID.randomUUID();

		fixture.setId(id);

		// add additional test code here
	}

	
	@Test
	public void testSetProductId_1() throws Exception {
		CustomerFeedback fixture = new CustomerFeedback();
		fixture.setId(UUID.randomUUID());
		fixture.setUserId("");
		fixture.setProductId("");
		fixture.setRating("");
		fixture.setFeedback("");
		String productId = "";

		fixture.setProductId(productId);

		// add additional test code here
	}

	
	@Test
	public void testSetRating_1() throws Exception {
		CustomerFeedback fixture = new CustomerFeedback();
		fixture.setId(UUID.randomUUID());
		fixture.setUserId("");
		fixture.setProductId("");
		fixture.setRating("");
		fixture.setFeedback("");
		String rating = "";

		fixture.setRating(rating);

		// add additional test code here
	}


	@Test
	public void testSetUserId_1() throws Exception {
		CustomerFeedback fixture = new CustomerFeedback();
		fixture.setId(UUID.randomUUID());
		fixture.setUserId("");
		fixture.setProductId("");
		fixture.setRating("");
		fixture.setFeedback("");
		String userId = "";

		fixture.setUserId(userId);

		// add additional test code here
	}


	@Test
	public void testToString_1() throws Exception {
		CustomerFeedback fixture = new CustomerFeedback();
		//fixture.setId();
		fixture.setUserId("");
		fixture.setProductId("");
		fixture.setRating("");
		fixture.setFeedback("");

		assertEquals("CustomerFeedback [id=null, userId=, productId=, feedback=, rating=]", fixture.toString());
	}

	@After
	public void tearDown() throws Exception {
		// Add additional tear down code here
	}

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CustomerFeedbackTest.class);
	}
}
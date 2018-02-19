package com.capgemini;

import org.junit.*;
import springfox.documentation.spring.web.plugins.Docket;
import static org.junit.Assert.*;
import org.springframework.web.client.RestTemplate;

/**
 * The class <code>OrderSwaggerConfigTest</code> contains tests for the class <code>{@link OrderSwaggerConfig}</code>.
 *
 * @generatedBy CodePro at 2/7/18 11:04 AM
 * @author msisodia
 * @version $Revision: 1.0 $
 */
public class OrderSwaggerConfigTest {
	/**
	 * Run the Docket api() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 11:04 AM
	 */
	@Test
	public void testApi_1()
		throws Exception {
		OrderSwaggerConfig fixture = new OrderSwaggerConfig();

		Docket result = fixture.api();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isEnabled());
		assertEquals("default", result.getGroupName());
	}

	/**
	 * Run the RestTemplate restTemplate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/7/18 11:04 AM
	 */
	@Test
	public void testRestTemplate_1()
		throws Exception {
		OrderSwaggerConfig fixture = new OrderSwaggerConfig();

		RestTemplate result = fixture.restTemplate();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/7/18 11:04 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 2/7/18 11:04 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 2/7/18 11:04 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(OrderSwaggerConfigTest.class);
	}
}
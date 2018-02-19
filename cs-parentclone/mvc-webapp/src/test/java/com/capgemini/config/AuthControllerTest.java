package com.capgemini.config;

import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.connect.support.ConnectionFactoryRegistry;
import junit.framework.*;

/**
 * The class <code>AuthControllerTest</code> contains tests for the class <code>{@link AuthController}</code>.
 *
 * @generatedBy CodePro at 2/1/18 11:49 PM, using the Spring generator
 * @author sabrmc
 * @version $Revision: 1.0 $
 */
public class AuthControllerTest extends TestCase {
	/**
	 * Run the String connectedView(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 11:49 PM
	 */
	public void testConnectedView_1()
		throws Exception {
		AuthController fixture = new AuthController(new ConnectionFactoryRegistry(), (ConnectionRepository) null);
		String providerId = "";

		String result = fixture.connectedView(providerId);

		// add additional test code here
		assertEquals("redirect:/", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @see TestCase#setUp()
	 *
	 * @generatedBy CodePro at 2/1/18 11:49 PM
	 */
	protected void setUp()
		throws Exception {
		super.setUp();
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @see TestCase#tearDown()
	 *
	 * @generatedBy CodePro at 2/1/18 11:49 PM
	 */
	protected void tearDown()
		throws Exception {
		super.tearDown();
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 2/1/18 11:49 PM
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
			// Run all of the tests
			junit.textui.TestRunner.run(AuthControllerTest.class);
		} else {
			// Run only the named tests
			TestSuite suite = new TestSuite("Selected tests");
			for (int i = 0; i < args.length; i++) {
				TestCase test = new AuthControllerTest();
				test.setName(args[i]);
				suite.addTest(test);
			}
			junit.textui.TestRunner.run(suite);
		}
	}
}
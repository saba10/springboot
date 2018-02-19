package com.capgemini.config;

import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.web.client.RestTemplate;

/**
 * The class <code>OnlineShopingApplicationTest</code> contains tests for the class <code>{@link OnlineShopingApplication}</code>.
 *
 * @generatedBy CodePro at 2/1/18 11:52 PM
 * @author sabrmc
 * @version $Revision: 1.0 $
 */
public class OnlineShopingApplicationTest {
	
	
	@InjectMocks
	OnlineShopingApplication onlineShopingApplication;
	
	
	private final Set<Object> sources = new LinkedHashSet<Object>();
	
	/**
	 * Run the OnlineShopingApplication() constructor test.
	 *
	 * @generatedBy CodePro at 2/1/18 11:52 PM
	 */
/*	@Test
	public void testOnlineShopingApplication_1()
		throws Exception {
		OnlineShopingApplication result = new OnlineShopingApplication();
		assertNotNull(result);
		// add additional test code here
	}*/

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 11:52 PM
	 */
	/*@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {};
        onlineShopingApplication.main(args);
        Mockito.when(SpringApplication.run(Mockito.isA(OnlineShopingApplication.class), Mockito.isA(String[].class))).thenReturn( new SpringApplication(sources).run(args));
		

		// add additional test code here
	}*/

	/**
	 * Run the RestTemplate restTemplate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 11:52 PM
	 */
	@Test
	public void testRestTemplate_1()
		throws Exception {
		OnlineShopingApplication fixture = new OnlineShopingApplication();

		//RestTemplate result = fixture.restTemplate();

		// add additional test code here
		//assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/1/18 11:52 PM
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
	 * @generatedBy CodePro at 2/1/18 11:52 PM
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
	 * @generatedBy CodePro at 2/1/18 11:52 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(OnlineShopingApplicationTest.class);
	}
}
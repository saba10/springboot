package com.capgemini.serviceimpl;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.web.client.RestTemplate;
import com.capgemini.bean.GiftCard;
import com.capgemini.bean.ProductCatalog;

/**
 * The class <code>CatalogServiceImplTest</code> contains tests for the class <code>{@link CatalogServiceImpl}</code>.
 *
 * @generatedBy CodePro at 1/30/18 11:12 PM
 * @author preekm
 * @version $Revision: 1.0 $
 */
public class CatalogServiceImplTest {
	/**
	 * Run the GiftCard addCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:12 PM
	 */
	@Test
	public void testAddCatalog_1()
		throws Exception {
		CatalogServiceImpl fixture = new CatalogServiceImpl();
		fixture.cat = new CatalogServiceImpl();
		fixture.restTemplate = new RestTemplate();

		GiftCard result = fixture.addCatalog();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<ProductCatalog> categorySearch(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:12 PM
	 */
	@Test
	public void testCategorySearch_1()
		throws Exception {
		CatalogServiceImpl fixture = new CatalogServiceImpl();
		fixture.cat = new CatalogServiceImpl();
		fixture.restTemplate = new RestTemplate();
		String categoryName = "";

		List<ProductCatalog> result = fixture.categorySearch(categoryName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.web.client.ResourceAccessException: I/O error on POST request for "http://10.77.116.23:9090/catagory": Connection refused: connect; nested exception is java.net.ConnectException: Connection refused: connect
		//       at org.springframework.web.client.RestTemplate.doExecute(RestTemplate.java:673)
		//       at org.springframework.web.client.RestTemplate.execute(RestTemplate.java:620)
		//       at org.springframework.web.client.RestTemplate.postForObject(RestTemplate.java:387)
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.categorySearch(CatalogServiceImpl.java:67)
		assertNotNull(result);
	}

	/**
	 * Run the List<ProductCatalog> categorySearch(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:12 PM
	 */
	@Test
	public void testCategorySearch_2()
		throws Exception {
		CatalogServiceImpl fixture = new CatalogServiceImpl();
		fixture.cat = new CatalogServiceImpl();
		fixture.restTemplate = new RestTemplate();
		String categoryName = "";

		List<ProductCatalog> result = fixture.categorySearch(categoryName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.web.client.ResourceAccessException: I/O error on POST request for "http://10.77.116.23:9090/catagory": Connection refused: connect; nested exception is java.net.ConnectException: Connection refused: connect
		//       at org.springframework.web.client.RestTemplate.doExecute(RestTemplate.java:673)
		//       at org.springframework.web.client.RestTemplate.execute(RestTemplate.java:620)
		//       at org.springframework.web.client.RestTemplate.postForObject(RestTemplate.java:387)
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.categorySearch(CatalogServiceImpl.java:67)
		assertNotNull(result);
	}

	/**
	 * Run the List<ProductCatalog> categorySearch(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:12 PM
	 */
	@Test
	public void testCategorySearch_3()
		throws Exception {
		CatalogServiceImpl fixture = new CatalogServiceImpl();
		fixture.cat = new CatalogServiceImpl();
		fixture.restTemplate = new RestTemplate();
		String categoryName = "";

		List<ProductCatalog> result = fixture.categorySearch(categoryName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.web.client.ResourceAccessException: I/O error on POST request for "http://10.77.116.23:9090/catagory": Connection refused: connect; nested exception is java.net.ConnectException: Connection refused: connect
		//       at org.springframework.web.client.RestTemplate.doExecute(RestTemplate.java:673)
		//       at org.springframework.web.client.RestTemplate.execute(RestTemplate.java:620)
		//       at org.springframework.web.client.RestTemplate.postForObject(RestTemplate.java:387)
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.categorySearch(CatalogServiceImpl.java:67)
		assertNotNull(result);
	}

	/**
	 * Run the List<ProductCatalog> categorySearch(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:12 PM
	 */
	@Test
	public void testCategorySearch_4()
		throws Exception {
		CatalogServiceImpl fixture = new CatalogServiceImpl();
		fixture.cat = new CatalogServiceImpl();
		fixture.restTemplate = new RestTemplate();
		String categoryName = "";

		List<ProductCatalog> result = fixture.categorySearch(categoryName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.web.client.ResourceAccessException: I/O error on POST request for "http://10.77.116.23:9090/catagory": Connection refused: connect; nested exception is java.net.ConnectException: Connection refused: connect
		//       at org.springframework.web.client.RestTemplate.doExecute(RestTemplate.java:673)
		//       at org.springframework.web.client.RestTemplate.execute(RestTemplate.java:620)
		//       at org.springframework.web.client.RestTemplate.postForObject(RestTemplate.java:387)
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.categorySearch(CatalogServiceImpl.java:67)
		assertNotNull(result);
	}

	/**
	 * Run the List<ProductCatalog> getProduct() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:12 PM
	 */
	@Test
	public void testGetProduct_1()
		throws Exception {
		CatalogServiceImpl fixture = new CatalogServiceImpl();
		fixture.cat = new CatalogServiceImpl();
		fixture.restTemplate = new RestTemplate();

		List<ProductCatalog> result = fixture.getProduct();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.web.client.ResourceAccessException: I/O error on GET request for "http://10.77.116.23:9090/getAllProds": Connection refused: connect; nested exception is java.net.ConnectException: Connection refused: connect
		//       at org.springframework.web.client.RestTemplate.doExecute(RestTemplate.java:673)
		//       at org.springframework.web.client.RestTemplate.execute(RestTemplate.java:620)
		//       at org.springframework.web.client.RestTemplate.getForObject(RestTemplate.java:294)
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.getProduct(CatalogServiceImpl.java:25)
		assertNotNull(result);
	}

	/**
	 * Run the List<ProductCatalog> getProduct() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:12 PM
	 */
	@Test
	public void testGetProduct_2()
		throws Exception {
		CatalogServiceImpl fixture = new CatalogServiceImpl();
		fixture.cat = new CatalogServiceImpl();
		fixture.restTemplate = new RestTemplate();

		List<ProductCatalog> result = fixture.getProduct();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.web.client.ResourceAccessException: I/O error on GET request for "http://10.77.116.23:9090/getAllProds": Connection refused: connect; nested exception is java.net.ConnectException: Connection refused: connect
		//       at org.springframework.web.client.RestTemplate.doExecute(RestTemplate.java:673)
		//       at org.springframework.web.client.RestTemplate.execute(RestTemplate.java:620)
		//       at org.springframework.web.client.RestTemplate.getForObject(RestTemplate.java:294)
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.getProduct(CatalogServiceImpl.java:25)
		assertNotNull(result);
	}

	/**
	 * Run the List<ProductCatalog> getProduct() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:12 PM
	 */
	@Test
	public void testGetProduct_3()
		throws Exception {
		CatalogServiceImpl fixture = new CatalogServiceImpl();
		fixture.cat = new CatalogServiceImpl();
		fixture.restTemplate = new RestTemplate();

		List<ProductCatalog> result = fixture.getProduct();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.web.client.ResourceAccessException: I/O error on GET request for "http://10.77.116.23:9090/getAllProds": Connection refused: connect; nested exception is java.net.ConnectException: Connection refused: connect
		//       at org.springframework.web.client.RestTemplate.doExecute(RestTemplate.java:673)
		//       at org.springframework.web.client.RestTemplate.execute(RestTemplate.java:620)
		//       at org.springframework.web.client.RestTemplate.getForObject(RestTemplate.java:294)
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.getProduct(CatalogServiceImpl.java:25)
		assertNotNull(result);
	}

	/**
	 * Run the List<ProductCatalog> getProduct() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:12 PM
	 */
	@Test
	public void testGetProduct_4()
		throws Exception {
		CatalogServiceImpl fixture = new CatalogServiceImpl();
		fixture.cat = new CatalogServiceImpl();
		fixture.restTemplate = new RestTemplate();

		List<ProductCatalog> result = fixture.getProduct();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.web.client.ResourceAccessException: I/O error on GET request for "http://10.77.116.23:9090/getAllProds": Connection refused: connect; nested exception is java.net.ConnectException: Connection refused: connect
		//       at org.springframework.web.client.RestTemplate.doExecute(RestTemplate.java:673)
		//       at org.springframework.web.client.RestTemplate.execute(RestTemplate.java:620)
		//       at org.springframework.web.client.RestTemplate.getForObject(RestTemplate.java:294)
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.getProduct(CatalogServiceImpl.java:25)
		assertNotNull(result);
	}

	/**
	 * Run the List<ProductCatalog> searchProduct(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:12 PM
	 */
	@Test
	public void testSearchProduct_1()
		throws Exception {
		CatalogServiceImpl fixture = new CatalogServiceImpl();
		fixture.cat = new CatalogServiceImpl();
		fixture.restTemplate = new RestTemplate();
		String prodName = "samsung";

		List<ProductCatalog> result = fixture.searchProduct(prodName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.web.client.ResourceAccessException: I/O error on POST request for "http://10.77.116.23:9090/getPartialProducts": Connection refused: connect; nested exception is java.net.ConnectException: Connection refused: connect
		//       at org.springframework.web.client.RestTemplate.doExecute(RestTemplate.java:673)
		//       at org.springframework.web.client.RestTemplate.execute(RestTemplate.java:620)
		//       at org.springframework.web.client.RestTemplate.postForObject(RestTemplate.java:387)
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.searchProduct(CatalogServiceImpl.java:43)
		assertNotNull(result);
	}

	/**
	 * Run the List<ProductCatalog> searchProduct(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:12 PM
	 */
	@Test
	public void testSearchProduct_2()
		throws Exception {
		CatalogServiceImpl fixture = new CatalogServiceImpl();
		fixture.cat = new CatalogServiceImpl();
		fixture.restTemplate = new RestTemplate();
		String prodName = "";

		List<ProductCatalog> result = fixture.searchProduct(prodName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.web.client.ResourceAccessException: I/O error on POST request for "http://10.77.116.23:9090/getPartialProducts": Connection refused: connect; nested exception is java.net.ConnectException: Connection refused: connect
		//       at org.springframework.web.client.RestTemplate.doExecute(RestTemplate.java:673)
		//       at org.springframework.web.client.RestTemplate.execute(RestTemplate.java:620)
		//       at org.springframework.web.client.RestTemplate.postForObject(RestTemplate.java:387)
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.searchProduct(CatalogServiceImpl.java:43)
		assertNotNull(result);
	}

	/**
	 * Run the List<ProductCatalog> searchProduct(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:12 PM
	 */
	@Test
	public void testSearchProduct_3()
		throws Exception {
		CatalogServiceImpl fixture = new CatalogServiceImpl();
		fixture.cat = new CatalogServiceImpl();
		fixture.restTemplate = new RestTemplate();
		String prodName = "";

		List<ProductCatalog> result = fixture.searchProduct(prodName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.web.client.ResourceAccessException: I/O error on POST request for "http://10.77.116.23:9090/getPartialProducts": Connection refused: connect; nested exception is java.net.ConnectException: Connection refused: connect
		//       at org.springframework.web.client.RestTemplate.doExecute(RestTemplate.java:673)
		//       at org.springframework.web.client.RestTemplate.execute(RestTemplate.java:620)
		//       at org.springframework.web.client.RestTemplate.postForObject(RestTemplate.java:387)
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.searchProduct(CatalogServiceImpl.java:43)
		assertNotNull(result);
	}

	/**
	 * Run the List<ProductCatalog> searchProduct(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:12 PM
	 */
	@Test
	public void testSearchProduct_4()
		throws Exception {
		CatalogServiceImpl fixture = new CatalogServiceImpl();
		fixture.cat = new CatalogServiceImpl();
		fixture.restTemplate = new RestTemplate();
		String prodName = "";

		List<ProductCatalog> result = fixture.searchProduct(prodName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.web.client.ResourceAccessException: I/O error on POST request for "http://10.77.116.23:9090/getPartialProducts": Connection refused: connect; nested exception is java.net.ConnectException: Connection refused: connect
		//       at org.springframework.web.client.RestTemplate.doExecute(RestTemplate.java:673)
		//       at org.springframework.web.client.RestTemplate.execute(RestTemplate.java:620)
		//       at org.springframework.web.client.RestTemplate.postForObject(RestTemplate.java:387)
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.searchProduct(CatalogServiceImpl.java:43)
		assertNotNull(result);
	}

	/**
	 * Run the String updateCatalog(ProductCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 11:12 PM
	 */
	@Test
	public void testUpdateCatalog_1()
		throws Exception {
		CatalogServiceImpl fixture = new CatalogServiceImpl();
		fixture.cat = new CatalogServiceImpl();
		fixture.restTemplate = new RestTemplate();
		ProductCatalog product = new ProductCatalog();

		String result = fixture.updateCatalog(product);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 1/30/18 11:12 PM
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
	 * @generatedBy CodePro at 1/30/18 11:12 PM
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
	 * @generatedBy CodePro at 1/30/18 11:12 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CatalogServiceImplTest.class);
	}
}
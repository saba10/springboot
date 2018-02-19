package com.cg.catalog.app.bean;

import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

/**
 * The class <code>ProductCatalogTest</code> contains tests for the class <code>{@link ProductCatalog}</code>.
 *
 * @generatedBy CodePro at 2/2/18 5:39 PM
 * @author preekm
 * @version $Revision: 1.0 $
 */
public class ProductCatalogTest {
	@InjectMocks
	ProductCatalog productCatalog;
	/**
	 * Run the String getCatagoryName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testGetCatagoryName_1()
		throws Exception {
		ProductCatalog fixture = new ProductCatalog();
		fixture.setCatagoryName("clothing");
		fixture.setImageUrl("xyz");
		fixture.setProductIdChild("pd11_a");
		fixture.setProductName("shirt");
		fixture.setProductIdParent("pd11");
		fixture.setPrice("300");

		String result = fixture.getCatagoryName();

		// add additional test code here
		assertEquals("clothing", result);
	}

	/**
	 * Run the String getImageUrl() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testGetImageUrl_1()
		throws Exception {
		ProductCatalog fixture = new ProductCatalog();
		fixture.setCatagoryName("clothing");
		fixture.setImageUrl("xyz");
		fixture.setProductIdChild("pd11_a");
		fixture.setProductName("shirt");
		fixture.setProductIdParent("pd11");
		fixture.setPrice("300");

		String result = fixture.getImageUrl();

		// add additional test code here
		assertEquals("xyz", result);
	}

	/**
	 * Run the String getPrice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testGetPrice_1()
		throws Exception {
		ProductCatalog fixture = new ProductCatalog();
		fixture.setCatagoryName("clothing");
		fixture.setImageUrl("xyz");
		fixture.setProductIdChild("pd11_a");
		fixture.setProductName("shirt");
		fixture.setProductIdParent("pd11");
		fixture.setPrice("300");

		String result = fixture.getPrice();

		// add additional test code here
		assertEquals("300", result);
	}

	/**
	 * Run the String getProductIdChild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testGetProductIdChild_1()
		throws Exception {
		ProductCatalog fixture = new ProductCatalog();
		fixture.setCatagoryName("clothing");
		fixture.setImageUrl("xyz");
		fixture.setProductIdChild("pd11_a");
		fixture.setProductName("shirt");
		fixture.setProductIdParent("pd11");
		fixture.setPrice("300");

		String result = fixture.getProductIdChild();

		// add additional test code here
		assertEquals("pd11_a", result);
	}

	/**
	 * Run the String getProductIdParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testGetProductIdParent_1()
		throws Exception {
		ProductCatalog fixture = new ProductCatalog();
		fixture.setCatagoryName("clothing");
		fixture.setImageUrl("xyz");
		fixture.setProductIdChild("pd11_a");
		fixture.setProductName("shirt");
		fixture.setProductIdParent("pd11");
		fixture.setPrice("300");

		String result = fixture.getProductIdParent();

		// add additional test code here
		assertEquals("pd11", result);
	}

	/**
	 * Run the String getProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testGetProductName_1()
		throws Exception {
		ProductCatalog fixture = new ProductCatalog();
		fixture.setCatagoryName("clothing");
		fixture.setImageUrl("xyz");
		fixture.setProductIdChild("pd11_a");
		fixture.setProductName("shirt");
		fixture.setProductIdParent("pd11");
		fixture.setPrice("300");

		String result = fixture.getProductName();

		// add additional test code here
		assertEquals("shirt", result);
	}

	/**
	 * Run the void setCatagoryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testSetCatagoryName_1()
		throws Exception {
		ProductCatalog fixture = new ProductCatalog();
		fixture.setCatagoryName("clothing");
		fixture.setImageUrl("xyz");
		fixture.setProductIdChild("pd11_a");
		fixture.setProductName("shirt");
		fixture.setProductIdParent("pd11");
		fixture.setPrice("300");
		String catagoryName = "clothing";

		fixture.setCatagoryName(catagoryName);

		// add additional test code here
	}

	/**
	 * Run the void setImageUrl(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testSetImageUrl_1()
		throws Exception {
		ProductCatalog fixture = new ProductCatalog();
		fixture.setCatagoryName("clothing");
		fixture.setImageUrl("xyz");
		fixture.setProductIdChild("pd11_a");
		fixture.setProductName("shirt");
		fixture.setProductIdParent("pd11");
		fixture.setPrice("300");
		String imageUrl = "xyz";

		fixture.setImageUrl(imageUrl);

		// add additional test code here
	}

	/**
	 * Run the void setPrice(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testSetPrice_1()
		throws Exception {
		ProductCatalog fixture = new ProductCatalog();
		fixture.setCatagoryName("clothing");
		fixture.setImageUrl("xyz");
		fixture.setProductIdChild("pd11_a");
		fixture.setProductName("shirt");
		fixture.setProductIdParent("pd11");
		fixture.setPrice("300");
		String price = "300";

		fixture.setPrice(price);

		// add additional test code here
	}

	/**
	 * Run the void setProductIdChild(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testSetProductIdChild_1()
		throws Exception {
		ProductCatalog fixture = new ProductCatalog();
		fixture.setCatagoryName("clothing");
		fixture.setImageUrl("xyz");
		fixture.setProductIdChild("pd11_a");
		fixture.setProductName("shirt");
		fixture.setProductIdParent("pd11");
		fixture.setPrice("300");
		String productIdChild = "pd11_a";

		fixture.setProductIdChild(productIdChild);

		// add additional test code here
	}

	/**
	 * Run the void setProductIdParent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testSetProductIdParent_1()
		throws Exception {
		ProductCatalog fixture = new ProductCatalog();
		fixture.setCatagoryName("clothing");
		fixture.setImageUrl("xyz");
		fixture.setProductIdChild("pd11_a");
		fixture.setProductName("shirt");
		fixture.setProductIdParent("pd11");
		fixture.setPrice("300");
		String productIdParent = "pd11";

		fixture.setProductIdParent(productIdParent);

		// add additional test code here
	}

	/**
	 * Run the void setProductName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testSetProductName_1()
		throws Exception {
		ProductCatalog fixture = new ProductCatalog();
		fixture.setCatagoryName("clothing");
		fixture.setImageUrl("xyz");
		fixture.setProductIdChild("pd11_a");
		fixture.setProductName("shirt");
		fixture.setProductIdParent("pd11");
		fixture.setPrice("300");
		String productName = "shirt";

		fixture.setProductName(productName);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		ProductCatalog fixture = new ProductCatalog();
		fixture.setCatagoryName("clothing");
		fixture.setImageUrl("xyz");
		fixture.setProductIdChild("pd11_a");
		fixture.setProductName("shirt");
		fixture.setProductIdParent("pd11");
		fixture.setPrice("300");

		String result = fixture.toString();

		// add additional test code here
		assertEquals("{\"product_id_parent\":\"pd11\", \"product_id_child\":\"pd11_a\", \"catagory_name\":\"clothing\", \"product_name\":\"shirt\", \"image_url\":\"xyz\", \"price\":\"300\"}", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		MockitoAnnotations.initMocks(this);	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@After
	public void tearDown()
		throws Exception {
			}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ProductCatalogTest.class);
	}
}
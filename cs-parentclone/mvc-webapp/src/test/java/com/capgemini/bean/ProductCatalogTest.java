package com.capgemini.bean;

import org.junit.*;
import static org.junit.Assert.*;

public class ProductCatalogTest {

	private ProductCatalog product;
	
	@Before
	public void setUp() throws Exception {
		product=new ProductCatalog();
		product.setProductName("Iphone 8S");
		product.setCatagoryName("mobile");
		product.setImageUrl("qwerty");
		product.setProductIdParent("mob");
		product.setPrice("80000");
		product.setProductIdChild("mob111");
	}

	@Test
	public void testGetCatagoryName_1() throws Exception {
		String result = product.getCatagoryName();
		assertEquals("mobile", result);
		assertNotNull(product);
		assertTrue(product.getImageUrl().equals("qwerty"));
	}

	@Test
	public void testGetImageUrl_1() throws Exception {
		String result = product.getImageUrl();
		assertEquals("qwerty", result);
		assertFalse(product.getProductIdParent().equals("mob1"));
	}

	@Test
	public void testGetPrice_1() throws Exception {
		String result = product.getPrice();
		assertEquals("80000", result);
		assertEquals("mobile", product.getCatagoryName());
	}

	@Test
	public void testGetProductIdChild_1() throws Exception {
		String result = product.getProductIdChild();
		assertEquals("mob111", result);
		assertNotNull(product.getProductName());
	}

	@Test
	public void testGetProductIdParent_1() throws Exception {
		String result = product.getProductIdParent();
		assertEquals("mob", result);
		assertTrue(product.getImageUrl().equals("qwerty"));
	}

	@Test
	public void testGetProductName_1() throws Exception {
		String result = product.getProductName();
		assertEquals("Iphone 8S", result);
		assertEquals("mobile", product.getCatagoryName());
	}

	@Test
	public void testSetCatagoryName_1() throws Exception {
		String catagoryName = "mobile";
		product.setCatagoryName(catagoryName);
		assertEquals("mobile", product.getCatagoryName());
	}

	@Test
	public void testSetImageUrl_1() throws Exception {
		String imageUrl = "asdfgh";
		product.setImageUrl(imageUrl);
		assertTrue(product.getImageUrl().equals("asdfgh"));
	}

	@Test
	public void testSetPrice_1() throws Exception {
		String price = "100000";
		product.setPrice(price);
		assertNotNull(product.getPrice());
	}

	@Test
	public void testSetProductIdChild_1() throws Exception {
		String productIdChild = "mob7878";
		product.setProductIdChild(productIdChild);
		assertFalse(product.getProductIdChild().equals("mob"));
	}

	@Test
	public void testSetProductIdParent_1() throws Exception {
		String productIdParent = "mob1";
		product.setProductIdParent(productIdParent);
		assertEquals("mob1", product.getProductIdParent());
	}

	@Test
	public void testSetProductName_1() throws Exception {
		String productName = "Iphone 8";
		product.setProductName(productName);
		assertNotEquals("Iphone", product.getProductName());
	}

	@After
	public void tearDown() throws Exception {
		product=null;
		System.gc();
	}

}
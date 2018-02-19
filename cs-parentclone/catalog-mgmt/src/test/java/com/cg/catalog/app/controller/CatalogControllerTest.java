package com.cg.catalog.app.controller;

import java.util.ArrayList;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import com.cg.catalog.app.bean.GiftCardCatalog;
import com.cg.catalog.app.bean.ProductCatalog;
import com.cg.catalog.app.repository.MongoRepo;
import com.cg.catalog.app.repository.MongoRepoGifts;

/**
 * The class <code>CatalogControllerTest</code> contains tests for the class <code>{@link CatalogController}</code>.
 *
 * @generatedBy CodePro at 2/2/18 5:39 PM
 * @author preekm
 * @version $Revision: 1.0 $
 */
public class CatalogControllerTest {
	@Mock
	MongoRepo mongoRepo;
	@Mock
	MongoRepoGifts mongoRepoGifts;
	@InjectMocks
	CatalogController catalogController;
	/**
	 * Run the void addAllGifts(List<GiftCardCatalog>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testAddAllGifts_1()
		throws Exception {
		CatalogController fixture = new CatalogController();
		fixture.mongoRepoGifts = EasyMock.createNiceMock(MongoRepoGifts.class);
		fixture.mongoRepo = EasyMock.createNiceMock(MongoRepo.class);
		GiftCardCatalog pc = new GiftCardCatalog();

		fixture.addGift(pc);

		// add additional test code here
	}

	/**
	 * Run the void addAllGifts(List<GiftCardCatalog>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testAddAllGifts_2()
		throws Exception {
		
		/*List<GiftCardCatalog> list = new ArrayList<>();
		GiftCardCatalog cardCatalog = new GiftCardCatalog();
		cardCatalog.setGiftCardId("gc123");
		cardCatalog.setGiftCardValue("500");
		list.add(cardCatalog);
		Mockito.when(mongoRepoGifts.exists(Mockito.isA(String.class))).thenReturn(true);
		Mockito.when(mongoRepoGifts.findOne(Mockito.isA(String.class))).thenReturn(cardCatalog);
		Mockito.when(mongoRepoGifts.save(Mockito.isA(GiftCardCatalog.class))).thenReturn(new GiftCardCatalog());
		GiftCardCatalog productCatalog=catalogController.addAllGifts(cardCatalog);*/
		
		CatalogController fixture = new CatalogController();
		fixture.mongoRepoGifts = EasyMock.createNiceMock(MongoRepoGifts.class);
		fixture.mongoRepo = EasyMock.createNiceMock(MongoRepo.class);
		GiftCardCatalog pc = new GiftCardCatalog();

		fixture.addGift(pc);

		// add additional test code here
	}

	/**
	 * Run the void addAllProduct(List<ProductCatalog>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	  */
	@Test
	public void testAddAllProduct_1()
		throws Exception {
		CatalogController fixture = new CatalogController();
		fixture.mongoRepoGifts = EasyMock.createNiceMock(MongoRepoGifts.class);
		fixture.mongoRepo = EasyMock.createNiceMock(MongoRepo.class);
		List<ProductCatalog> pc = new ArrayList<ProductCatalog>();

		fixture.addAllProduct(pc);

		// add additional test code here
	}

	/**
	 * Run the void addAllProduct(List<ProductCatalog>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testAddAllProduct_2()
		throws Exception {
		CatalogController fixture = new CatalogController();
		fixture.mongoRepoGifts = EasyMock.createNiceMock(MongoRepoGifts.class);
		fixture.mongoRepo = EasyMock.createNiceMock(MongoRepo.class);
		List<ProductCatalog> pc = new ArrayList<ProductCatalog>();

		fixture.addAllProduct(pc);

		// add additional test code here
	}

	/**
	 * Run the ProductCatalog addProduct(ProductCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testAddProduct_1()
		throws Exception {
		
		List<ProductCatalog> list = new ArrayList<>();
		ProductCatalog catalog = new ProductCatalog();
		catalog.setProductIdParent("pd12");
		catalog.setProductIdChild("pd12A");
		catalog.setPrice("200");
		catalog.setCatagoryName("clothing");
		catalog.setProductName("shirt");
		catalog.setImageUrl("pqr");
		list.add(catalog);
		
		Mockito.when(mongoRepo.exists(Mockito.isA(String.class))).thenReturn(true);
		Mockito.when(mongoRepo.findOne(Mockito.isA(String.class))).thenReturn(catalog);
		Mockito.when(mongoRepo.save(Mockito.isA(ProductCatalog.class))).thenReturn(new ProductCatalog());
		ProductCatalog productCatalog=catalogController.addProduct(catalog);
		assertNotNull(productCatalog);
		/*CatalogController fixture = new CatalogController();
		fixture.mongoRepoGifts = EasyMock.createNiceMock(MongoRepoGifts.class);
		fixture.mongoRepo = EasyMock.createNiceMock(MongoRepo.class);
		ProductCatalog pc = new ProductCatalog();

		ProductCatalog result = fixture.addProduct(pc);

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"product_id_parent\":\"null\", \"product_id_child\":\"null\", \"catagory_name\":\"null\", \"product_name\":\"null\", \"image_url\":\"null\", \"price\":\"null\"}", result.toString());
		assertEquals(null, result.getCatagoryName());
		assertEquals(null, result.getImageUrl());
		assertEquals(null, result.getProductName());
		assertEquals(null, result.getProductIdChild());
		assertEquals(null, result.getPrice());
		assertEquals(null, result.getProductIdParent());*/
	}

	/**
	 * Run the String delete(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testDelete_1()
		throws Exception {
		Mockito.when(mongoRepo.exists(Mockito.isA(String.class))).thenReturn(true);
		Mockito.when(mongoRepo.findOne(Mockito.isA(String.class))).thenReturn(new ProductCatalog());
		Mockito.when(mongoRepo.save(Mockito.isA(ProductCatalog.class))).thenReturn(new ProductCatalog());
		String st=catalogController.delete("xyz");
		assertNotNull(st);
		/*CatalogController fixture = new CatalogController();
		fixture.mongoRepoGifts = EasyMock.createNiceMock(MongoRepoGifts.class);
		fixture.mongoRepo = EasyMock.createNiceMock(MongoRepo.class);
		String id = "";

		String result = fixture.delete(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.cg.catalog.app.controller.CatalogController.delete(CatalogController.java:69)
		assertNotNull(result);*/
	}

	/**
	 * Run the String delete(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testDelete_2()
		throws Exception {
		Mockito.when(mongoRepo.exists(Mockito.isA(String.class))).thenReturn(true);
		Mockito.when(mongoRepo.findOne(Mockito.isA(String.class))).thenReturn(new ProductCatalog());
		Mockito.when(mongoRepo.save(Mockito.isA(ProductCatalog.class))).thenReturn(new ProductCatalog());
		String st=catalogController.delete("xyz");
		assertNotNull(st);
		/*CatalogController fixture = new CatalogController();
		fixture.mongoRepoGifts = EasyMock.createNiceMock(MongoRepoGifts.class);
		fixture.mongoRepo = EasyMock.createNiceMock(MongoRepo.class);
		String id = "";

		String result = fixture.delete(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.cg.catalog.app.controller.CatalogController.delete(CatalogController.java:69)
		assertNotNull(result);*/
	}

	/**
	 * Run the Long deleteRecord(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testDeleteRecord_1()
		throws Exception {
		Mockito.when(mongoRepo.exists(Mockito.isA(String.class))).thenReturn(true);
		Mockito.when(mongoRepo.findOne(Mockito.isA(String.class))).thenReturn(new ProductCatalog());
		Mockito.when(mongoRepo.save(Mockito.isA(ProductCatalog.class))).thenReturn(new ProductCatalog());
		long st=catalogController.deleteRecord("xyz");
		assertNotNull(st);
		/*CatalogController fixture = new CatalogController();
		fixture.mongoRepoGifts = EasyMock.createNiceMock(MongoRepoGifts.class);
		fixture.mongoRepo = EasyMock.createNiceMock(MongoRepo.class);
		String id = "";

		Long result = fixture.deleteRecord(id);

		// add additional test code here
		assertEquals(null, result);*/
	}

	/**
	 * Run the List<ProductCatalog> getAll() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testGetAll_1()
		throws Exception {
		CatalogController fixture = new CatalogController();
		fixture.mongoRepoGifts = EasyMock.createNiceMock(MongoRepoGifts.class);
		fixture.mongoRepo = EasyMock.createNiceMock(MongoRepo.class);

		List<ProductCatalog> result = fixture.getAll();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<GiftCardCatalog> getAllGifts() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testGetAllGifts_1()
		throws Exception {
		CatalogController fixture = new CatalogController();
		fixture.mongoRepoGifts = EasyMock.createNiceMock(MongoRepoGifts.class);
		fixture.mongoRepo = EasyMock.createNiceMock(MongoRepo.class);

		List<GiftCardCatalog> result = fixture.getAllGifts();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<ProductCatalog> getProdByCat(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testGetProdByCat_1()
		throws Exception {
		CatalogController fixture = new CatalogController();
		fixture.mongoRepoGifts = EasyMock.createNiceMock(MongoRepoGifts.class);
		fixture.mongoRepo = EasyMock.createNiceMock(MongoRepo.class);
		String categoryName = "";

		List<ProductCatalog> result = fixture.getProdByCat(categoryName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<ProductCatalog> getProdByName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testGetProdByName_1()
		throws Exception {
		CatalogController fixture = new CatalogController();
		fixture.mongoRepoGifts = EasyMock.createNiceMock(MongoRepoGifts.class);
		fixture.mongoRepo = EasyMock.createNiceMock(MongoRepo.class);
		String prodName = "";

		List<ProductCatalog> result = fixture.getProdByName(prodName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<ProductCatalog> getProdByPartialName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	@Test
	public void testGetProdByPartialName_1()
		throws Exception {
		CatalogController fixture = new CatalogController();
		fixture.mongoRepoGifts = EasyMock.createNiceMock(MongoRepoGifts.class);
		fixture.mongoRepo = EasyMock.createNiceMock(MongoRepo.class);
		String prodName = "";

		List<ProductCatalog> result = fixture.getProdByPartialName(prodName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String updateProduct(ProductCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	/*@Test
	public void testUpdateProduct_1()
		throws Exception {
		CatalogController fixture = new CatalogController();
		fixture.mongoRepoGifts = EasyMock.createNiceMock(MongoRepoGifts.class);
		fixture.mongoRepo = EasyMock.createNiceMock(MongoRepo.class);
		ProductCatalog pc = new ProductCatalog();
		pc.setProductIdChild("");

		String result = fixture.updateProduct(pc);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call deleteById("")
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at com.sun.proxy.$Proxy1641.save(Unknown Source)
		//       at com.cg.catalog.app.controller.CatalogController.updateProduct(CatalogController.java:62)
		assertNotNull(result);
	}*/

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
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 2/1/18 7:54 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CatalogControllerTest.class);
	}
}

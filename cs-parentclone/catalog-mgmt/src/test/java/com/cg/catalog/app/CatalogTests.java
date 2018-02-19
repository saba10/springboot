package com.cg.catalog.app;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.core.io.Resource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.catalog.app.CatalogApplication;
import com.cg.catalog.app.bean.GiftCardCatalog;
import com.cg.catalog.app.bean.ProductCatalog;
import com.cg.catalog.app.controller.CatalogController;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = { CatalogApplication.class })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@ActiveProfiles("test")
public class CatalogTests {
	
	private static boolean setUpIsDone = false;

	@Value("classpath:giftCard.json")
	private Resource giftCard;

	@Value("classpath:productAdd.json")
	private Resource productAdd;
	
	@Value("classpath:productByName.json")
	private Resource productByName;
	
	@Value("classpath:productByCat.json")
	private Resource productByCat;
		
	@Value("classpath:partialProducts.json")
	private Resource partialProducts;
	
	@Value("classpath:productDelete.json")
	private Resource productDelete;

	@Autowired
	private CatalogController catalogController;

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Before
	public void setup() {
		if(setUpIsDone) {
			return;
		}else {
			mongoTemplate.insert(productData(), "Catalog_Products");
			mongoTemplate.insert(giftData(), "Catalog_Gift_Card");
			setUpIsDone = true;
		}
	}

	private List<ProductCatalog> productData() {
		List<ProductCatalog> list = new ArrayList<>();
		ProductCatalog catalog = new ProductCatalog();
		catalog.setProductIdParent("pd12");
		catalog.setProductIdChild("pd12A");
		catalog.setPrice("200");
		catalog.setCatagoryName("clothing");
		catalog.setProductName("shirt");
		catalog.setImageUrl("pqr");
		list.add(catalog);
		return list;
	}

	private List<GiftCardCatalog> giftData() {
		List<GiftCardCatalog> list = new ArrayList<>();
		GiftCardCatalog cardCatalog = new GiftCardCatalog();
		cardCatalog.setGiftCardId("gc123");
		cardCatalog.setGiftCardValue("500");
		list.add(cardCatalog);
		return list;
	}

	@Test
	public void addTest() throws JSONException {
		ProductCatalog catalog = new ProductCatalog();
		catalog.setProductIdParent("pd13");
		catalog.setProductIdChild("pd13A");
		catalog.setPrice("800");
		catalog.setCatagoryName("electronics");
		catalog.setImageUrl("xyz");
		catalog.setProductName("mobile");
		catalogController.addProduct(catalog);
		List<ProductCatalog> list = catalogController.getAll();
		try {
			String a = new String(Files.readAllBytes(productAdd.getFile().toPath()));
			JSONAssert.assertEquals(new JSONArray(a), new JSONArray(list.toString()), true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void giftCardTest() throws JSONException {
		List<GiftCardCatalog> list = catalogController.getAllGifts();
		try {
			String a = new String(Files.readAllBytes(giftCard.getFile().toPath()));
			JSONAssert.assertEquals(new JSONArray(a), new JSONArray(list.toString()), true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Test
	public void getProdByNameTest() throws JSONException {
		
		try {
			
			List<ProductCatalog> list = catalogController.getProdByName("mobile");
			String	a = new String(Files.readAllBytes(productByName.getFile().toPath()));
			JSONAssert.assertEquals(new JSONArray(a), new JSONArray(list.toString()), true);
			 
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getProdByCatTest() throws JSONException {
		
		try {
			List<ProductCatalog> list = catalogController.getProdByCat("electronics");
			String	a = new String(Files.readAllBytes(productByCat.getFile().toPath()));
			JSONAssert.assertEquals(new JSONArray(a), new JSONArray(list.toString()), true);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getPartialProductsTest() throws JSONException {
		
		try {
			List<ProductCatalog> list = catalogController.getProdByPartialName("m");
			String	a = new String(Files.readAllBytes(partialProducts.getFile().toPath()));
			JSONAssert.assertEquals(new JSONArray(a), new JSONArray(list.toString()), true);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

	@Test
	public void deleteTest() {
		List<ProductCatalog> list = catalogController.getAll();
		try {
			String st = list.get(0).getProductIdChild();
			catalogController.delete(st);
			list = catalogController.getAll();
			String a = new String(Files.readAllBytes(productDelete.getFile().toPath()));
			JSONAssert.assertEquals(new JSONArray(a), new JSONArray(list.toString()), true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

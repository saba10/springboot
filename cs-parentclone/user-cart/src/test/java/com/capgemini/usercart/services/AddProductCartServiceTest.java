package com.capgemini.usercart.services;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.capgemini.usercart.model.ProductCartModel;
import com.capgemini.usercart.model.UserCartModel;
import com.capgemini.usercart.repository.MongoRepositoryDataBaseOperations;

public class AddProductCartServiceTest {

	@InjectMocks
	AddProductCartService addProductCartService;

	@Mock
	MongoRepositoryDataBaseOperations mongoRepositoryDataBaseOperations;

	
	@Test
	public void testAddProductCartService_2()
		throws Exception {
		AddProductCartService result = new AddProductCartService();
		assertNotNull(result);
		// add additional test code here
	}



	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testAddProductCartService_1() throws Exception {
		UserCartModel cartModel = new UserCartModel();
		cartModel.setUserId("abcd");
		ArrayList<ProductCartModel> modelList = new ArrayList<>();
		ProductCartModel model = new ProductCartModel();
		model.setProductId("proId");
		model.setQuantity("100");
		modelList.add(model);
		cartModel.setCartItemList(modelList);

		Mockito.when(mongoRepositoryDataBaseOperations.exists(Mockito.isA(String.class))).thenReturn(false);
		Mockito.when(mongoRepositoryDataBaseOperations.findOne(Mockito.isA(String.class))).thenReturn(cartModel);
		Mockito.when(mongoRepositoryDataBaseOperations.save(Mockito.isA(UserCartModel.class)))
				.thenReturn(new UserCartModel());
		UserCartModel result = addProductCartService.addProduct("abcd", "proId", "100");
		assertNotNull(result);
	}

	@Test
	public void testAddProduct_1() throws Exception {

		UserCartModel cartModel = new UserCartModel();
		cartModel.setUserId("abcd");
		ArrayList<ProductCartModel> modelList = new ArrayList<>();
		ProductCartModel model = new ProductCartModel();
		model.setProductId("proId");
		model.setQuantity("100");
		modelList.add(model);
		cartModel.setCartItemList(modelList);

		Mockito.when(mongoRepositoryDataBaseOperations.exists(Mockito.isA(String.class))).thenReturn(true);
		Mockito.when(mongoRepositoryDataBaseOperations.findOne(Mockito.isA(String.class))).thenReturn(cartModel);
		Mockito.when(mongoRepositoryDataBaseOperations.save(Mockito.isA(UserCartModel.class)))
				.thenReturn(new UserCartModel());
		UserCartModel result = addProductCartService.addProduct("abcd", "proId", "100");
		assertNotNull(result);
	}
	
	@Test
	public void testAddProduct_1_1() throws Exception {

		UserCartModel cartModel = new UserCartModel();
		cartModel.setUserId("abcd");
		ArrayList<ProductCartModel> modelList = new ArrayList<>();
		/*ProductCartModel model = new ProductCartModel();
		model.setProductId("proId");
		model.setQuantity("100");
		modelList.add(model);*/
		cartModel.setCartItemList(modelList);

		Mockito.when(mongoRepositoryDataBaseOperations.exists(Mockito.isA(String.class))).thenReturn(true);
		Mockito.when(mongoRepositoryDataBaseOperations.findOne(Mockito.isA(String.class))).thenReturn(cartModel);
		Mockito.when(mongoRepositoryDataBaseOperations.save(Mockito.isA(UserCartModel.class)))
				.thenReturn(new UserCartModel());
		UserCartModel result = addProductCartService.addProduct("abcd", "proId", "100");
		assertNotNull(result);
	}

	@Test(expected = RuntimeException.class)
	public void testAddProduct_Ex() throws Exception {

		UserCartModel cartModel = new UserCartModel();
		cartModel.setUserId("abcd");
		ArrayList<ProductCartModel> modelList = new ArrayList<>();
		ProductCartModel model = new ProductCartModel();
		model.setProductId("proId");
		model.setQuantity("100");
		modelList.add(model);
		cartModel.setCartItemList(modelList);

		Mockito.when(mongoRepositoryDataBaseOperations.exists(Mockito.isA(String.class)))
				.thenThrow(RuntimeException.class);
		Mockito.when(mongoRepositoryDataBaseOperations.findOne(Mockito.isA(String.class))).thenReturn(cartModel);
		Mockito.when(mongoRepositoryDataBaseOperations.save(Mockito.isA(UserCartModel.class)))
				.thenReturn(new UserCartModel());
		UserCartModel result = addProductCartService.addProduct("abcd", "proId", "100");
		assertNotNull(result);
	}


	
}
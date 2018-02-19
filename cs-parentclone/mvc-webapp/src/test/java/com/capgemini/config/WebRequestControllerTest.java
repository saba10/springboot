
package com.capgemini.config;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.client.RestTemplate;

import com.capgemini.bean.AdminLogin;
import com.capgemini.bean.ClickStream;
import com.capgemini.bean.GiftCard;
import com.capgemini.bean.OrderEntity;
import com.capgemini.bean.ProductCatalog;
import com.capgemini.bean.ShippingBean;
import com.capgemini.bean.UserBean;
import com.capgemini.login.social.providers.LinkedInProvider;
import com.capgemini.service.AdminService;
import com.capgemini.serviceimpl.CartServiceimpl;
import com.capgemini.serviceimpl.CatalogServiceImpl;
import com.capgemini.serviceimpl.UserCartModel;
import com.cg.userprofile.User;

/**
 * The class <code>WebRequestControllerTest</code> contains tests for the class <code>{@link WebRequestController}</code>.
 *
 * @author vamshkri
 * @version $Revision: 1.0 $
 */
public class WebRequestControllerTest {
	
	@InjectMocks
	WebRequestController webRequestController;

	@Mock
	LinkedInProvider linkedInProvider;

	@Mock
	AdminService adminService;

	@Mock
	ShippingBean shippingBean;
	
	@Mock
	CatalogServiceImpl catalogService;
	
	@Mock
	CartServiceimpl cartServiceimpl;

	@Mock
	ModelMap map;
	
	@Mock
	RestTemplate restTemplate;
	
	@Mock
	Model model; 
	
	@Mock
	UserBean userbean;
	
	
	
	@Mock
	AdminLogin admin1;
	
	private MockMvc mockMvc;
	 
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	public void testWebRequestController_1()
		throws Exception {
		WebRequestController result = new WebRequestController();
		assertNotNull(result);
	}

	@Test
	public void testAdminHome() throws Exception {
		ProductCatalog productCatalog =new ProductCatalog();
		List<ProductCatalog> list=new ArrayList<ProductCatalog>();
		list.add(productCatalog);
		Mockito.when(catalogService.getProduct()).thenReturn(list);
		webRequestController.adminHome(map);

	}
	
	
	@Test
	public void testUpdateOrder_1()
			throws Exception {
		OrderEntity ord=new OrderEntity();
		Mockito.when(adminService.updateOrder(Mockito.isA(OrderEntity.class))).thenReturn("sample");
		webRequestController.updateOrder("1", "1", "1", "1", "1", "1", map);
	}
	
	@Test
	public void testAdminLogin_1()
			throws Exception {
		admin1.setUsername("capgemini");
		List<ProductCatalog> list=new ArrayList<ProductCatalog>();
		Mockito.when(catalogService.getProduct()).thenReturn(list);
		webRequestController.adminLogin(admin1, map);
	}
	
	
	@Test
	public void testUpdateProduct1_1()
			throws Exception {
		List<ProductCatalog> list=new ArrayList<ProductCatalog>();
		ProductCatalog pc=new ProductCatalog();
		list.add(pc);
		pc.setProductIdChild("sample");
		Mockito.when(catalogService.getProduct()).thenReturn(list);
		webRequestController.updateProduct1("sample", map);
	}
	
	/*@Test
	public void testSar() throws Exception {
		webRequestController.sar(map);
	}

	@Test
	public void testSarResponse() throws Exception {
		Mockito.when(adminService.sar(Mockito.isA(String.class))).thenReturn(new ClickStream());
		webRequestController.sarResponse("", map);
	}*/

	@Test
	public void testSearchAfterLogin() throws Exception {
		User bean=new User(); 
		bean.setFirstName("XYZ");
		List<ProductCatalog> list=new ArrayList<ProductCatalog>();
		list.add(new ProductCatalog());
		Mockito.when(linkedInProvider.populateUserDetailsFromLinkedIn()).thenReturn(bean);
		Mockito.when(catalogService.searchProduct(Mockito.isA(String.class))).thenReturn(list);
		webRequestController.searchAfterLogin("", map);
	}

	@Test
	public void testSearchBeforeLogin() throws Exception {
		List<ProductCatalog> list=new ArrayList<ProductCatalog>();
		list.add(new ProductCatalog());
		Mockito.when(catalogService.searchProduct(Mockito.isA(String.class))).thenReturn(list);
		webRequestController.searchBeforeLogin("", map);
	}
	
	@Test
	public void testShowOrderInfo() throws Exception {
		User bean=new User();
		Mockito.when(linkedInProvider.populateUserDetailsFromLinkedIn()).thenReturn(bean);
		webRequestController.showUserInfo(10L, map);
	}
	
	@Test
	public void testLinkedInUserInfo_1() throws Exception {
	
		User bean=new User();
		bean.setFirstName("XYZ");
		Mockito.when(linkedInProvider.populateUserDetailsFromLinkedIn()).thenReturn(bean);
		webRequestController.linkedInUserInfo(model);
		
	}
	
	@Test
	public void testLogin_1() {
		webRequestController.login();
	}
	
	@Test
	public void testUpdateProduct_1() throws Exception {
		ProductCatalog prod = new ProductCatalog();
		Mockito.when(adminService.updateProduct(Mockito.isA(ProductCatalog.class))).thenReturn("sample");
		webRequestController.updateProduct(prod, map);
	}
	
	@Test
	public void testAddToProduct_1() throws Exception {
		List<ProductCatalog> list = new ArrayList<ProductCatalog>();
		ProductCatalog cat=new ProductCatalog();
		list.add(cat);
		ProductCatalog pc=new ProductCatalog();
		Mockito.when(catalogService.getProduct()).thenReturn(list);
		webRequestController.addToProduct(pc, map);	
		}
	
	@Test(expected = NullPointerException.class)
	public void testClearCart_1() throws Exception {
		UserCartModel usercartmodel=new UserCartModel();
		//Mockito.when(cartServiceimpl.emptyCart("sample")).thenReturn(null);
		Mockito.when(cartServiceimpl.getCardDetails(Mockito.isA(Long.class))).thenReturn(usercartmodel);
		webRequestController.clearCart(10L, model);	
	}
	
	
	@Test
	public void testaddToCart() throws Exception {
		List<ProductCatalog> list=new ArrayList<ProductCatalog>();
		
		User bean=new User();
		bean.setFirstName("XYZ");
		Mockito.when(linkedInProvider.populateUserDetailsFromLinkedIn()).thenReturn(bean);
		//Mockito.when(cartServiceimpl.addToCart(Mockito.isA(String.class), Mockito.isA(Long.class))).thenReturn("");
		Mockito.when(catalogService.getProduct()).thenReturn(list);
		webRequestController.addToCart("sample", model);	
	}
	
	
	@Test(expected = NullPointerException.class)
	public void testgetCardDetails() throws Exception{
		UserCartModel user=new UserCartModel();
		//Mockito.when(cartServiceimpl.getCardDetails(Mockito.isA(String.class))).thenReturn(user);
		Mockito.when(cartServiceimpl.setProductPrice(Mockito.isA(UserCartModel.class))).thenReturn(user);
		webRequestController.getCardDetails(10L,model);
	}
	
	@Test
	public void testCategoryAfterLogin() throws Exception {
		User bean=new User();
		bean.setFirstName("XYZ");
		List<ProductCatalog> list=new ArrayList<ProductCatalog>();
		list.add(new ProductCatalog());
		Mockito.when(linkedInProvider.populateUserDetailsFromLinkedIn()).thenReturn(bean);
		Mockito.when(catalogService.categorySearch(Mockito.isA(String.class))).thenReturn(list);
		webRequestController.categoryAfterLogin("", map);
	}

	@Test
	public void testCategoryBeforeLogin() throws Exception {
		List<ProductCatalog> list=new ArrayList<ProductCatalog>();
		list.add(new ProductCatalog());
		Mockito.when(catalogService.categorySearch(Mockito.isA(String.class))).thenReturn(list);
		webRequestController.categoryBeforeLogin("", map);
	}
	
	@Test
	public void testError() throws Exception {
		User bean=new User();
		bean.setFirstName("ABC");
		Mockito.when(linkedInProvider.populateUserDetailsFromLinkedIn()).thenReturn(bean);
		webRequestController.error(map);
	}
	
	@Test
	public void testUserOrder() throws Exception {
		OrderEntity orderEntity =new OrderEntity();
		List<OrderEntity> list=new ArrayList<OrderEntity>();
		list.add(orderEntity);
		
		User bean=new User();
		bean.setFirstName("ABC");
		Mockito.when(linkedInProvider.populateUserDetailsFromLinkedIn()).thenReturn(bean);
		Mockito.when(cartServiceimpl.getAllOrder(Mockito.isA(Long.class))).thenReturn(list);
		webRequestController.userOrder(10L,map);
	}
	
	@Test
	public void testHomeAfterLogin() throws Exception {
		ProductCatalog productCatalog =new ProductCatalog();
		List<ProductCatalog> list=new ArrayList<ProductCatalog>();
		list.add(productCatalog);
		User bean = new User();
		bean.setFirstName("XYZ");
		Mockito.when(linkedInProvider.populateUserDetailsFromLinkedIn()).thenReturn(bean);
		Mockito.when(catalogService.getProduct()).thenReturn(list);
		webRequestController.homeAfterLogin(map);
		
	}
	
	@Test
	public void testAddGiftCard() throws Exception {
		User bean = new User();
		bean.setFirstName("XYZ");
		Mockito.when(linkedInProvider.populateUserDetailsFromLinkedIn()).thenReturn(bean);
		webRequestController.addGiftCard(map);
	}

/*	@Test
	public void testAddGiftCardResponse() throws Exception {
		GiftCard giftcard=new GiftCard();
		giftcard.setGiftCardId(10L);
		giftcard.setGiftCardValue("");
		User bean = new User();
		bean.setFirstName("XYZ");
		Mockito.when(linkedInProvider.populateUserDetailsFromLinkedIn()).thenReturn(bean);
		//Mockito.when(cartServiceimpl.addUserGiftCard(Mockito.isA(GiftCard.class))).thenReturn(giftcard);
		Mockito.when(cartServiceimpl.getUserGiftCard(Mockito.isA(Long.class))).thenReturn(giftcard);
		webRequestController.addGiftCardResponse(10L, "", map);
	}
	*/
	/*
	public void testAddToCart_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		String productId = (String) null;
		ExtendedModelMap model = new ExtendedModelMap();
		String result = fixture.addToCart(productId, model);
		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.login.social.providers.LinkedInProvider.populateUserDetailsFromLinkedIn(LinkedInProvider.java:54)
		//       at com.capgemini.config.WebRequestController.addToCart(WebRequestController.java:257)
		assertNotNull(result);
	}
	*//**
	 * Run the String addToProduct(ProductCatalog,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testAddToProduct_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		AdminLogin adminLogin = new AdminLogin();
		adminLogin.setUsername("");
		fixture.admin1 = adminLogin;
		fixture.web = new WebRequestController();
		ProductCatalog prod = new ProductCatalog();
		ModelMap model = new ModelMap();
		String result = fixture.addToProduct(prod, model);
		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.AdminServiceimpl.addToProduct(AdminServiceimpl.java:54)
		//       at com.capgemini.config.WebRequestController.addToProduct(WebRequestController.java:294)
		assertNotNull(result);
	}
	*//**
	 * Run the String adminLogin(AdminLogin,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testAdminLogin_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		AdminLogin admin = new AdminLogin();
		admin.setUsername("");
		ModelMap model = new ModelMap();
		String result = fixture.adminLogin(admin, model);
		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.getProduct(CatalogServiceImpl.java:22)
		//       at com.capgemini.config.WebRequestController.adminLogin(WebRequestController.java:323)
		assertNotNull(result);
	}
	*//*
	public void testClearCart_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		String userId = (String) null;
		ExtendedModelMap model = new ExtendedModelMap();
		String result = fixture.clearCart(userId, model);
		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.CartServiceimpl.emptyCart(CartServiceimpl.java:73)
		//       at com.capgemini.config.WebRequestController.clearCart(WebRequestController.java:285)
		assertNotNull(result);
	}
	*/
	/*public void testDeleteFromCart_1() throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		String productId = (String) null;
		ExtendedModelMap model = new ExtendedModelMap();
		String result = fixture.deleteFromCart(productId, model);
		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.login.social.providers.LinkedInProvider.populateUserDetailsFromLinkedIn(LinkedInProvider.java:54)
		//       at com.capgemini.config.WebRequestController.deleteFromCart(WebRequestController.java:275)
		assertNotNull(result);
	}*/
	/**
	 * Run the String error(ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testError_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		ModelMap model = new ModelMap();
		String result = fixture.error(model);
		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.login.social.providers.LinkedInProvider.populateUserDetailsFromLinkedIn(LinkedInProvider.java:54)
		//       at com.capgemini.config.WebRequestController.error(WebRequestController.java:98)
		assertNotNull(result);
	}
	*//**
	 * Run the String homeAfterLogin(ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 */
	
	@Test
	public void testHomeBeforeLogin() throws Exception {
		ProductCatalog productCatalog =new ProductCatalog();
		List<ProductCatalog> list=new ArrayList<ProductCatalog>();
		list.add(productCatalog);
		Mockito.when(catalogService.getProduct()).thenReturn(list);
		webRequestController.homeBeforeLogin(map);
	}

	/**
	 * Run the String linkedInUserInfo(Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testLinkedInUserInfo_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		ExtendedModelMap model = new ExtendedModelMap();
		String result = fixture.linkedInUserInfo(model);
		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.login.social.providers.LinkedInProvider.getLinkedInUserData(LinkedInProvider.java:42)
		//       at com.capgemini.config.WebRequestController.linkedInUserInfo(WebRequestController.java:247)
		assertNotNull(result);
	}
	*//**
	 * Run the String login() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testLogin_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		String result = fixture.login();
		// add additional test code here
		assertEquals("login-auth", result);
	}
	*//**
	 * Run the String payment(String,String,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 */
	 
	/*@Test
	public void testPayment_1() throws Exception {
		UserBean bean = new UserBean();
		bean.setFirstName("XYZ");
		Mockito.when(cartServiceimpl.deleteFromCart(pId, userId))
		Mockito.when(linkedInProvider.populateUserDetailsFromLinkedIn(Mockito.isA(UserBean.class))).thenReturn(bean);
	}*/

	@Test
	public void testShowAddPage() throws Exception {
		webRequestController.showAddPage(map);
	}
	
	@Test
	public void testShowAdminLoginPage() throws Exception {
		webRequestController.showAdminLoginPage(map);
	}
/*
	public void testShowAdminOrderPage_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		AdminLogin adminLogin = new AdminLogin();
		adminLogin.setUsername("");
		fixture.admin1 = adminLogin;
		fixture.web = new WebRequestController();
		ModelMap model = new ModelMap();
		String result = fixture.showAdminOrderPage(model);
		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.AdminServiceimpl.getAllOrder(AdminServiceimpl.java:30)
		//       at com.capgemini.config.WebRequestController.showAdminOrderPage(WebRequestController.java:151)
		assertNotNull(result);
	}
	*/
	/*
	@Test
	public void testShowCheckoutCompletePage_1() throws Exception {
		UserBean bean = new UserBean();
		bean.setFirstName("XYZ");
		Mockito.when(shippingBean.setPrice(Mockito.isA(1))
		Mockito.when(linkedInProvider.populateUserDetailsFromLinkedIn(Mockito.isA(UserBean.class))).thenReturn(bean);
		webRequestController.showCheckoutPage("", "", "", "", map);
	}*/

	@Test
	public void testShowCheckoutPage() throws Exception {
		User bean=new User();
		bean.setFirstName("XYZ");
		Mockito.when(linkedInProvider.populateUserDetailsFromLinkedIn()).thenReturn(bean);
		webRequestController.showCheckoutPage("", "", "", "", map);
	}
	
	@Test
	public void testShowgiftCardInfo() throws Exception {
		User bean=new User();
		bean.setFirstName("XYZ");
		GiftCard giftCard=new GiftCard();
		giftCard.setGiftCardId(10L);
		giftCard.setGiftCardValue("");
		Mockito.when(linkedInProvider.populateUserDetailsFromLinkedIn()).thenReturn(bean);
		Mockito.when(cartServiceimpl.getUserGiftCard(Mockito.isA(Long.class))).thenReturn(giftCard);
		webRequestController.showgiftCardInfo(map);

	}
/*
	public void testUpdateOrder_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		String orderId = (String) null;
		String user = (String) null;
		String productId = (String) null;
		String productName = (String) null;
		String price = (String) null;
		String quantity = (String) null;
		ModelMap model = new ModelMap();
		String result = fixture.updateOrder(orderId, user, productId, productName, price, quantity, model);
		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: null
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at com.capgemini.config.WebRequestController.updateOrder(WebRequestController.java:162)
		assertNotNull(result);
	}
	*//**
	 * Run the String updateOrder(String,String,String,String,String,String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testUpdateOrder_2()
		throws Exception {
		try {
			WebRequestController fixture = new WebRequestController();
			fixture.linkedInProvider = new LinkedInProvider();
			fixture.catalogService = new CatalogServiceImpl();
			fixture.userBean = new UserBean();
			fixture.adminService = new AdminServiceimpl();
			fixture.cartServiceimpl = new CartServiceimpl();
			fixture.admin1 = new AdminLogin();
			fixture.web = new WebRequestController();
			String orderId = (String) null;
			String user = (String) null;
			String productId = (String) null;
			String productName = (String) null;
			String price = (String) null;
			String quantity = (String) null;
			ModelMap model = new ModelMap();
			String result = fixture.updateOrder(orderId, user, productId, productName, price, quantity, model);
			// add additional test code here
			fail("The exception java.lang.NumberFormatException should have been thrown.");
		} catch (java.lang.NumberFormatException exception) {
			// The test succeeded by throwing the expected exception
		}
	}
	*//**
	 * Run the String updateOrder(String,String,String,String,String,String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testUpdateOrder_3()
		throws Exception {
		try {
			WebRequestController fixture = new WebRequestController();
			fixture.linkedInProvider = new LinkedInProvider();
			fixture.catalogService = new CatalogServiceImpl();
			fixture.userBean = new UserBean();
			fixture.adminService = new AdminServiceimpl();
			fixture.cartServiceimpl = new CartServiceimpl();
			fixture.admin1 = new AdminLogin();
			fixture.web = new WebRequestController();
			String orderId = (String) null;
			String user = (String) null;
			String productId = (String) null;
			String productName = (String) null;
			String price = (String) null;
			String quantity = (String) null;
			ModelMap model = new ModelMap();
			String result = fixture.updateOrder(orderId, user, productId, productName, price, quantity, model);
			// add additional test code here
			fail("The exception java.lang.NumberFormatException should have been thrown.");
		} catch (java.lang.NumberFormatException exception) {
			// The test succeeded by throwing the expected exception
		}
	}
	*//**
	 * Run the String updateOrder(String,String,String,String,String,String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testUpdateOrder_4()
		throws Exception {
		try {
			WebRequestController fixture = new WebRequestController();
			fixture.linkedInProvider = new LinkedInProvider();
			fixture.catalogService = new CatalogServiceImpl();
			fixture.userBean = new UserBean();
			fixture.adminService = new AdminServiceimpl();
			fixture.cartServiceimpl = new CartServiceimpl();
			fixture.admin1 = new AdminLogin();
			fixture.web = new WebRequestController();
			String orderId = (String) null;
			String user = (String) null;
			String productId = (String) null;
			String productName = (String) null;
			String price = (String) null;
			String quantity = (String) null;
			ModelMap model = new ModelMap();
			String result = fixture.updateOrder(orderId, user, productId, productName, price, quantity, model);
			// add additional test code here
			fail("The exception java.lang.NumberFormatException should have been thrown.");
		} catch (java.lang.NumberFormatException exception) {
			// The test succeeded by throwing the expected exception
		}
	}
	*//**
	 * Run the String updateOrder(String,String,String,String,String,String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testUpdateOrder_5()
		throws Exception {
		try {
			WebRequestController fixture = new WebRequestController();
			fixture.linkedInProvider = new LinkedInProvider();
			fixture.catalogService = new CatalogServiceImpl();
			fixture.userBean = new UserBean();
			fixture.adminService = new AdminServiceimpl();
			fixture.cartServiceimpl = new CartServiceimpl();
			fixture.admin1 = new AdminLogin();
			fixture.web = new WebRequestController();
			String orderId = (String) null;
			String user = (String) null;
			String productId = (String) null;
			String productName = (String) null;
			String price = (String) null;
			String quantity = (String) null;
			ModelMap model = new ModelMap();
			String result = fixture.updateOrder(orderId, user, productId, productName, price, quantity, model);
			// add additional test code here
			fail("The exception java.lang.NumberFormatException should have been thrown.");
		} catch (java.lang.NumberFormatException exception) {
			// The test succeeded by throwing the expected exception
		}
	}
	*//**
	 * Run the String updateOrder(String,String,String,String,String,String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testUpdateOrder_6()
		throws Exception {
		try {
			WebRequestController fixture = new WebRequestController();
			fixture.linkedInProvider = new LinkedInProvider();
			fixture.catalogService = new CatalogServiceImpl();
			fixture.userBean = new UserBean();
			fixture.adminService = new AdminServiceimpl();
			fixture.cartServiceimpl = new CartServiceimpl();
			fixture.admin1 = new AdminLogin();
			fixture.web = new WebRequestController();
			String orderId = (String) null;
			String user = (String) null;
			String productId = (String) null;
			String productName = (String) null;
			String price = (String) null;
			String quantity = (String) null;
			ModelMap model = new ModelMap();
			String result = fixture.updateOrder(orderId, user, productId, productName, price, quantity, model);
			// add additional test code here
			fail("The exception java.lang.NumberFormatException should have been thrown.");
		} catch (java.lang.NumberFormatException exception) {
			// The test succeeded by throwing the expected exception
		}
	}
	*//**
	 * Run the String updateOrder(String,String,String,String,String,String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testUpdateOrder_7()
		throws Exception {
		try {
			WebRequestController fixture = new WebRequestController();
			fixture.linkedInProvider = new LinkedInProvider();
			fixture.catalogService = new CatalogServiceImpl();
			fixture.userBean = new UserBean();
			fixture.adminService = new AdminServiceimpl();
			fixture.cartServiceimpl = new CartServiceimpl();
			fixture.admin1 = new AdminLogin();
			fixture.web = new WebRequestController();
			String orderId = (String) null;
			String user = (String) null;
			String productId = (String) null;
			String productName = (String) null;
			String price = (String) null;
			String quantity = (String) null;
			ModelMap model = new ModelMap();
			String result = fixture.updateOrder(orderId, user, productId, productName, price, quantity, model);
			// add additional test code here
			fail("The exception java.lang.NumberFormatException should have been thrown.");
		} catch (java.lang.NumberFormatException exception) {
			// The test succeeded by throwing the expected exception
		}
	}
	*//**
	 * Run the String updateProduct(ProductCatalog,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testUpdateProduct_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		ProductCatalog prod = new ProductCatalog();
		ModelMap model = new ModelMap();
		String result = fixture.updateProduct(prod, model);
		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.AdminServiceimpl.updateProduct(AdminServiceimpl.java:59)
		//       at com.capgemini.config.WebRequestController.updateProduct(WebRequestController.java:315)
		assertNotNull(result);
	}
	*//**
	 * Run the String updateProduct1(String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testUpdateProduct1_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		AdminLogin adminLogin = new AdminLogin();
		adminLogin.setUsername("");
		fixture.admin1 = adminLogin;
		fixture.web = new WebRequestController();
		String proId = (String) null;
		ModelMap model = new ModelMap();
		String result = fixture.updateProduct1(proId, model);
		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.getProduct(CatalogServiceImpl.java:22)
		//       at com.capgemini.config.WebRequestController.updateProduct1(WebRequestController.java:303)
		assertNotNull(result);
	}
	*//**
	 * Run the String updateProduct1(String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testUpdateProduct1_2()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		AdminLogin adminLogin = new AdminLogin();
		adminLogin.setUsername("");
		fixture.admin1 = adminLogin;
		fixture.web = new WebRequestController();
		String proId = (String) null;
		ModelMap model = new ModelMap();
		String result = fixture.updateProduct1(proId, model);
		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.getProduct(CatalogServiceImpl.java:22)
		//       at com.capgemini.config.WebRequestController.updateProduct1(WebRequestController.java:303)
		assertNotNull(result);
	}
	*//**
	 * Run the String updateProduct1(String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testUpdateProduct1_3()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		AdminLogin adminLogin = new AdminLogin();
		adminLogin.setUsername("");
		fixture.admin1 = adminLogin;
		fixture.web = new WebRequestController();
		String proId = (String) null;
		ModelMap model = new ModelMap();
		String result = fixture.updateProduct1(proId, model);
		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.getProduct(CatalogServiceImpl.java:22)
		//       at com.capgemini.config.WebRequestController.updateProduct1(WebRequestController.java:303)
		assertNotNull(result);
	}
	*//**
	 * Run the String userOrder(ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 */
	protected void tearDown() throws Exception {
		
	}
}

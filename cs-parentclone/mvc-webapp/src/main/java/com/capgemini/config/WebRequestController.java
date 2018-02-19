package com.capgemini.config;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.bean.AdminLogin;
import com.capgemini.bean.ClickStream;
import com.capgemini.bean.GiftCard;
import com.capgemini.bean.OrderDetailsEntity;
import com.capgemini.bean.OrderEntity;
import com.capgemini.bean.OrderStatus;
import com.capgemini.bean.ProductCatalog;
import com.capgemini.bean.ShippingBean;
import com.capgemini.login.social.providers.LinkedInProvider;
import com.capgemini.service.AdminService;
import com.capgemini.serviceimpl.CartServiceimpl;
import com.capgemini.serviceimpl.CatalogServiceImpl;
import com.capgemini.serviceimpl.UserCartModel;
import com.cg.catalog.GiftCardCatalog;
import com.cg.feedback.CustomerFeedback
import com.cg.userprofile.User;

@Controller
public class WebRequestController {

	private static final Logger logger = LoggerFactory.getLogger(WebRequestController.class);
	@Autowired
	public CartServiceimpl cartServiceimpl;

	@Autowired
	LinkedInProvider linkedInProvider;

	@Autowired
	AdminService adminService;

	@Autowired
	public CatalogServiceImpl catalogService;

	AdminLogin admin1 = new AdminLogin();

	@RequestMapping({ "/", "/home" })
	public String homeBeforeLogin(ModelMap model) {

		List<ProductCatalog> list = catalogService.getProduct();
		model.addAttribute("catalog", list);
		return "Home";
	}

	/*
	 * @RequestMapping("/sar") public String sar(ModelMap model) {
	 * model.addAttribute("name", admin1.getUsername()); return "SAR"; }
	 * 
	 * @RequestMapping("/sar1") public String sarResponse(@RequestParam("userId")
	 * String userId, ModelMap model) { ClickStream click =
	 * adminService.sar(userId); model.addAttribute("sar", click);
	 * model.addAttribute("name", admin1.getUsername()); return "SAR1"; }
	 */

	@RequestMapping(value = "/admingetgiftcards", method = RequestMethod.GET)
	public String adminGetGiftCards(Model model) {
		List<GiftCardCatalog> giftCards = cartServiceimpl.getAllGiftCards();
		model.addAttribute("giftcards", giftCards);
		model.addAttribute("name", admin1.getUsername());
		return "AdminGiftCardList";
	}

	@RequestMapping(value = "/addadmingiftcard", method = RequestMethod.GET)
	public String addAdminGiftCard(Model model) {
		model.addAttribute("name", admin1.getUsername());
		return "AdminAddGiftCard";
	}

	@RequestMapping(value = "/adminaddGiftCardresponse", method = RequestMethod.POST)
	public String adminAddGiftCardResponse(@ModelAttribute GiftCardCatalog giftCardCatalog,  Model model) {
		catalogService.addGiftCard(giftCardCatalog);
		List<GiftCardCatalog> giftCards = cartServiceimpl.getAllGiftCards();
		model.addAttribute("giftcards", giftCards);
		model.addAttribute("name", admin1.getUsername());
		return "AdminGiftCardList";
	}

	@RequestMapping(value = "/home1", method = RequestMethod.GET)
	public String homeAfterLogin(ModelMap model) {
		List<ProductCatalog> list = catalogService.getProduct();
		model.addAttribute("catalog", list);
		model.addAttribute("name", linkedInProvider.populateUserDetailsFromLinkedIn().getFirstName());
		model.addAttribute("userId", linkedInProvider.populateUserDetailsFromLinkedIn().getUserId());
		return "index";
	}

	@RequestMapping(value = "/userinfo", method = RequestMethod.GET)
	public String showUserInfo(@RequestParam("userId") Long userId, ModelMap model) {

		User user = cartServiceimpl.getUserInfo(userId);
		model.addAttribute("userinfo", user);
		User bean = linkedInProvider.populateUserDetailsFromLinkedIn();
		model.addAttribute("name", bean.getFirstName());
		model.addAttribute("userId", bean.getUserId());
		return "UserInfo";
	}

	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public String error(ModelMap model) {
		User bean = linkedInProvider.populateUserDetailsFromLinkedIn();
		model.addAttribute("name", bean.getFirstName());
		model.addAttribute("userId", bean.getUserId());
		return "error";
	}

	@RequestMapping(value = "/userOrder", method = RequestMethod.GET)
	public String userOrder(@RequestParam("id") Long userId, ModelMap model) {
		List<OrderEntity> orderlist = cartServiceimpl.getAllOrder(userId);
		model.addAttribute("orderInfo", orderlist);
		User bean = linkedInProvider.populateUserDetailsFromLinkedIn();
		model.addAttribute("name", bean.getFirstName());
		model.addAttribute("userId", bean.getUserId());
		return "UserOrder";
	}

	@RequestMapping(value = "/giftCard", method = RequestMethod.GET)
	public String showgiftCardInfo(ModelMap model) {

		User bean = linkedInProvider.populateUserDetailsFromLinkedIn();
		model.addAttribute("name", bean.getFirstName());
		model.addAttribute("userId", bean.getUserId());
		GiftCard gift = cartServiceimpl.getUserGiftCard(bean.getUserId());
		model.addAttribute("giftcard", gift);
		return "GiftCard";
	}

	@RequestMapping(value = "/addGiftCard", method = RequestMethod.GET)
	public String addGiftCard(ModelMap model) {
		List<GiftCardCatalog> giftCards = cartServiceimpl.getAllGiftCards();
		model.addAttribute("giftcards", giftCards);
		User bean = linkedInProvider.populateUserDetailsFromLinkedIn();
		model.addAttribute("name", bean.getFirstName());
		model.addAttribute("userId", bean.getUserId());
		return "AddGiftCard";
	}

	@RequestMapping(value = "/addgiftcardresponse", method = RequestMethod.GET)
	public String addGiftCardResponse(@RequestParam("userId") Long id, @RequestParam("price") String value,
			ModelMap model) {

		cartServiceimpl.creditGiftCard(id, value);

		List<GiftCardCatalog> giftCards = cartServiceimpl.getAllGiftCards();
		model.addAttribute("giftcards", giftCards);
		User bean = linkedInProvider.populateUserDetailsFromLinkedIn();
		model.addAttribute("name", bean.getFirstName());
		model.addAttribute("userId", bean.getUserId());
		return "AddGiftCard";
	}

	@RequestMapping(value = "/addProduct", method = RequestMethod.GET)
	public String showAddPage(ModelMap model) {
		model.addAttribute("name", admin1.getUsername());
		return "addProduct";
	}
	
	@RequestMapping(value = "/deleteProduct", method = RequestMethod.GET)
	public String deleteProduct(@RequestParam("id") String productId, ModelMap model) {
		System.err.println(productId);
		adminService.deleteProduct(productId);
		return adminHome(model);
	}

	@RequestMapping(value = "/orderList", method = RequestMethod.GET)
	public String showAdminOrderPage(ModelMap model) {
		List<OrderEntity> productlist = adminService.getAllOrder();
		model.addAttribute("orderInfo", productlist);
		model.addAttribute("name", admin1.getUsername());
		return "AdminOrderList";
	}

	@RequestMapping(value = "/updateorderList", method = RequestMethod.GET)
	public String updateOrder(@RequestParam("orderId") String orderId, @RequestParam("userId") String user,
			@RequestParam("productId") String productId, @RequestParam("productName") String productName,
			@RequestParam("price") String price, @RequestParam("quantity") String quantity, ModelMap model) {

		OrderDetailsEntity orddetails = new OrderDetailsEntity();
		orddetails.setPrice(Integer.parseInt(price));
		orddetails.setProductId(productId);
		orddetails.setQuantity(Integer.parseInt(quantity));
		orddetails.setProductName(productName);

		List<OrderDetailsEntity> orddetailslist = new ArrayList<OrderDetailsEntity>();
		orddetailslist.add(orddetails);
		OrderEntity ord = new OrderEntity();
		ord.setOrderDetails(orddetailslist);
		ord.setOrderId(Long.parseLong(orderId));
		ord.setUserId(Long.parseLong(user));
		ord.setStatus(OrderStatus.delivered);
		adminService.updateOrder(ord);
		return showAdminOrderPage(model);
	}

	@RequestMapping(value = "/adminlogin", method = RequestMethod.GET)
	public String showAdminLoginPage(ModelMap model) {
		return "AdminLogin";
	}

	@RequestMapping(value = "/adminHome", method = RequestMethod.GET)
	public String adminHome(ModelMap model) {
		List<ProductCatalog> cat = catalogService.getProduct();
		model.addAttribute("catalog", cat);
		model.addAttribute("name", admin1.getUsername());
		return "AdminHome";
	}

	@RequestMapping(value = "/checkout", method = RequestMethod.GET)
	public String showCheckoutPage(@RequestParam("uid") String userId, @RequestParam("pid") String productid,
			@RequestParam("qua") String quantity, @RequestParam("price") String price, ModelMap model) {
		model.addAttribute("uid", userId);
		model.addAttribute("pid", productid);
		model.addAttribute("qua", quantity);
		model.addAttribute("price", price);

		User bean = linkedInProvider.populateUserDetailsFromLinkedIn();
		model.addAttribute("name", bean.getFirstName());
		model.addAttribute("userId", bean.getUserId());

		return "checkout";
	}

	@RequestMapping(value = "/checkoutcomplete", method = RequestMethod.GET)
	public String showCheckoutCompletePage(@ModelAttribute ShippingBean address, ModelMap model) {
		address.setPrice(address.getPrice() * address.getQua());
		User bean = linkedInProvider.populateUserDetailsFromLinkedIn();
		model.addAttribute("name", bean.getFirstName());
		model.addAttribute("userId", bean.getUserId());
		model.addAttribute("checkout", address);
		return "CheckoutConfirm";
	}

	@RequestMapping(value = "/payment", method = RequestMethod.GET)
	public String payment(@RequestParam("uid") Long userId, @RequestParam("pid") String pId,
			@RequestParam("qua") Long quantity, @RequestParam("price") String price, Model model) {
		User user = cartServiceimpl.getUserInfo(userId);
		if (Long.valueOf(price) <= user.getBalance()) {
			cartServiceimpl.deleteFromCart(pId, userId);
			cartServiceimpl.debitGiftCard(userId, price);
			OrderDetailsEntity orderDetailsEntity = new OrderDetailsEntity();
			
			orderDetailsEntity.setQuantity(1);
			orderDetailsEntity.setProductId(pId);
			orderDetailsEntity.setPrice(Integer.parseInt(price));
			List<ProductCatalog> productList = catalogService.getProduct();
			for (ProductCatalog productCatalog : productList) {
				if (productCatalog.getProductIdChild().equalsIgnoreCase(pId)) {
					orderDetailsEntity.setProductName(productCatalog.getProductName());
				}
			}

			List<OrderDetailsEntity> list = new ArrayList<>();
			list.add(orderDetailsEntity);

			OrderEntity order = new OrderEntity();
			order.setUserId(userId);
			order.setStatus(OrderStatus.placedorder);
			order.setOrderDetails(list);
			adminService.addOrder(order);

			model.addAttribute("message", "Successfully added to the cart");
		} else {
			model.addAttribute("message", "Low Balance!! Add some GiftCards.. Thank You");
		}
		model.addAttribute("name", user.getFirstName());
		model.addAttribute("userId", user.getUserId());
		List<ProductCatalog> cat = catalogService.getProduct();
		model.addAttribute("catalog", cat);
		model.addAttribute("productId", pId);
		return "Feedback";
	}

	@RequestMapping(value = "/feedbackresponse", method = RequestMethod.POST)
	public String feedbackResponse(@RequestParam("userId") Long userId, @RequestParam("productId") String productId,
			@RequestParam("ratings") String ratings, @RequestParam("feedback") String feedback, Model model) {

		CustomerFeedback customer = new CustomerFeedback();
		customer.setFeedback(feedback);
		customer.setProductId(productId);
		customer.setUserId(userId);
		customer.setRating(ratings);

		cartServiceimpl.feedbackStoring(customer);

		User user = cartServiceimpl.getUserInfo(userId);
		model.addAttribute("name", user.getFirstName());
		model.addAttribute("userId", user.getUserId());
		List<ProductCatalog> cat = catalogService.getProduct();
		model.addAttribute("catalog", cat);
		return "index";
	}

	@RequestMapping(value = "/linkedin", method = RequestMethod.GET)
	public String linkedInUserInfo(Model model) {
		return linkedInProvider.getLinkedInUserData(model);
	}

	@RequestMapping(value = "/loginauth", method = RequestMethod.GET)
	public String login() {
		return "login-auth";
	}

	@RequestMapping(value = "/addtocart", method = RequestMethod.GET)
	public String addToCart(@RequestParam("id") String productId, Model model) {
		User bean = linkedInProvider.populateUserDetailsFromLinkedIn();
		model.addAttribute("name", bean.getFirstName());
		model.addAttribute("userId", bean.getUserId());
		cartServiceimpl.addToCart(productId, bean.getUserId());
		List<ProductCatalog> list = catalogService.getProduct();
		model.addAttribute("catalog", list);
		return "index";
	}

	@RequestMapping(value = "/getcart", method = RequestMethod.GET)
	public String getCardDetails(@RequestParam("id") Long userId, Model model) {
		User bean = linkedInProvider.populateUserDetailsFromLinkedIn();
		model.addAttribute("name", bean.getFirstName());
		model.addAttribute("userId", bean.getUserId());

		UserCartModel UserCartModel = cartServiceimpl.setProductPrice(cartServiceimpl.getCardDetails(userId));
		model.addAttribute("UserCartModel", UserCartModel);
		return "UserCart";
	}

	@RequestMapping(value = "/deletefromcart", method = RequestMethod.GET)
	public String deleteFromCart(@RequestParam("id") String productId, Model model) {
		User bean = linkedInProvider.populateUserDetailsFromLinkedIn();
		model.addAttribute("name", bean.getFirstName());
		model.addAttribute("userId", bean.getUserId());
		cartServiceimpl.deleteFromCart(productId, bean.getUserId());
		UserCartModel UserCartModel = cartServiceimpl.setProductPrice(cartServiceimpl.getCardDetails(bean.getUserId()));
		model.addAttribute("UserCartModel", UserCartModel);
		return "UserCart";
	}

	@RequestMapping(value = "/clearcart", method = RequestMethod.GET)
	public String clearCart(@RequestParam("name") Long userId, Model model) {
		cartServiceimpl.emptyCart(userId);
		User bean = linkedInProvider.populateUserDetailsFromLinkedIn();
		model.addAttribute("name", bean.getFirstName());
		model.addAttribute("userId", bean.getUserId());
		UserCartModel UserCartModel = cartServiceimpl.getCardDetails(userId);
		model.addAttribute("UserCartModel", UserCartModel);
		return "UserCart";
	}

	@RequestMapping(value = "/addtoproduct", method = RequestMethod.POST)
	public String addToProduct(@ModelAttribute("prod") ProductCatalog prod, ModelMap model) {
		adminService.addToProduct(prod);
		List<ProductCatalog> list = catalogService.getProduct();
		model.addAttribute("catalog", list);
		model.addAttribute("name", admin1.getUsername());
		return "adminHome";
	}

	@RequestMapping(value = "/updateproduct1", method = RequestMethod.GET)
	public String updateProduct1(@RequestParam("id") String proId, ModelMap model) {
		List<ProductCatalog> list = catalogService.getProduct();
		for (ProductCatalog productCatalog : list) {
			if (productCatalog.getProductIdChild().equalsIgnoreCase(proId)) {
				model.addAttribute("catalog", productCatalog);
			}
		}
		model.addAttribute("name", admin1.getUsername());
		return "EditProduct";
	}

	@RequestMapping(value = "/updateproduct", method = RequestMethod.POST)
	public String updateProduct(@ModelAttribute("prod") ProductCatalog prod, ModelMap model) {
		adminService.updateProduct(prod);
		return adminHome(model);
	}

	@RequestMapping(value = "/adminlog", method = RequestMethod.POST)
	public String adminLogin(@ModelAttribute("admin") AdminLogin admin, ModelMap model) {
		boolean validate = adminService.adminLogin(admin);
		if (validate == true) {
			admin1.setUsername(admin.getUsername());
			List<ProductCatalog> cat = catalogService.getProduct();
			model.addAttribute("catalog", cat);
			model.addAttribute("name", admin.getUsername());
			return "AdminHome";
		} else {
			model.addAttribute("message", "Invalid UserName or Password!!!!");
			return "AdminLogin";
		}

	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String searchAfterLogin(@RequestParam("key") String key, ModelMap model) {
		List<ProductCatalog> list = catalogService.searchProduct(key);
		model.addAttribute("catalog", list);
		User bean = linkedInProvider.populateUserDetailsFromLinkedIn();
		model.addAttribute("name", bean.getFirstName());
		model.addAttribute("userId", bean.getUserId());
		return "index";
	}

	@RequestMapping(value = "/search1", method = RequestMethod.GET)
	public String searchBeforeLogin(@RequestParam("key") String key, ModelMap model) {
		List<ProductCatalog> list = catalogService.searchProduct(key);
		model.addAttribute("catalog", list);
		return "Home";
	}

	@RequestMapping(value = "/category", method = RequestMethod.GET)
	public String categoryBeforeLogin(@RequestParam("type") String key, ModelMap model) {
		List<ProductCatalog> list = catalogService.categorySearch(key);
		model.addAttribute("catalog", list);
		return "Home";
	}

	@RequestMapping(value = "/category1", method = RequestMethod.GET)
	public String categoryAfterLogin(@RequestParam("type") String key, ModelMap model) {
		List<ProductCatalog> list = catalogService.categorySearch(key);
		model.addAttribute("catalog", list);
		User bean = linkedInProvider.populateUserDetailsFromLinkedIn();
		model.addAttribute("name", bean.getFirstName());
		model.addAttribute("userId", bean.getUserId());
		return "index";
	}

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String productDetails(@ModelAttribute ProductCatalog productCatalog, ModelMap model) {
		List<CustomerFeedback> list = catalogService.getProductDetails(productCatalog.getProductIdChild());
		model.addAttribute("productFeedbacks", list);
		model.addAttribute("product", productCatalog);
		return "ProductDetails";
	}

	@RequestMapping(value = "/productinfo", method = RequestMethod.GET)
	public String productInfo2(@RequestParam("userId") Long userId, @ModelAttribute ProductCatalog productCatalog,
			Model model) {
		List<CustomerFeedback> list = catalogService.getProductDetails(productCatalog.getProductIdChild());
		model.addAttribute("productFeedbacks", list);
		model.addAttribute("product", productCatalog);
		User user = cartServiceimpl.getUserInfo(userId);
		model.addAttribute("name", user.getFirstName());
		model.addAttribute("userId", user.getUserId());
		return "UserProduct";
	}

}

package com.capgemini.serviceimpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.capgemini.bean.AdminLogin;
import com.capgemini.bean.ClickStream;
import com.capgemini.bean.OrderEntity;
import com.capgemini.bean.ProductCatalog;
import com.capgemini.constant.URLConstants;
import com.capgemini.service.AdminService;
import com.capgemini.service.CatalogService;

@Service
public class AdminServiceimpl implements AdminService {

	//private static final Logger logger = LoggerFactory.getLogger(AdminServiceimpl.class);
	@Autowired
	RestTemplate restTemplate;
	
	//RestTemplate restTemplate=new RestTemplate();
	//@Autowired
	//CatalogService catalogService;
	

	@Override
	public List<OrderEntity> getAllOrder() {

		ResponseEntity<OrderEntity[]> orderlists = restTemplate.getForEntity(URLConstants.GET_ALL_ORDERS,
				OrderEntity[].class);
		List<OrderEntity> list = new ArrayList<OrderEntity>();

		for (int i = 0; i < orderlists.getBody().length; i++) {
			list.add(orderlists.getBody()[i]);
		}

		return list;
	}

	@Override
	public boolean adminLogin(AdminLogin adminValidate) {
		if (adminValidate.getUsername().equalsIgnoreCase("capgemini")
				&& adminValidate.getPassword().equalsIgnoreCase("123456789")) {
			return true;
			//return "adminHome";
		} else {
			return false;
			//return "error";
		}
	}

	@Override
	public void addToProduct(ProductCatalog prod) {
		restTemplate.postForObject(URLConstants.ADD_TO_PRODUCT, prod, ProductCatalog.class);
	}

	@Override
	public String updateProduct(ProductCatalog prod) {
		restTemplate.postForObject(URLConstants.UPDATE_PRODUCT, prod, String.class);
		return "sucessfully update";
	}

	@Override
	public String updateOrder(OrderEntity ord) {
		restTemplate.put(URLConstants.UPDATE_ORDER, ord, String.class);
		return "sucessfully update";
	}

	@Override
	public ClickStream sar(String userId) {
		ResponseEntity<ClickStream> click = restTemplate.getForEntity(URLConstants.click, ClickStream.class, String.class, userId);
		if(click == null)
			return null;
		else
		    return click.getBody();
	}

	@Override
	public void addOrder(OrderEntity order) {
		restTemplate.postForObject("http://order-mgmt/orders", order, String.class);
	}

	@Override
	public void deleteProduct(String productId) {
		System.err.println("http://catalog-mgmt/delete/"+productId+"?id="+productId);
		restTemplate.postForObject("http://catalog-mgmt/delete/"+productId+"?id="+productId, String.class, null);
	}
}

package com.capgemini.service;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.bean.AdminLogin;
import com.capgemini.bean.ClickStream;
import com.capgemini.bean.OrderEntity;
import com.capgemini.bean.ProductCatalog;
import com.capgemini.bean.ProductList;

public interface AdminService {

	
	public boolean adminLogin(AdminLogin adminValidate);

	public void addToProduct(ProductCatalog prod);

	public String updateProduct(ProductCatalog prod);

	public ClickStream sar(String userId);

	public List<OrderEntity> getAllOrder();

	public String updateOrder(OrderEntity prod);

	public void addOrder(OrderEntity order);

	public void deleteProduct(String productId);

}

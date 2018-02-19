package com.capgemini.service;

import java.util.List;

import com.capgemini.bean.CustomerFeedback;
import com.capgemini.bean.GiftCardCatalog;
import com.capgemini.bean.ProductCatalog;

public interface CatalogService {

	public List<ProductCatalog> getProduct();

	List<ProductCatalog> searchProduct(String prodName);

	List<ProductCatalog> categorySearch(String key);

	public List<CustomerFeedback> getProductDetails(String productId);

	GiftCardCatalog addGiftCard(GiftCardCatalog giftCardCatalog);

}

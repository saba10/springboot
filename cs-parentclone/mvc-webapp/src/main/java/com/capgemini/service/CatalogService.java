package com.capgemini.service;

import java.util.List;
import com.capgemini.bean.GiftCard;
import com.capgemini.bean.ProductCatalog;
import com.cg.catalog.GiftCardCatalog;
import com.cg.feedback.CustomerFeedback;

public interface CatalogService {

	public List<ProductCatalog> getProduct();

	List<ProductCatalog> searchProduct(String prodName);

	List<ProductCatalog> categorySearch(String key);

	public List<CustomerFeedback> getProductDetails(String productId);

	GiftCardCatalog addGiftCard(GiftCardCatalog giftCardCatalog);

}

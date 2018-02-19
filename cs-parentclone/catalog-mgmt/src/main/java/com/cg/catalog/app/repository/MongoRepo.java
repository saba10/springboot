package com.cg.catalog.app.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.cg.catalog.app.bean.ProductCatalog;

public interface MongoRepo extends MongoRepository<ProductCatalog, String>{
	
	@Query(value="{productIdChild : ?0}", delete = true)
	public Long deleteById(String Id);
	
	@Query(value="{catagoryName : ?0}")
	public List<ProductCatalog> findByCatName(String name);
	
	@Query(value="{productName : ?0}")
	public List<ProductCatalog> findByProdName(String name);
	
	@Query("{'productName': {$regex: ?0, $options: 'i'}})")
	public List<ProductCatalog> findPartialProdByName(String name);

	@Query(value="{giftCardId : ?0}", delete = true)
	public Long deleteByGiftCardId(String id);

}

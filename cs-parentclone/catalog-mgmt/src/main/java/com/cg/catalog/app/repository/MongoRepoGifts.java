package com.cg.catalog.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.cg.catalog.app.bean.GiftCardCatalog;

public interface MongoRepoGifts extends MongoRepository<GiftCardCatalog, String>{
	
	@Query(value="{giftCardId : ?0}", delete = true)
	public Long deleteById(String Id);

}

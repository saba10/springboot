package com.capgemini.usercart.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.usercart.model.UserCartModel;
import com.capgemini.usercart.repository.MongoRepositoryDataBaseOperations;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DeleteProductCartService {

	@Autowired
	MongoRepositoryDataBaseOperations mongoRepositoryDataBaseOperations;
	
	
	public UserCartModel deleteProduct(String userId, String productId){
		try {
			
			
			if (mongoRepositoryDataBaseOperations.exists(userId)) {
			//	log.info(" del: userId "+ userId+" exist");
				UserCartModel user = mongoRepositoryDataBaseOperations.findOne(userId);
				
				int index = CheckProductInList.getUserDetail(user.getCartItemList(), productId);
				//log.info("del: index value is :"+index);
				if (index < user.getCartItemList().size()) {
					user.getCartItemList().remove(index);
					//log.info("del: value delete");
				}
				
				
				return mongoRepositoryDataBaseOperations.save(user);
			}
			else
			{
				//log.info("user does not exist");
				return null;
			}
			
		} catch (Exception e) {
			
			//log.error("Error while deleting product user "+userId+ " productId: "+productId);
			return null;
		}
		

	
	}
}

package com.cg.catalog.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.catalog.app.bean.GiftCardCatalog;
import com.cg.catalog.app.bean.ProductCatalog;
import com.cg.catalog.app.repository.MongoRepo;
import com.cg.catalog.app.repository.MongoRepoGifts;

@RestController
public class CatalogController {
	
	@Autowired
	MongoRepo mongoRepo;
	
	@Autowired
	MongoRepoGifts mongoRepoGifts;
	
	@RequestMapping(value="getAllProds",method = RequestMethod.GET)
	public List<ProductCatalog> getAll() {
		return mongoRepo.findAll();
				
	}
	
	@RequestMapping(value="catagory",method=RequestMethod.POST)
	public List<ProductCatalog> getProdByCat(@RequestParam String categoryName){
	   return mongoRepo.findByCatName(categoryName);
	}
	
	@RequestMapping(value="product",method=RequestMethod.POST)
	public List<ProductCatalog> getProdByName(@RequestParam String prodName){
	   return mongoRepo.findByProdName(prodName);
	}
	
	@RequestMapping(value="getPartialProducts",method=RequestMethod.POST)
	public List<ProductCatalog> getProdByPartialName(@RequestParam String prodName){
	   return mongoRepo.findPartialProdByName(prodName);
	}
	
	@RequestMapping(value="add",method=RequestMethod.POST)
	public ProductCatalog addProduct(@RequestBody ProductCatalog pc){
	    mongoRepo.save(pc);
	    return pc;
	}
	
	
	@RequestMapping(value="update",method=RequestMethod.POST)
	public String updateProduct(@RequestBody ProductCatalog pc){
		try {
		deleteRecord(pc.getProductIdChild());
		}
		finally {
			mongoRepo.save(pc);
		}
		return "Product updated successfully";
	}
	@RequestMapping(value="delete/{id}",method=RequestMethod.POST)
	public String delete(@PathVariable("id") String id){
		String ret = "Product deleted successfully";
		if(deleteRecord(id) == 0) {
			ret = "Product not found in catalog";
		}
		return ret;
	}
	@RequestMapping(value="deleteGiftCard/{id}",method=RequestMethod.POST)
	public String deleteGiftCard(@PathVariable("id") String id){
		String ret = "Gift Card deleted successfully";
		if(deleteCard(id) == 0) {
			ret = "GiftCard not found";
		}
		return ret;
	}
	
	@GetMapping("getGiftCards")
	public List<GiftCardCatalog> getAllGifts() {
		return mongoRepoGifts.findAll();
	}
	
	public Long deleteRecord(String id) {
		return mongoRepo.deleteById(id);
	}
	
	public Long deleteCard(String id) {
		return mongoRepoGifts.deleteById(id);
	}

	@RequestMapping(value="addAll",method=RequestMethod.POST)
	public void addAllProduct(@RequestBody List<ProductCatalog> pc){
		for (ProductCatalog productCatalog : pc) {
			 mongoRepo.save(productCatalog);
		}
	}
	
	@RequestMapping(value="addGift",method=RequestMethod.POST)
	public GiftCardCatalog addGift(@RequestBody GiftCardCatalog pc){
		return mongoRepoGifts.save(pc);
	}

}

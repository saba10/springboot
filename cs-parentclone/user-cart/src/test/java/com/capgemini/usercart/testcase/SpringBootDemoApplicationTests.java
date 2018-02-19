/*
package com.capgemini.usercart.testcase;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.usercart.model.ConstantValues;
import com.capgemini.usercart.model.ProductCartModel;
import com.capgemini.usercart.model.UserCartModel;
import com.capgemini.usercart.repository.UserCartRepositoryDataBaseOperations;
import com.capgemini.usercart.services.AddProductCartService;
import com.capgemini.usercart.services.DeleteProductCartService;
import com.capgemini.usercart.services.EmptyProductCartService;
import com.capgemini.usercart.services.UserCartDetailService;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Slf4j
public class SpringBootDemoApplicationTests {

	static boolean expected=Boolean.TRUE;
	static boolean actual=Boolean.FALSE;
	
	@Test
	public void contextLoads() {
	}


	    
    @Autowired
    AddProductCartService addProductCartService;
    @Autowired
    DeleteProductCartService deleteProductCartService;
    @Autowired
    EmptyProductCartService emptyProductCartService;
    @Autowired
    UserCartDetailService userCartDetailService;
    
    @Autowired
	UserCartRepositoryDataBaseOperations mongoRepositoryDataBaseOperations;
    
    @Test
    public void test1() {
        
    	UserCartModel m=addProductCartService.addProduct(ConstantValues.TESTUSER, "productId", "2");
    	assertEquals(ConstantValues.TESTUSER, m.getUserId());
                
    }
    
    
    @Test
    public void test2()
    {
    	
    	UserCartModel usercartModel= addProductCartService.addProduct(ConstantValues.TESTUSER, "productId", "4");
    	
    	assertEquals(ConstantValues.TESTUSER, usercartModel.getUserId());
    }
    
    @Test
    public void test3(){
    	try{
    		
	    	
	    	
	    	String productId="productIdDelete";
	    	UserCartModel usercartModel= addProductCartService.addProduct(ConstantValues.TESTUSER, productId, "4");
	    	
	    	UserCartModel user= deleteProductCartService.deleteProduct(ConstantValues.TESTUSER, productId);
	    	
	    	List<ProductCartModel> cartItemList = user.getCartItemList();
	    	for(ProductCartModel m : cartItemList) {
				
	    		actual=true;
	    		if(m.getProductId().equalsIgnoreCase(productId))
	    		{
	    			actual=false;
	    		}
			}
	    	assertEquals(expected, actual);
    	}
    	catch(Exception ee)
    	{
    	  log.error("test3 failure");
    	}
    }
    
    @Test
    public void test4(){
    	
    	
    	UserCartModel user=userCartDetailService.getData(ConstantValues.TESTUSER);
    	
    	if(user.getUserId().equalsIgnoreCase(ConstantValues.TESTUSER) && user.getCartItemList().size()>0)
    	{
    		actual=true;
    	}
    	
    	assertEquals(expected, actual);
    	
    	
    }
    
    @Test
    public void test5()
    {
    	
    	String result=emptyProductCartService.emptyCart(ConstantValues.TESTUSER);
    	
    	if(result.equalsIgnoreCase(ConstantValues.RESULT_SUCCESS))
    	{
    		actual=true;
    	}
    		
    	assertEquals(expected, actual);
    }
    
    @Test
    public void test6()
    {
    	UserCartModel user=new UserCartModel();
    	user.setUserId(ConstantValues.TESTUSER);
    	List<ProductCartModel> list=new ArrayList<>();
    	ProductCartModel prod=new ProductCartModel();
    	prod.setProductId("prod1");
    	prod.setQuantity("2");
    	list.add(prod);
    	ProductCartModel prod2=new ProductCartModel();
    	prod.setProductId("prod2");
    	prod.setQuantity("2");
    	list.add(prod2);
    	user.setCartItemList(list);
    	
    	if(ConstantValues.TESTUSER.equalsIgnoreCase(user.getUserId()) && user.getCartItemList().size()==list.size())
    	{
    		actual=true;
    	}
    	assertEquals(expected, actual);
    	
    }

}
*/
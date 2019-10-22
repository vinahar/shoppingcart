package com.infoud.shoopingcart.productoperations;

import java.util.Map;
import java.util.Map.Entry;

import com.infoud.shoopingcart.cart.Product;
import com.infoud.shoopingcart.cart.Storage;

public class ProductByID {

	public Product getProductById(String productId) {

		Product product = null;
		Map<String, Product> prod = Storage.getCart();
	       for (Entry<String, Product> entry : prod.entrySet()) {
	    	   if(entry.getKey().equals(productId)) {

	    	   product = entry.getValue();
	    	               System.out.println("product:+"+product);
	    	                  break;
	    	              }
	    	          }
	    	          
		

		return product;

	}

}

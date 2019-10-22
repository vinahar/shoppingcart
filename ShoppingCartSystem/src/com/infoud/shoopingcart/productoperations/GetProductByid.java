package com.infoud.shoopingcart.productoperations;

import java.util.Map;

import com.infoud.shoopingcart.cart.Product;
import com.infoud.shoopingcart.cart.Storage;

public class GetProductByid {
	public Product getProductByProductID(String pid) {
	        Product product = null;
	        Map<String, Product> products = Storage.getCart();
	       // System.out.println(products);
	        for (Map.Entry<String, Product> entry : products.entrySet()) {
				 if(entry.getKey().equals(pid)) {
				 
					product = entry.getValue();
	            	System.out.println("found product:+"+product);
	                break;
	            }
	        }
	        return product;
			 }
	
	
}

package com.infoud.shoopingcart.cart;

import java.util.List;

public class GetProductByid extends Storage {
	   public Product getProductByProductID(String pid) {
	        Product product = null;
	        List<Product> products = getCart();
	        System.out.println(products);
	        for (Product prod: products) {
	            if (prod.getPid().equals(pid)) {
	                product = prod;
	                break;
	            }
	        }
	        return product;
	    }
}

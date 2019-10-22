package com.infoud.shoopingcart.productoperations;

import com.infoud.shoopingcart.cart.Product;
import com.infoud.shoopingcart.cart.Storage;

public class AddProduct{

	 public void addProduct(Product product){
		 Storage.cart.put(product.getPid(), product);
		 
	 }
	 
	 
	 
}

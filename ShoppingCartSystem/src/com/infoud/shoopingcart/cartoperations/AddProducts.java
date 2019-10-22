package com.infoud.shoopingcart.cartoperations;

import com.infoud.shoopingcart.cart.Product;
import com.infoud.shoopingcart.cart.Storage;

public class AddProducts{

	public void addProductToCartByPID(Product product) {
   

		Storage.cart.put(product.getPid(),product);
	
		
	
}
	
	 
}

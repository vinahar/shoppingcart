package com.infoud.shoopingcart.cart;

import java.util.List;

import com.infoud.shoopingcart.cart.Product;
import com.infoud.shoopingcart.cart.Storage;

public class AddProducts extends Storage{

	public void addProductToCartByPID(Product product) {
       // Product product = getProductByProductID(pid);
     //  addToCart(product)}

		cart.add(product);
		
		setCart(cart);
		//System.out.println(""+cart);
		//System.out.println("addtocart" + product);
		
		//System.out.println("get cart" + cart);
		//return cart;
		
	
}
	public List<Product> addProductToCart(Product product) {
	       // Product product = getProductByProductID(pid);
	     //  addToCart(product)}

			cart.add(product);
			
			//setCart(cart);
			//System.out.println(""+cart);
			//System.out.println("addtocart" + product);
			return cart;
			
			//System.out.println("get cart" + cart);
			//return cart;
			
		
	}
	

	
	  public void printCartItems() {
	  
	  for (Product prod: cart) { System.out.println("product:"+prod); }
	  
	  
	  }
	 
}

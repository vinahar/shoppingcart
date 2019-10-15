package com.infoud.shoopingcart.cart;

import java.util.List;

public class AddProducts extends Storage{

	public List<Product> addProductToCartByPID(Product product) {
       // Product product = getProductByProductID(pid);
     //  addToCart(product)}

		cart.add(product);
		System.out.println("addtocart" + product);
		
		System.out.println("get cart" + cart);
		return cart;

	
}}

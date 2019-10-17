package com.infoud.shoopingcart.users;

import java.util.List;

import com.infoud.shoopingcart.cart.AddProducts;
import com.infoud.shoopingcart.cart.DeleteProducts;
import com.infoud.shoopingcart.cart.Product;
import com.infoud.shoopingcart.cart.ProductFunctions;
import com.infoud.shoopingcart.cart.Storage;
import com.infoud.shoopingcart.cart.ViewProducts;

public class Admin extends User{
	Storage storage = new Storage();
	
	  AddProducts addProducts = new AddProducts(); DeleteProducts deleteProducts2 =
	  new DeleteProducts(); ViewProducts viewProducts = new ViewProducts();
	 
	ProductFunctions productFunctions= new ProductFunctions();

	public Admin(String user_id, String role, String username, String password) {
		super(user_id, role);
		this.username = username;
		this.password = password;

	}

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public void additems(Product product) {
		//---using productFunction class---
		
		//  System.out.println("inside additem");
		  storage.setCart(productFunctions.addProductToCartByPID(product));
		  System.out.println("item"+product+" added.");
		 
		//---using addproduct class---
		/*
		 * addProducts.addProductToCartByPID(product);
		 * storage.setCart(addProducts.addProductToCart(product));
		 * System.out.println(storage.getCart());
		 */
	}

	public void deleteitems(String pid) {
		//---using productFunction class---
		
		
		  System.out.println("inside deleteitem");
		  productFunctions.deleteProductToCartByPID(pid);
		 		 
		
		//---using deleteproduct class---
		/*
		 * System.out.println("inside deleteitem");
		 * deleteProducts2.deleteProductToCartByPID(pid);
		 */
	}

	public void viewcart() {
		//---using productFunction class---
		
	//	System.out.println("inside viewcart");
		productFunctions.printCartItems();
		 
		
		//---using deleteproduct class---
		/*
		 * System.out.println("Viewproducts:"); viewProducts.printCartItems();
		 */
		

	}

}

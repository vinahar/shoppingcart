package com.infoud.shoopingcart.cart;

import com.infoud.shoopingcart.cart.AddProducts;
import com.infoud.shoopingcart.cart.DeleteProducts;
import com.infoud.shoopingcart.cart.Product;
import com.infoud.shoopingcart.cart.Storage;

public class Admin extends User {

	Storage storage = new Storage();
	AddProducts addProducts = new AddProducts();
	DeleteProducts deleteProducts2=new DeleteProducts();
	DeleteProducts deleteProducts = new DeleteProducts();

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
		System.out.println("inside additem");
		addProducts.addProductToCartByPID(product);
		System.out.println(product);
	}
	public void deleteitems(String pid) {
		System.out.println("inside additem");
		deleteProducts.deleteProductToCartByPID(pid);
	
	}
}

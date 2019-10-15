package com.infoud.shoopingcart.users;

import java.util.List;

import com.infoud.shoopingcart.cart.AddProducts;
import com.infoud.shoopingcart.cart.DeleteProducts;
import com.infoud.shoopingcart.cart.Product;
import com.infoud.shoopingcart.cart.Storage;

public class Admin extends User{
	

	AddProducts addProducts=new AddProducts();
	DeleteProducts deleteProducts=new DeleteProducts();
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

	public  List<Product> additems(Product product) {
		List <Product>products=addProducts.addProductToCartByPID(product);
		System.out.println("product:" + products);
		return products;
	}
	public void deleteitems(String pid) {
	
		deleteProducts.deleteProductToCartByPID(pid);
		System.out.println("deleted item");
	}
}

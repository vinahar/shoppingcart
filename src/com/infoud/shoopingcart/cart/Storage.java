package com.infoud.shoopingcart.cart;

import java.util.ArrayList;
import java.util.List;

import com.infoud.shoopingcart.users.User;

public class Storage {

	
	List<Product> cart = new ArrayList<Product>();
	 List<Order>orderlist  = new ArrayList<Order>();  
	 List<OrderRequest>requestlist = new ArrayList<OrderRequest>();
	 List<User>userlist = new ArrayList<User>();
	 
	public List<Product> getCart() {
		System.out.println("getting the card");
		return cart;

	}
	public void setCart(List<Product> cart) {
		this.cart = cart;
		
	}
	public List<Order> getOrderlist() {
		return orderlist;
	}
	public void setOrderlist(List<Order> orderlist) {
		this.orderlist = orderlist;
	}
	public List<OrderRequest> getRequestlist() {
		return requestlist;
	}
	public void setRequestlist(List<OrderRequest> requestlist) {
		this.requestlist = requestlist;
	}
	public List<User> getUserlist() {
		return userlist;
	}
	public void setUserlist(List<User> userlist) {
		this.userlist = userlist;
	}
	@Override
	public String toString() {
		final int maxLen = 10;
		return "Storage [cart=" + (cart != null ? cart.subList(0, Math.min(cart.size(), maxLen)) : null) + "]";
	}
	
	
	
	/*
	 * public void addProductToCartByPID(Product product) { // Product product =
	 * getProductByProductID(pid); // addToCart(product); cart.add(product); }
	 * 
	 * public void deleteProductToCartByPID(String pid) { Product product =
	 * getProductByProductID(pid); removeFromCart(product); }
	 * 
	 * private Product getProductByProductID(String pid) { // TODO Auto-generated
	 * method stub Product product = null; List<Product> products = new
	 * Storage().getCart(); for (Product prod: products) { if
	 * (prod.getPid().equals(pid)) { product = prod; break; } } return product; }
	 * private void removeFromCart(Product product) { // TODO Auto-generated method
	 * stub
	 * 
	 * cart.remove(product); }
	 */	
}

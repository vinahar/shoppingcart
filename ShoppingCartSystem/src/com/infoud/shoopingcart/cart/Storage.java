package com.infoud.shoopingcart.cart;

import java.util.ArrayList;
import java.util.List;

import com.infoud.shoopingcart.users.User;

public class Storage {
	
	List<Product> cart = new ArrayList<Product>();
	List<Order> orderlist = new ArrayList<Order>();
	List<Order> sellproductlist = new ArrayList<Order>();
	List<User> userlist = new ArrayList<User>();
	
	public List<Product> getCart() {
		//System.out.println("getting the card");
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

	public List<Order> sellproductlist() {
		return sellproductlist;
	}

	public void sellproductlist(List<Order> sellproductlist) {
		this.sellproductlist = sellproductlist;
	}

	public List<User> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<User> userlist) {
		this.userlist = userlist;
	}

	@Override
	public String toString() {
		return "Storage [cart=" + cart + "]";
	}

	public void print() {
		System.out.println("" + cart);
	}



}

package com.infoud.shoopingcart.cart;


import java.util.HashMap;

import java.util.Map;

import com.infoud.shoopingcart.users.User;

public  class Storage {
	
	public static Map<String, Product> getCart() {
		return cart;
	}
	public static void setCart(Map<String, Product> cart) {
		Storage.cart = cart;
	}
	public static Map<String, Order> getReuestorderlist() {
		return reuestorderlist;
	}
	public static void setReuestorderlist(Map<String, Order> reuestorderlist) {
		Storage.reuestorderlist = reuestorderlist;
	}
	public static Map<String, Order> getOrderlist() {
		return orderlist;
	}
	public static void setOrderlist(Map<String, Order> orderlist) {
		Storage.orderlist = orderlist;
	}
	public static Map<String, Product> getSellproductlist() {
		return sellproductlist;
	}
	public static void setSellproductlist(Map<String, Product> sellproductlist) {
		Storage.sellproductlist = sellproductlist;
	}
	public static Map<String, User> getUserlist() {
		return userlist;
	}
	public static void setUserlist(Map<String, User> userlist) {
		Storage.userlist = userlist;
	}
	public  static Map<String,Product> cart = new HashMap<String,Product>();
	public  static Map<String,Order> reuestorderlist = new HashMap<String,Order>();
	public  static Map<String,Order> orderlist = new HashMap<String,Order>();
	public  static Map<String,Product> sellproductlist = new HashMap<String,Product>();
	public  static Map<String,User> userlist = new HashMap<String,User>();
	
	



}

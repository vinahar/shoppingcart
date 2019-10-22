package com.infoud.shoopingcart.cart;


public class placeOrder {


	public void requestOrder(Order order) {

		Storage.orderlist.put(order.getOrderid(), order);
	}
}

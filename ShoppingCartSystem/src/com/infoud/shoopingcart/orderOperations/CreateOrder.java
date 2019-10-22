package com.infoud.shoopingcart.orderOperations;

import com.infoud.shoopingcart.cart.Order;
import com.infoud.shoopingcart.cart.Storage;

public class CreateOrder {
	public void requestOrder(Order order) {
		order.setStatus("pending");
		Storage.orderlist.put(order.getOrderid(), order);
	}
}

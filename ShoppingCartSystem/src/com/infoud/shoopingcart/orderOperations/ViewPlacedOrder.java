package com.infoud.shoopingcart.orderOperations;

import java.util.Map.Entry;

import com.infoud.shoopingcart.cart.Order;
import com.infoud.shoopingcart.cart.Storage;

public class ViewPlacedOrder {
	public void viewPlacedOrder() {
		
		System.out.println("View Placed Orders::");
		for (Entry<String, Order> entry : Storage.orderlist.entrySet()) {
			System.out.println("Order Id:: " + entry.getKey() + " Order  Details :: " + entry.getValue());
		}
	}


}

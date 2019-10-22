package com.infoud.shoopingcart.orderOperations;

import java.util.Map;
import java.util.Map.Entry;

import com.infoud.shoopingcart.cart.Order;
import com.infoud.shoopingcart.cart.Storage;

public class GetOrderByID {
	public Order getOrderById(String orderId) {

		Order order = null;
		Map<String, Order> order1 = Storage.getOrderlist();
	       for (Entry<String, Order> entry : order1.entrySet()) {
	    	   if(entry.getKey().equals(orderId)) {

	    	   order = entry.getValue();
	    	               System.out.println("found order:+"+order);
	    	                  break;
	    	              }
	    	          }
	    	          
		

		return order;
	}

}

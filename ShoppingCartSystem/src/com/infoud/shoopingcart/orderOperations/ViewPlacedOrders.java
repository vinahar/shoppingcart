package com.infoud.shoopingcart.orderOperations;

import java.io.IOException;
import java.util.Map;

import com.infoud.shoopingcart.cart.Order;
import com.infoud.shoopingcart.cart.Storage;

public class ViewPlacedOrders {
	public void viewPlacedOrder () throws IOException{

		System.out.println("-----View Placed Orders:");
		//System.out.println(Storage.getOrderlist());
		
		for (Map.Entry<String, Order> entry : Storage.orderlist.entrySet()) {
			System.out.println( "\n\tOrder Id:: "
					+ entry.getKey() + " Order  Details : Status: " + entry.getValue().getStatus()
					+ "\n\t\tProduct: ID:" + entry.getValue().getProduct().getPid() + "\tname:"
					+ entry.getValue().getProduct().getName());
		}
		 
		/*
		 * Iterator<Map.Entry<String, Order>> itr =
		 * Storage.orderlist.entrySet().iterator();
		 * 
		 * while(itr.hasNext()) { if(itr.next()!=null) { Map.Entry<String, Order> entry
		 * = itr.next(); System.out.println("Customer id:" +
		 * entry.getValue().getCustomer().getCustomerid() + "\n\tOrder Id:: " +
		 * entry.getKey() + " Order  Details : Status: " + entry.getValue().getStatus()
		 * + "\n\t\tProduct: ID:" + entry.getValue().getProduct().getPid() + "\tname:" +
		 * entry.getValue().getProduct().getName()); } else {
		 * System.out.println("empty pending list."); }
		 * 
		 * }
		 */
		
	}

}

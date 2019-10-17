package com.infoud.shoopingcart.cart;

import java.util.List;

public class OrderFunctions extends Storage {

	/*
	 * public void orders(String pid) {
	 * 
	 * System.out.println("thankx for ordering"+productFunctions.findProduct(pid));
	 * 
	 * orderlist.add(orderRequest(pid)); }
	 */

	public List<Order> requestOrder(Order order) {
		System.out.println(order+"is adding");
		orderlist.add(order);
		return orderlist;

	}

	public void viewRequestedOrders() {
		System.out.println("Requested order::");
		for (Order order : orderlist) {
			System.out.println("\t" + order);
		}
	}

	public Order getOrderById(String orderId) {
System.out.println("orderId"+orderId);
		Order order = null;
		//List<Order> oList =orderlist;
		System.out.println(orderlist);
		for (Order o1 : orderlist) {
			System.out.println(o1);
			if (o1.getOrderid().equals(orderId)) {
				System.out.println("equal");
				order = o1;
				break;
			}
		}

		return order;

	}

	public void removeOrderByPID(String orderId) {
		System.out.println("order to delete:"+getOrderById(orderId));
		Order order = getOrderById(orderId);
		deleteOrder(order);
	}

	private void deleteOrder(Order order) {
		orderlist.remove(order);
		
	}
	public List<Order> processOrder(String orderid) {
	System.out.println("order to be deleted:"+getOrderById(orderid));
		//sellproductlist.add(getOrderById(orderid));
		removeOrderByPID(orderid);
		
		return sellproductlist;

	}
}

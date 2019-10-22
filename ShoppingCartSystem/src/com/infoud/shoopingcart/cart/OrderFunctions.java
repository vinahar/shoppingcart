package com.infoud.shoopingcart.cart;


import java.util.Map;
import java.util.Map.Entry;

import com.infoud.shoopingcart.productoperations.ProductFunctions;

public class OrderFunctions  {
	ProductFunctions productFunctions=new ProductFunctions();

	/*
	 * public void orders(String pid) {
	 * 
	 * System.out.println("thankx for ordering"+productFunctions.findProduct(pid));
	 * 
	 * orderlist.add(orderRequest(pid)); }
	 */

	public void requestOrder(Order order) {
		//System.out.println(order+"is adding");
		order.setStatus("pending");
		Storage.orderlist.put(order.getOrderid(),order);
		

	}

	public void viewRequestedOrders() {
		System.out.println("Requested orders:");
		 for (Entry<String, Order> entry : Storage.orderlist.entrySet()) {
	    	   
	    	               System.out.println("product id"+entry.getKey()+"product details"+entry.getValue());
	    	                
	    	             }
	    	          }
	    	          
		
	

	
	
	public void removeOrderByID(String orderId) {
		Order order1 = getOrderById(orderId);

		deleteOrder(order1);
	}

	private void deleteOrder(Order order) {

		Storage.orderlist.remove(order.getOrderid());
	}

	public Order getOrderById(String orderId) {

		Order order = null;
		Map<String, Order> order1 = Storage.getOrderlist();
	       for (Entry<String, Order> entry : order1.entrySet()) {
	    	   if(entry.getKey().equals(orderId)) {

	    	   order = entry.getValue();
	    	               System.out.println("product:+"+order);
	    	                  break;
	    	              }
	    	          }
	    	          
		

		return order;
	}

	public void processOrder(String orderid) {
		Order order = getOrderById(orderid);
	System.out.println("order to be deleted:"+order);
	    Product product= productFunctions.getProductByProductID(order.getProduct().getPid());
	    productFunctions.productUpdate(product,1);
	    order.setStatus("completed");
	    Storage.sellproductlist.put(product.getPid(), product);
	    
		//sellproductlist.add(getOrderById(orderid));
		removeOrderByID(orderid);
		
		

	}
}

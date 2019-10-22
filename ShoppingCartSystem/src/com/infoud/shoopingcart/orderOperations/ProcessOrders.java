package com.infoud.shoopingcart.orderOperations;

import com.infoud.shoopingcart.cart.Order;
import com.infoud.shoopingcart.cart.Storage;
import com.infoud.shoopingcart.productoperations.GetProductByid;
import com.infoud.shoopingcart.productoperations.UpdateProducts;

public class ProcessOrders extends GetOrderByID {
	
	DeleteOrders deleteOrders=new DeleteOrders();
	UpdateProducts updateProducts=new UpdateProducts();
	GetProductByid getProductByid=new GetProductByid();

	public void processOrder(String orderid) {
		
		Order order = getOrderById(orderid);
	
	//	Product product = getProductByid.getProductByProductID(order.getProduct().getPid());

		
		
		//deleteOrders.removeOrderByID(orderid);
		deleteOrder(order);
		System.out.println("product selled");
		updateProducts.productUpdate(order.getProduct(), 1);
		
		// sellproductlist.add(getOrderById(orderid));
	

	}
	private void deleteOrder(Order order) {

		//Storage.orderlist.remove(order.getOrderid());
		
		order.setStatus("completed");
		Storage.sellproductlist.put(order.getOrderid(), order.getProduct());
	

	}
	
}

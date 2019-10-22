package com.infoud.shoopingcart.orderOperations;

import com.infoud.shoopingcart.cart.Order;
import com.infoud.shoopingcart.cart.Storage;

public class DeleteOrders extends GetOrderByID{
	public void removeOrderByID(String orderId) {
		Order order1 = getOrderById(orderId);

		deleteOrder(order1);
	}

	private void deleteOrder(Order order) {

		Storage.orderlist.remove(order.getOrderid());
	}

}

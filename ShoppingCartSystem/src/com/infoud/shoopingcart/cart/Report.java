package com.infoud.shoopingcart.cart;

import java.io.IOException;

import com.infoud.shoopingcart.cartoperations.ViewProducts;
import com.infoud.shoopingcart.orderOperations.ViewPlacedOrders;
import com.infoud.shoopingcart.productoperations.ViewSelledProducts;
import com.infoud.shoopingcart.userfunctions.UsersFunctions;

public class Report {
	private ViewProducts viewProducts=new ViewProducts();
	private ViewPlacedOrders viewPlacedOrders=new ViewPlacedOrders();
	private ViewSelledProducts viewSelledProducts=new ViewSelledProducts();
	private UsersFunctions usersFunctions=new UsersFunctions();
	public void viewSaleReport() {
		System.out.println("Sale Report:");
		viewSelledProducts.SelledProducts();
	}
	public void viewUsersbyRole() {
		usersFunctions.print(usersFunctions.groupByRole(Storage.userlist));
	}
	public void viewCustomers() {
		
	}
	public void viewPlacedOrders() throws IOException {
		System.out.println("Placed orders Report:");
		viewPlacedOrders.viewPlacedOrder();
	}
	public void productsinStorage() {
		System.out.println("Storage cart Report:");
		viewProducts.printCartItems();
	}
}

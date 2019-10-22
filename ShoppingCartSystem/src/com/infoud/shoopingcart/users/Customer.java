package com.infoud.shoopingcart.users;

import java.io.IOException;
import java.util.Objects;

import com.infoud.shoopingcart.cart.Order;
import com.infoud.shoopingcart.cart.OrderFunctions;
import com.infoud.shoopingcart.orderOperations.CreateOrder;
import com.infoud.shoopingcart.orderOperations.DeleteOrders;
import com.infoud.shoopingcart.orderOperations.GetOrderByID;
import com.infoud.shoopingcart.orderOperations.ViewPlacedOrders;

public class Customer  extends User{
 private String customerid;
 private String customerName;
 private String address;
 //OrderRequest orderRequest=new OrderRequest();
 OrderFunctions orderFunctions=new OrderFunctions();
 GetOrderByID getOrderByID=new GetOrderByID();
 CreateOrder createOrder=new CreateOrder();
 ViewPlacedOrders viewPlacedOrders=new ViewPlacedOrders();
DeleteOrders deleteOrders=new DeleteOrders();



public Customer(String user_id, String role, String customerid, String customerName, String address) {
	super(user_id, role);
	this.customerid = customerid;
	this.customerName = customerName;
	this.address = address;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

@Override
public String toString() {
	return "Customer [customerName=" + customerName + ", address=" + address + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + Objects.hash(address, customerName);
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Customer other = (Customer) obj;
	return Objects.equals(address, other.address) && Objects.equals(customerName, other.customerName);
}

public String getCustomerid() {
	return customerid;
}

public void setCustomerid(String customerid) {
	this.customerid = customerid;
}
public void createOrder( String pid) {
   //orderRequest.orderRequests(pid);
   System.out.println("order created");
}

	
	 
	 
public void  buyProduct(Order order) {

// orderFunctions.requestOrder(order);	
 createOrder.requestOrder(order);
}
public void vieworderRequests() throws IOException {
	
		//orderFunctions.viewRequestedOrders();
	viewPlacedOrders.viewPlacedOrder();
	
}


	/*
	 * public List<Order> addrequest(Order order) {
	 * List<Order>order1=orderFunctions.requestOrder(order1);
	 * System.out.println("your order is placed"); return order1; }
	 */
}
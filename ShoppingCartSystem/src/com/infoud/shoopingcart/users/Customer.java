package com.infoud.shoopingcart.users;

import java.util.List;
import java.util.Objects;

import com.infoud.shoopingcart.cart.Order;
import com.infoud.shoopingcart.cart.OrderFunctions;
import com.infoud.shoopingcart.cart.OrderRequest;

public class Customer  extends User{
 private String customerid;
 private String customerName;
 private String address;
 OrderRequest orderRequest=new OrderRequest();
OrderFunctions orderFunctions=new OrderFunctions();



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
   orderRequest.orderRequests(pid);
   System.out.println("order created");
}

	/*
	 * public List<Order> addrequest(Order order) {
	 * List<Order>order1=orderFunctions.requestOrder(order1);
	 * System.out.println("your order is placed"); return order1; }
	 */
public List<Order> buyProduct(Order order) {

List<Order> reqorder = orderFunctions.requestOrder(order);
// System.out.println("product:" + products);
return reqorder;
}
public void orderRequests() {
	//orderRequest.viewRequestedOrders();
		orderFunctions.viewRequestedOrders();
}}
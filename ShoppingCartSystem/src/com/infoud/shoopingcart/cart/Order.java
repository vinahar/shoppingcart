package com.infoud.shoopingcart.cart;

import java.util.ArrayList;
import java.util.List;

import com.infoud.shoopingcart.users.Customer;

public class Order {
 private String orderid;
 private String status=null;
//private Customer customer;
// private String customerid;
 private Product product;
 @Override
public String toString() {
	return "Order [orderid=" + orderid + ", status=" + status + ", product=" + product + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((orderid == null) ? 0 : orderid.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Order other = (Order) obj;
	if (orderid == null) {
		if (other.orderid != null)
			return false;
	} else if (!orderid.equals(other.orderid))
		return false;
	return true;
}
//private List <Product>productsinOrder=new ArrayList<Product>();
public String getOrderid() {
	return orderid;
}
public void setOrderid(String orderid) {
	this.orderid = orderid;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}


	/*
	 * public Customer getCustomer() { return customer; }
	 * 
	 * public void setCustomer(Customer customer) { this.customer = customer; }
	 */

	/*
	 * public String getCustomerid() { return customerid; }
	 * 
	 * public void setCustomerid(String customerid) { this.customerid = customerid;
	 * }
	 */
	 
 
}




	
	
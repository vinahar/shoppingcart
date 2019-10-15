package com.infoud.shoopingcart.cart;

import java.util.Objects;

public class Customer  extends User{
 private String customerid;
 private String customerName;
 private String address;




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

}

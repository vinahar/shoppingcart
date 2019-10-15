package com.infoud.shoopingcart.cart;

public class Order {
 private String orderid;
 private String status=null;
 private Product product;
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
 
}

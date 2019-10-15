package com.infoud.shoopingcart.cart;

import java.util.Objects;

public class Product {
	private String pid;
    private String name;
    private Double price;
    private int quantity;
	public String getPid() {
		return pid;
	}
	public void setPid(String string) {
		this.pid = string;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public int hashCode() {
		return Objects.hash(pid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && pid == other.pid;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	public void showDetails() {
		// TODO Auto-generated method stub

				
				System.out.println("ProductID"+this.pid);
				System.out.println("ProductNAme:"+this.name);
				System.out.println("Quantity:"+this.quantity);
				System.out.println("Price"+this.price);
						//System.out.println(product1.get;
				}
	}
	


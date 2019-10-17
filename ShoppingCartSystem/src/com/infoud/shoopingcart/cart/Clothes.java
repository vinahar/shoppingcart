package com.infoud.shoopingcart.cart;

public class Clothes extends Product {
  private String brand;
  private String size;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}
public void showDetails()
{

		super.showDetails();
		System.out.println("brand:"+brand);
		System.out.println("size:"+size);
				//System.out.println(product1.get;
		}

}


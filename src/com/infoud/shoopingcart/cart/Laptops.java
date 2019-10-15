package com.infoud.shoopingcart.cart;

public class Laptops extends Electronic{
public String model;

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}
public void showDetails()
{

		super.showDetails();
		System.out.println("Model"+model);
		}

}

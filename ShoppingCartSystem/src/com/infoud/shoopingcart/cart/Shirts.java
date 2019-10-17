package com.infoud.shoopingcart.cart;

public class Shirts extends Clothes{

	private String type;
	private String color;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void showDetails()
	{

			super.showDetails();
			System.out.println("ShirtType"+type);
			System.out.println("Color:"+color);
	}
}

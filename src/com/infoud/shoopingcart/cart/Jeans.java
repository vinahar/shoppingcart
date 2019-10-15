package com.infoud.shoopingcart.cart;

public class Jeans extends Clothes{
public String jeans_Type;
public String color;
public String getJeans_Type() {
	return jeans_Type;
}
public void setJeans_Type(String jeans_Type) {
	this.jeans_Type = jeans_Type;
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
		System.out.println("JenasType"+jeans_Type);
		System.out.println("Color:"+color);
}

}


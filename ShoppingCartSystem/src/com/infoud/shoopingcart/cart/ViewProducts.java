package com.infoud.shoopingcart.cart;
public class ViewProducts extends Storage{
	public void printCartItems() {
	
		for (Product prod: cart) {
           System.out.println("product:"+prod);
        }
          
        print();
    }
}

package com.infoud.shoopingcart.cartoperations;

import java.util.Map;

import com.infoud.shoopingcart.cart.Product;
import com.infoud.shoopingcart.cart.Storage;

public class ViewProducts{
	public void printCartItems() {
		for (Map.Entry<String, Product> entry : Storage.cart.entrySet()) {
			System.out.println("\tProduct Id:" + entry.getKey() + "\tProduct details:" + entry.getValue());
		}
    }
}

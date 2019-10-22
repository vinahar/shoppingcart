package com.infoud.shoopingcart.productoperations;

import java.util.Map;

import com.infoud.shoopingcart.cart.Product;
import com.infoud.shoopingcart.cart.Storage;

public class ViewSelledProducts {
	public void SelledProducts() {
		for (Map.Entry<String, Product> entry : Storage.sellproductlist.entrySet()) {
			System.out.println("\tProduct Id:" + entry.getKey() + "\tProduct details:" + entry.getValue().getName());
		}
    }
}

package com.infoud.shoopingcart.productoperations;


import java.util.Map;

import com.infoud.shoopingcart.cart.Product;
import com.infoud.shoopingcart.cart.Storage;


public class ProductFunctions {
	
	public void addProductToCartByPID(Product product) {

		Storage.cart.put(product.getPid(), product);

	}

	public void deleteProductToCartByPID(String pid) {
		Product product = getProductByProductID(pid);
		removeFromCart(product);
	}

	private void removeFromCart(Product product) {

		Storage.cart.remove(product.getPid());
	}

	public Product getProductByProductID(String pid) {
		Product product = null;
		Map<String, Product> products = Storage.getCart();
		System.out.println(products);
		for (Map.Entry<String, Product> entry : products.entrySet()) {
			if (entry.getKey().equals(pid)) {

				product = entry.getValue();
				System.out.println("found product:+" + product);
				break;
			}
		}
		return product;
	}

	public void printCartItems() {
		for (Map.Entry<String, Product> entry : Storage.cart.entrySet()) {
			System.out.println("Productid" + entry.getKey() + "productdetails" + entry.getValue());
		}
	}
	
	public void productUpdate(Product product ,int quantity) {
		
		product.setQuantity(product.getQuantity()-1);
	}

	// print();
}

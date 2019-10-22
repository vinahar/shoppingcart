package com.infoud.shoopingcart.cartoperations;

import com.infoud.shoopingcart.cart.Product;
import com.infoud.shoopingcart.cart.Storage;
import com.infoud.shoopingcart.productoperations.GetProductByid;

public class DeleteProducts extends GetProductByid {

	public void deleteProductToCartByPID(String pid) {
        Product product = getProductByProductID(pid);
       removeFromCart(product);
    }

	private void removeFromCart(Product product) {
		// TODO Auto-generated method stub
	
		Storage.cart.remove(product.getPid());
	}
	
	}

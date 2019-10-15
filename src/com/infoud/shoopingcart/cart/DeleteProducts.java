package com.infoud.shoopingcart.cart;

public class DeleteProducts extends GetProductByid {

	public void deleteProductToCartByPID(String pid) {
        Product product = getProductByProductID(pid);
       removeFromCart(product);
    }

	private void removeFromCart(Product product) {
		// TODO Auto-generated method stub
	
		cart.remove(product);
	}
}

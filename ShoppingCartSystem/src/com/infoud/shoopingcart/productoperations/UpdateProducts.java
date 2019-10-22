package com.infoud.shoopingcart.productoperations;

import com.infoud.shoopingcart.cart.Product;

public class UpdateProducts extends GetProductByid{
//----updating value in orderlist not in productlist---------
	Product product=new Product();
	public void productUpdate(Product product ,int quantity) {
		
		product.setQuantity(product.getQuantity()-1);
	}
	public void productUpdate1(Product product ,int quantity) {
		Product products=getProductByProductID(product.getPid());
		product.setQuantity(products.getQuantity()-1);
	}
}

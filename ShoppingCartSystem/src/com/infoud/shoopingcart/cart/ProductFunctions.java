package com.infoud.shoopingcart.cart;

import java.util.List;

public class ProductFunctions extends Storage{
	public List<Product> addProductToCartByPID(Product product) {
	       // Product product = getProductByProductID(pid);
	     //  addToCart(product)}

			cart.add(product);
			
			//setCart(cart);
			//System.out.println(""+cart);
			//System.out.println("addtocart" + product);
			return cart;
			
			//System.out.println("get cart" + cart);
			//return cart;
			
		
	}
	public void deleteProductToCartByPID(String pid) {
        Product product = getProductByProductID(pid);
       removeFromCart(product);
    }

	private void removeFromCart(Product product) {
		// TODO Auto-generated method stub
	
		cart.remove(product);
	}
	private Product getProductByProductID(String pid) {
        Product product = null;
        List<Product> products = getCart();
        for (Product prod: products) {
            if (prod.getPid().equals(pid)) {
            	//Product//
            	product = prod;
            	System.out.println("found product:+"+product);
                break;
            }
        }
        return product;
    }
	public void printCartItems() {
		
		for (Product prod: cart) {
           System.out.println("product["+prod.getPid()+"]:"+prod);
        }
          
        //print();
    }
	 
		

		public Product findProduct( String pid) {
			return getProductByProductID(pid);
			
		}
}

package com.infoud.shoopingcart.cart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.infoud.shoopingcart.users.Customer;

public class OrderRequest extends Storage{
	ProductFunctions productFunctions=new ProductFunctions();
	private Order orderRequest(String pid) {
		int i=0;
		Order order=new Order();
		order.setOrderid("order"+(i+1));
		order.setProduct(findProduct(pid));
		order.setStatus("pending");
		//setCustomerid(customerid);
		return order;
		
	}
	
	public void orderRequests(String pid)
	{
	orderlist.add(orderRequest(pid));
	

	}
	public void viewRequestedOrders() {
		System.out.println("Requested orders::");
		for (Order order : orderlist) {
			System.out.println("\t" + order);
		}
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
	public Product findProduct( String pid) {
		return getProductByProductID(pid);
		
	}
}
package com.infoud.shoopingcart.cart;


import java.util.ArrayList;
import java.util.List;

import com.infoud.shoopingcart.users.Admin;

public class MainUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Admin a=new Admin("admin1", "admin","admin", "password");
       Shirts shirts=new Shirts();
       // List<Product>product=new ArrayList<Product>();
   	shirts.setPid("2");
   	shirts.setName("tshirts");
   	shirts.setPrice(300.00);
   	shirts.setBrand("Roadster");
   	shirts.setSize("small");
   	shirts.setColor("grey");
   	shirts.setType("plain");
  
   	System.out.println("test"+ a.additems(shirts));
   	a.deleteitems("2");
	   
   //product.add(shirts);  
    
	}

}

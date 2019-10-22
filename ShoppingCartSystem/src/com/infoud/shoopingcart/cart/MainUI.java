package com.infoud.shoopingcart.cart;



import java.io.IOException;

import com.infoud.shoopingcart.userfunctions.UsersFunctions;
import com.infoud.shoopingcart.users.Admin;
import com.infoud.shoopingcart.users.Customer;
import com.infoud.shoopingcart.users.Employee;

public class MainUI {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Admin a = new Admin("admin1", "admin", "admin", "password");
		a.addnewEmployee("emp4","nikita@123","nikita");
		Employee e = new Employee("emp1", "employee", "emp1", "ravina", "andheri", 20000);
		
		
		  UsersFunctions usersFunctions=new UsersFunctions();
		  usersFunctions.addUsers(a);
		  usersFunctions.addUsers(e);
		 
		 
		
		Shirts shirts = new Shirts();
		shirts.setPid("2");
		shirts.setName("tshirts");
		shirts.setPrice(300.00);
		shirts.setBrand("Roadster");
		shirts.setSize("small");
		shirts.setColor("grey");
		shirts.setType("plain");
		shirts.setQuantity(20);

		Laptops laptops = new Laptops();
		laptops.setPid("1");
		laptops.setName("laptop");
		laptops.setPrice(30000.00);
		laptops.setQuantity(25);
		laptops.setSpecification("4GBRAM");
		laptops.setWarranty("2yrs");
		laptops.setModel("dell");

		Jeans jeans = new Jeans();
		jeans.setPid("3");
		jeans.setName("tshirts");
		jeans.setPrice(400.00);
		jeans.setBrand("Roadster");
		jeans.setSize("small");
		jeans.setColor("grey");
		jeans.setQuantity(15);
		jeans.setJeans_Type("plain");
		
		// ---adding products---?
		a.additems(shirts);
		a.additems(jeans);
		a.additems(laptops);
		
		// view product list
	a.showallproductsinCart();
	     
		 //a.viewcart();
		// deleting products
		a.deleteitems("3");
	//	a.viewcart();
		
	    // a.deleteitems("2");

		

		
		  Customer customer = new Customer("customer1", "customer", "customer123",
		  "prajkta", "badla");
		  usersFunctions.addUsers(customer);
		  
		  //create order 
		
		Order o = new Order();

		o.setCustomer(customer);
		o.setOrderid("1");
		o.setProduct(jeans);

		Customer customer1 = new Customer("customer2", "customer", "customer1234", "deepali", "kandivali");
		usersFunctions.addUsers(customer1);
		Order o2 = new Order();
		o.setCustomer(customer);
		o2.setOrderid("2");
		o2.setProduct(shirts);
		 
		  
		  //create requests
		  customer.buyProduct(o); 
	  customer.buyProduct(o2);
		  
		  // print requestorders 
		  customer.vieworderRequests(); 
		  
		 // Employee selling product
		  
		  e.sellProduct("2"); //
		  e.showsellproducts();
		  // print requestorders 
		  customer.vieworderRequests(); 
	
		  //show userslistbyrole
		  a.name();
		  //
		  
		  //a.viewcart();
		
		
		// System.out.println(Storage.userlist);
	}

}

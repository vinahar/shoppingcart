package com.infoud.shoopingcart.cart;

import java.util.ArrayList;
import java.util.List;

import com.infoud.shoopingcart.users.Admin;
import com.infoud.shoopingcart.users.Customer;
import com.infoud.shoopingcart.users.Employee;
import com.infoud.shoopingcart.users.User;

public class MainUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin a = new Admin("admin1", "admin", "admin", "password");
		Employee e = new Employee("emp1", "employee", "emp1", "ravina", "andheri", 20000);

		/*
		 * UsersFunctions usersFunctions=new UsersFunctions();
		 * usersFunctions.addUsers(a); usersFunctions.addUsers(e);
		 * usersFunctions.print(usersFunctions.groupByRole());
		 * System.out.println(usersFunctions.getUserlist());
		 */

		Shirts shirts = new Shirts();
		shirts.setPid("2");
		shirts.setName("tshirts");
		shirts.setPrice(300.00);
		shirts.setBrand("Roadster");
		shirts.setSize("small");
		shirts.setColor("grey");
		shirts.setType("plain");

		Laptops laptops = new Laptops();
		laptops.setPid("1");
		laptops.setName("laptop");
		laptops.setPrice(30000.00);
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
		jeans.setJeans_Type("plain");
		// ---adding products---?
		a.additems(shirts);
		a.additems(jeans);
		a.additems(laptops);
		// view product list
		a.viewcart();
		// deleting products
		a.deleteitems("3");
		a.viewcart();
		// a.viewcart();
		/*
		 * System.out.println("Products adding:"+"\nproduct added");
		 * System.out.println("Products adding:"+ +"\nproduct added");
		 * System.out.println("Products adding:"++"\nproduct added");
		 */// a.viewcart();
		// a.
		// a.deleteitems("2");

		// product.add(shirts);

		Customer customer = new Customer("customer1", "customer", "customer123", "prajkta", "badla");
		
		//create order
		Order o = new Order();
		
		// o.setCustomer(customer);
		o.setOrderid("1");
		o.setProduct(jeans);
		Order o2 = new Order();
		o2.setOrderid("2");
		o2.setProduct(shirts);
		
		//create requests
		customer.buyProduct(o);
		customer.buyProduct(o2);
		// customer.createOrder("1");
		// customer.orderRequests();

		// print requestorders
		customer.orderRequests();

		// function for sellimg product
		e.sellProduct("2");
		customer.orderRequests();

	}

}

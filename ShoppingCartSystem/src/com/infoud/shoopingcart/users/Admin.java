package com.infoud.shoopingcart.users;

import com.infoud.shoopingcart.cart.Product;
import com.infoud.shoopingcart.cart.Report;
import com.infoud.shoopingcart.cart.Storage;
import com.infoud.shoopingcart.cartoperations.AddEmployee;
import com.infoud.shoopingcart.cartoperations.AddProducts;
import com.infoud.shoopingcart.cartoperations.DeleteProducts;
import com.infoud.shoopingcart.cartoperations.ViewProducts;
import com.infoud.shoopingcart.productoperations.ProductFunctions;
import com.infoud.shoopingcart.userfunctions.UsersFunctions;

public class Admin extends User{
	Storage storage = new Storage();
	
	private AddProducts addProducts = new AddProducts();
	private DeleteProducts deleteProducts2 = new DeleteProducts();
	private ViewProducts viewProducts = new ViewProducts();
	private AddEmployee employee = new AddEmployee();
	private Report report = new Report();
	 
	ProductFunctions productFunctions= new ProductFunctions();
	 UsersFunctions usersFunctions=new UsersFunctions();
	  
	public Admin(String user_id, String role, String username, String password) {
		super(user_id, role);
		this.username = username;
		this.password = password;
	

	}

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public void additems(Product product) {
		//---using productFunction class---
		
		//  System.out.println("inside additem");
		/*
		 * productFunctions.addProductToCartByPID(product);
		 * System.out.println("item"+product+" added.");
		 */
		 
		//---using addproduct class---
		
		  addProducts.addProductToCartByPID(product);
		
		 
	}

	public void deleteitems(String pid) {
		//---using productFunction class---
		
		
		/*
		 * System.out.println("inside deleteitem");
		 * productFunctions.deleteProductToCartByPID(pid);
		 */	 		 
		
		//---using deleteproduct class---
		
		 // System.out.println("inside deleteitem");
		  deleteProducts2.deleteProductToCartByPID(pid);
		 
	}

	public void viewcart() {
		//---using productFunction class---
		
	//	System.out.println("inside viewcart");
		//productFunctions.printCartItems();
		 
		
		//---using viewproduct class---
		
		  System.out.println("Viewproducts:"); 
		  viewProducts.printCartItems();
		 
		

	}
	public void addnewEmployee(String userid,String empid,String empname) {
	      employee.addEmployee(userid,empid,empname);
	}
	public void showallproductsinCart() {
		   report.productsinStorage();
		 //  report.viewPlacedOrders();
			
	}
	public void showTotalSaleProducts() {
		 report.viewSaleReport();
		
	}
	public void name() {
		 report.viewUsersbyRole();
	}

}

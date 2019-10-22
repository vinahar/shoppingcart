package com.infoud.shoopingcart.cartoperations;

import com.infoud.shoopingcart.cart.Storage;
import com.infoud.shoopingcart.users.Employee;

public class AddEmployee {
 public void addEmployee(String userid,String empid,String empname) {
	 Storage.userlist.put(userid,new Employee(userid,"employee",empid,empname));
	
 }
}

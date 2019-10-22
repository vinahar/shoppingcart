package com.infoud.shoopingcart.users;

import java.util.Objects;

import com.infoud.shoopingcart.cart.Report;
import com.infoud.shoopingcart.orderOperations.ProcessOrders;

public class Employee extends  User{

	private String emp_id;
	private ProcessOrders processOrders=new ProcessOrders();
	private Report report=new Report();
	/**
	 * @param user_id
	 * @param role
	 * @param emp_id
	 * @param emp_name
	 */
	public Employee(String user_id, String role, String emp_id, String emp_name) {
		super(user_id, role);
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}
	public Employee(String userid,String userrole ,String emp_id, String emp_name, String empaddress, double salary) {
		super(userid, userrole);
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.empaddress = empaddress;
		this.salary = salary;
	}
	private String emp_name;
	private String empaddress;
	private double salary;
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(emp_id, emp_name, empaddress, salary);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(emp_id, other.emp_id) && Objects.equals(emp_name, other.emp_name)
				&& Objects.equals(empaddress, other.empaddress)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	public void sellProduct(String orderid) {
		// TODO Auto-generated method stub
		
		
			//orderFunctions.processOrder(orderid);
		processOrders.processOrder(orderid);	
		
		//productFunctions.
		//System.out.println(orderFunctions.processOrder(pid));
		
	}
	/**
	 * @param user_id
	 * @param role
	 */
	public Employee(String user_id, String role) {
		super(user_id, "Employee");
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", empaddress=" + empaddress + ", salary="
				+ salary + "]";
	}
	
	public void showsellproducts() {
		report.viewSaleReport();
	}
	

	
}

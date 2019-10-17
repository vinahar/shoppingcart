package com.infoud.shoopingcart.cart;



public class Electronic extends Product{
 private String Specification;
 private String Warranty;
public String getSpecification() {
	return Specification;
}
public void setSpecification(String specification) {
	Specification = specification;
}
public String getWarranty() {
	return Warranty;
}
public void setWarranty(String warranty) {
	Warranty = warranty;
}
public void showDetails()
{

		super.showDetails();
		System.out.println("Specification:"+Specification);
		System.out.println("Warranty:"+Warranty);
				//System.out.println(product1.get;
		}

}

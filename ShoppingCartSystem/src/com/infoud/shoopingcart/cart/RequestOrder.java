package com.infoud.shoopingcart.cart;

import com.infoud.shoopingcart.users.Customer;

public class RequestOrder extends Order {


		private Customer customer;
		private String orderId;

		public Customer getCustomer() {
		return customer;
		}


		public void setCustomer(Customer customer) {
		this.customer = customer;
		}


		public String getOrderId() {
		return orderId;
		}


		public void setOrderId(String orderId) {
		this.orderId = orderId;
		}


		/*public RequestOrder(int orderId, String orderStatus, Product product) {
		super(orderId, orderStatus, product);
		}
		*/

		

	

		@Override
		public String toString() {
			return "RequestOrder [customer=" + customer + ", orderId=" + orderId + ", getOrderid()=" + getOrderid()
					+ ", getStatus()=" + getStatus() + ", getProduct()=" + getProduct() + "]";
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((customer == null) ? 0 : customer.hashCode());
			result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			RequestOrder other = (RequestOrder) obj;
			if (customer == null) {
				if (other.customer != null)
					return false;
			} else if (!customer.equals(other.customer))
				return false;
			if (orderId == null) {
				if (other.orderId != null)
					return false;
			} else if (!orderId.equals(other.orderId))
				return false;
			return true;
		}








		}


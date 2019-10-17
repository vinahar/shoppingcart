package com.infoud.shoopingcart.users;

import java.util.Objects;

import com.infoud.shoopingcart.cart.Storage;

public class User {
		private String user_id;
		private String role;
		Storage storage = new Storage();

		public String getUser_id() {
			return user_id;
		}
		public void setUser_id(String user_id) {
			this.user_id = user_id;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		@Override
		public String toString() {
			return "User [user_id=" + user_id + ", role=" + role + "]";
		}
		
		public User(String user_id, String role) {
			super();
			this.user_id = user_id;
			this.role = role;
		}
		public User() {
			// TODO Auto-generated constructor stub
		}
		@Override
		public int hashCode() {
			return Objects.hash(role, user_id);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			User other = (User) obj;
			return Objects.equals(role, other.role) && Objects.equals(user_id, other.user_id);
		}
		
}

package com.infoud.shoopingcart.cart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.infoud.shoopingcart.users.User;

public class UsersFunctions extends Storage{

	public void addUsers(User user) {
		userlist.add(user);
	}
	public Map<String, List<User>> groupByRole() {
		//
		Map<String, List<User>> map = new HashMap<String, List<User>>();
		for (User usr : userlist) {
			List<User> user = new ArrayList<User>();
			user.add(usr);
			if (!map.containsKey(usr.getRole())) {

				map.put(usr.getRole(), user);
			} else {
				user.add(usr);
				map.replace(usr.getRole(), user);

			}
		}
		return map;

	}
	public void print(Map<String, List<User>> map) {

		Set<Entry<String, List<User>>> entrySet = map.entrySet();

		for (Entry<String, List<User>> entry : entrySet) {

			System.out.println("Employees In " + entry.getKey() + " : ");

			List<User> list = entry.getValue();

			for (User e : list) {
				System.out.println(e);
			}
		}
	}
	
}

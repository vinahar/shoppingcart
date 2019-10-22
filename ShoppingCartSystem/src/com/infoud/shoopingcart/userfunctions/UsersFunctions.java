package com.infoud.shoopingcart.userfunctions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.infoud.shoopingcart.cart.Storage;
import com.infoud.shoopingcart.users.User;

public class UsersFunctions{

	
	private void addUsers1(User user) {
		Storage.userlist.put(user.getUser_id(),user);
	}
	private Map<String,Map<String,User>> groupByRoles(Map<String,User>userlist) {
		
		
		  Map<String,Map<String,User>> userlists = new HashMap<String,Map<String,User>>();
		  Set<Entry<String,User>> entrySet = userlist.entrySet();
		  
		  for (Entry<String, User> entry : entrySet) 
		  {
			  
			  if(!userlists.containsKey(entry.getValue().getRole())){ 
				  userlists.put(entry.getValue().getRole(), new HashMap<String,User>()); 
				} 
			userlists.get(entry.getValue().getRole()).put(entry.getKey(),entry.getValue()); 
			}
		return userlists;
			  
  }
	
	
	public void addUsers(User user) {
		addUsers1(user);
	}
	public Map<String,Map<String,User>> groupByRole(Map<String,User>userlist){
		return groupByRoles(userlist);	
	}
			 
	
	public void print(Map<String,Map<String,User>> map) {

		
		Set<Entry<String, Map<String, User>>> entrySet = map.entrySet();
		for (Entry<String, Map<String, User>> entry : entrySet) {
		
			System.out.println("User Role " + entry.getKey() + " : ");
			Map<String, User>usermap = entry.getValue();
			  for (Entry<String, User> entry1 : usermap.entrySet()) 
			  {
				System.out.println(entry1.getKey()+"list:"+entry1.getValue());
			  }
		}
	}
	
}

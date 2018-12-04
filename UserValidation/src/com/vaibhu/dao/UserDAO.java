package com.vaibhu.dao;

import java.util.ArrayList;

import com.vaibhu.pojo.User;

public class UserDAO {
	
	ArrayList<User> userList;
	
	public UserDAO() {
		userList = new ArrayList<>();
		userList.add(new User("Vaibhavi", "java", "Admin"));
		userList.add(new User("Neha", "sql", "User"));
		userList.add(new User("Kajal", "java", "Admin"));
	}
	
	public String getUserType(String userName, String password) {
		for(User user:userList) {
			if(user.getUserName().equals(userName) && user.getPassword().equals(password))
			{
				return user.getUserType();
			}
		}
		throw new InvalidUserException("User Name and Password doesnt exists...");
	}

}

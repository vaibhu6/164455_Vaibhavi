package com.vaibhu.dao;

import java.util.ArrayList;

import com.vaibhu.pojo.User;

public class UserDAO implements IUserDAO {
	ArrayList<User> userList;

	public UserDAO() {
		userList=new ArrayList<User>();
		
		userList.add(new User("Vaibhavi","java","Admin"));
		userList.add(new User("Neha","sql","User"));
		userList.add(new User("Vinit","java","User"));
		userList.add(new User("Kajal","sql","Admin"));
	}
	
	public String getUserType(String username, String password){
	 for(User a:userList){
		 if(a.getUsername().equals(username) && a.getPassword().equals(password))
			 return a.getStatus();
	 }throw new InvalidUserException("Incorrect Details");
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePassword(String username, String oldPassword,
			String newPassword) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUser(User user) {
		// TODO Auto-generated method stub
		
	}
	
}

package com.vaibhu.dao;

import java.util.ArrayList;

import com.vaibhu.pojo.User;

public class UserDAO {
ArrayList<User> userList;
public UserDAO(){
	userList=new ArrayList<User>();
	userList.add(new User("Vaibhavi","java","Admin"));
	userList.add(new User("Neha","sql","User"));
	userList.add(new User("Vinit","deva","Admin"));
	userList.add(new User("Kajal","cdeva","Admin"));
	
}
public String getUserType(String UserName,String Password){
	//userList.stream().filter(x->x.getUserName().equals(UserName) && x.getPassWord().equals(Password));
	
	for(User a:userList){
		if(a.getUserName().equals(UserName) && a.getPassWord().equals(Password)){
			return a.getStatus();
		}
	}throw  new InvalidUserException("incorrect login details......");

	
}

}
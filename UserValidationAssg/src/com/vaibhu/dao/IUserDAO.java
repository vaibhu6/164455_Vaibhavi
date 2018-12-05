package com.vaibhu.dao;

import com.vaibhu.pojo.User;

public interface IUserDAO {
	
	public String getUserType(String username, String password);
	public void addUser(User user);
	public void changePassword(String username, String oldPassword, String newPassword);
	public void removeUser(User user);
}

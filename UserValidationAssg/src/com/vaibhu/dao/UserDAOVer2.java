package com.vaibhu.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vaibhu.pojo.User;

public class UserDAOVer2 implements IUserDAO{

	@Override
	public String getUserType(String username, String password) {
		Connection connection=ConnectionFactory.getConnection();
		try{
		PreparedStatement statement=connection.prepareStatement("Select * from Usertable where username=? and password =?");
		statement.setString(1, username);
		statement.setString(2, password);
		ResultSet set=statement.executeQuery();
		while(set.next()){
			if(set.getString("username").equals(username)&& set.getString("password").equals(password))
				return set.getString("usertype");
			}
		}catch(SQLException e){
			e.printStackTrace();
		} 
		return null;
		
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
	
	public static void main(String[] args) {
		System.out.println(new UserDAOVer2().getUserType("Vaibhavi", "java"));
	}
}

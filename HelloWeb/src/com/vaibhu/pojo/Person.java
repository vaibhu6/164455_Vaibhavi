package com.vaibhu.pojo;

public class Person {
	String username;
	String password;
		
	public Person(String login, String password) {
		super();
		this.username = login;
		this.password = password;
	}
	
	public String getLogin() {
		return username;
	}
	public void setLogin(String login) {
		this.username = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

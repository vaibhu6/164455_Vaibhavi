package com.vaibhu.dao;

public class InvalidUserException extends RuntimeException {
	
	public InvalidUserException(String msg) {
		super(msg);
	}

}

package com.vaibhu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.vaibhu.pojo.Person;

public class UserDao {
	
	    public Object extractData(ResultSet rs) throws SQLException {
	        Person person = new Person(username, password);
	        person.username(rs.getString("vaibhu"));
	        person.password(rs.getString("123456"));
	        return person;
	    

	}
}

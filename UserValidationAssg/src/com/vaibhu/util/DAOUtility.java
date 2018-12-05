package com.vaibhu.util;

import com.vaibhu.dao.IUserDAO;
import com.vaibhu.dao.UserDAOVer2;

public class DAOUtility {
	public static IUserDAO getUserDAO(){
		return new UserDAOVer2(); 
	}
}

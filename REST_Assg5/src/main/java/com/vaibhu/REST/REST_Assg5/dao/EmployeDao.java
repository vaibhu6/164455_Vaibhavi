package com.vaibhu.REST.REST_Assg5.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vaibhu.REST.REST_Assg5.model.Employee;

public class EmployeDao {

	public static Map<Integer , Employee> employees = new HashMap<Integer, Employee>();

	public static Map<Integer, Employee> getEmployees() {
		return employees;
	}
	
}
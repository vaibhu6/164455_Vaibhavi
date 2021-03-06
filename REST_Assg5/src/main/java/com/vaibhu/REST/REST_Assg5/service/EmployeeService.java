package com.vaibhu.REST.REST_Assg5.service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vaibhu.REST.REST_Assg5.dao.EmployeDao;
import com.vaibhu.REST.REST_Assg5.model.Employee;

public class EmployeeService {
	
	private Map<Integer , Employee> employees = EmployeDao.getEmployees();
	

	public EmployeeService() {

		employees.put(101,new Employee( 1, "Vaibhavi", "Java", "abc", 500000));
		employees.put(102,new Employee( 2, "Vinit", "BI", "def", 800000));
		employees.put(103,new Employee( 3, "Kajal", "BI", "xyz", 100000));
		employees.put(104,new Employee( 4, "Abhay", "Java", "mno", 90000));
	}

	public ArrayList<Employee> getAllEmployee(){
		return new ArrayList<Employee>(employees.values());
	}
	
	public Employee AddEmployee(Employee employee){
		employee.setEmployeeId(employees.size()+1);
		employees.put(employee.getEmployeeId(), employee);
		return employee;
	}
		
	public Employee deleteEmployee(int id){
		return employees.remove(id);
	}
	
	public Employee employee(int id){
		return employees.get(id);
	}

}
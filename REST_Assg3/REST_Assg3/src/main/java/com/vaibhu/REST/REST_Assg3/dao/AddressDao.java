package com.vaibhu.REST.REST_Assg3.dao;

import java.util.ArrayList;
import java.util.List;

import com.vaibhu.REST.REST_Assg3.pojo.Address;

public class AddressDao {
	
	public List<Address> getAddress(){
		 List<Address> list=new ArrayList<Address>();
		list.add(new Address("Maharashtra","Mira Road","India", 401107));
		list.add(new Address("Pune","Mira Road","India", 123456));
		list.add(new Address("Bangalore","Mira Road","India", 789456));
		return list;
	}
	
}

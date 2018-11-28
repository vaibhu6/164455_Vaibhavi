package com.vaibhu.cf;


import java.util.HashMap;
import java.util.Set;

public class DateCompare {
	
	public static void main(String[] args) {


		HashMap<Date, String> hm=new HashMap<Date,String>();   
		
		Date Dob1=new Date(11,12,2015);
		Date Dob2=new Date(11,12,2015 );
		Date Dob3=new Date(11,1,2016);
		hm.put(Dob1,"Vaibhavi");    
		hm.put(Dob2,"Vinit"); 
		hm.put(Dob3,"Neha"); 
	
		System.out.println("Name:"+get(Dob1,hm ));
		System.out.println("Name:"+get(Dob2,hm ));
		System.out.println("Name:"+get(Dob3,hm ));	
	}

	private static String get(Date obj,HashMap<Date, String>  hm) {
		
		Set<Date> dates=hm.keySet();
		Date[] d=(Date[]) dates.toArray(new Date[0]);
		
		
		for(Date i:d){
		if(obj.getDd()==i.getDd() && obj.getMm()==i.getMm() && obj.getYyyy()!=i.getYyyy() ){
		return "fail";
		}
	     }
		return (String) hm.get(obj);
	}
}
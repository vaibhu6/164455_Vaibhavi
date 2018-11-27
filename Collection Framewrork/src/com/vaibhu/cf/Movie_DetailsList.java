package com.vaibhu.cf;

import java.util.*;

public class Movie_DetailsList {
	
	
 	public void add_movie(){
 	}
	
	public static void main(String[] args) {
		ArrayList<Movie_Details> list=new ArrayList<Movie_Details>();
		list.add(new Movie_Details("C","CB","CC","CD"));
		list.add(new Movie_Details("A","AB","AC","AD"));
		list.add(new Movie_Details("B","BB","BC","BD"));
		
		System.out.println("Genere Comparator");
		System.out.println();
		Collections.sort(list,new Genere_Comparator());  
		for(Movie_Details st: list){  
		System.out.println(st.getMovie_Name()+"\t"
								+st.getLead_Actor()+"\t"
								+st.getLead_Actress()+"\t"
								+st.getGenere());  
		}  
		System.out.println();
		System.out.println("Movie Name Comparator");
		System.out.println();
		Collections.sort(list,new movie_Name_Comparator());  
		for(Movie_Details st: list){  
		System.out.println(st.getMovie_Name()+"\t"
								+st.getLead_Actor()+"\t"
								+st.getLead_Actress()+"\t"
								+st.getGenere());  
		}  
		
	}
	

}

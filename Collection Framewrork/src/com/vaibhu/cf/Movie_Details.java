package com.vaibhu.cf;

import java.util.Comparator;

public class Movie_Details {
	public String Movie_Name;
	public String Lead_Actor;
	public String Lead_Actress;
	public String Genere;
	


	public Movie_Details(String movie_Name, String lead_Actor,
			String lead_Actress, String genere) {
		super();
		this.Movie_Name = movie_Name;
		this.Lead_Actor = lead_Actor;
		this.Lead_Actress = lead_Actress;
		this.Genere = genere;
	}

	public String getMovie_Name() {
		return Movie_Name;
	}
	
	public String getLead_Actor() {
		return Lead_Actor;
	}

	public String getLead_Actress() {
		return Lead_Actress;
	}
	
	public String getGenere() {
		return Genere;
	}
	
}
class Genere_Comparator implements Comparator<Movie_Details> {

	@Override
	public int compare(Movie_Details s1,Movie_Details s2) {
		return s1.getGenere().compareTo(s2.getGenere());		
	}
}
class movie_Name_Comparator implements Comparator<Movie_Details> {

	@Override
	public int compare(Movie_Details s1,Movie_Details s2) {
		return s1.getMovie_Name().compareTo(s2.getMovie_Name());		
	}
}
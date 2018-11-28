package com.vaibhu.cf;

import java.util.Comparator;

public class MovieDetails implements Comparator<MovieDetails>{

	private String movieName;
	private String leadActor;
	private String leadActoress;
	private String genre;
	
	public MovieDetails() {
		// TODO Auto-generated constructor stub
		this.movieName=null;
		this.leadActor=null;
		this.leadActoress=null;
		this.genre=null;
	}

	public MovieDetails(String movieName, String leadActor,
			String leadActoress, String genre) {
		super();
		this.movieName = movieName;
		this.leadActor = leadActor;
		this.leadActoress = leadActoress;
		this.genre = genre;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}

	public String getleadActoress() {
		return leadActoress;
	}

	public void setleadActoress(String leadActoress) {
		this.leadActoress = leadActoress;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public int compare(MovieDetails arg0, MovieDetails arg1) {
		
		return arg0.movieName.compareTo(arg1.movieName);
		
	}

	@Override
	public boolean equals(Object arg0) {
		
		MovieDetails movie=(MovieDetails)arg0;
		return movieName.equals(movie.getMovieName())&&
				leadActor.equals(movie.getLeadActor())&&
				leadActoress.equals(movie.getleadActoress())&&
				genre.equals(movie.getGenre());
	}
	
	@Override
	public String toString() {
		return "MovieName : " + movieName + "\nLeadActor : "
				+ leadActor + "\nleadActoress : " + leadActoress + "\nGenre : "
				+ genre;
	}
	
}
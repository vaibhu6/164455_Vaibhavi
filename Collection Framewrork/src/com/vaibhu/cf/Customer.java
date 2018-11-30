package com.vaibhu.cf;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovieDetailsList movieDetailsList=new MovieDetailsList();
		movieDetailsList.addMovie(new MovieDetails("X","Y","Z","A"));
		movieDetailsList.addMovie(new MovieDetails("A","B","C","P"));
		movieDetailsList.addMovie(new MovieDetails("P","Q","R","M"));
		movieDetailsList.addMovie(new MovieDetails("M","N","O","X"));
		
		
		System.out.println(movieDetailsList.findMovieByMovieName("X"));
		System.out.println(movieDetailsList.findMovieByGenre("M"));
		System.out.println(movieDetailsList.removeMovie(new MovieDetails("M","N","O","X")));
		movieDetailsList.display();
		movieDetailsList.sort("leadActoress");
		movieDetailsList.display();
	}

}
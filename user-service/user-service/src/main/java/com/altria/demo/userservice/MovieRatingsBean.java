package com.altria.demo.userservice;

public class MovieRatingsBean {
	
	
	private int movieId;
	private String movieName;
	private int ratings;
	private String port;
	public MovieRatingsBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MovieRatingsBean(int movieId, String movieName,int ratings,String port) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.ratings = ratings;
		this.port=port;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	
	

}

package com.altria.demo.userservice;

public class RatingBean {
	
	private int rating;
	private int movieId;
	private String port;
	public RatingBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RatingBean(int rating, int movieId) {
		super();
		this.rating = rating;
		this.movieId = movieId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	

}

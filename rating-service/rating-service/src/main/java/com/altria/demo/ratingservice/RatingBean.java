package com.altria.demo.ratingservice;

public class RatingBean {
	
	private int rating;
	private int movieId;
	public RatingBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RatingBean(int movieId, int rating) {
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
	
	

}

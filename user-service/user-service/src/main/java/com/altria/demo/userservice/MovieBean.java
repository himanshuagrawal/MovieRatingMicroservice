package com.altria.demo.userservice;

public class MovieBean {

	private int movieId;
	private String movieName;
	private String port;
	
	public MovieBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MovieBean(int movieId, String movieName,String port) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.port=port;
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
	
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	
	
	
}
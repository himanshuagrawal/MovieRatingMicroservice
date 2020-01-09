package com.altria.demo.userservice;

import java.util.List;

public class UserBean {
	
	private int userId;
	private String userName;
	private List<MovieRatingsBean> movieRatings;
	private String ratingsPort;
	
	public String getRatingsPort() {
		return ratingsPort;
	}
	public void setRatingsPort(String ratingsPort) {
		this.ratingsPort = ratingsPort;
	}
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserBean(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<MovieRatingsBean> getMovieRatings() {
		return movieRatings;
	}
	public void setMovieRatings(List<MovieRatingsBean> movieRatings) {
		this.movieRatings = movieRatings;
	}
	
	

}

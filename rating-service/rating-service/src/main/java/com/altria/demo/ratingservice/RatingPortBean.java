package com.altria.demo.ratingservice;

import java.util.List;

public class RatingPortBean {
	
	private int userId;
	private List<RatingBean> listRatingBeans;
	private String port;
	public RatingPortBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RatingPortBean(int userId, List<RatingBean> listRatingBeans, String port) {
		super();
		this.userId = userId;
		this.listRatingBeans = listRatingBeans;
		this.port = port;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public List<RatingBean> getListRatingBeans() {
		return listRatingBeans;
	}
	public void setListRatingBeans(List<RatingBean> listRatingBeans) {
		this.listRatingBeans = listRatingBeans;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	
	
	

}

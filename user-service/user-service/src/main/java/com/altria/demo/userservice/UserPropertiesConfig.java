package com.altria.demo.userservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "user-service")
public class UserPropertiesConfig {
	
	private int numberOfUsers;
	private int numberOfMovies;
	
	
	
	public UserPropertiesConfig() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public UserPropertiesConfig(int numberOfUsers, int numberOfMovies) {
		super();
		this.numberOfUsers = numberOfUsers;
		this.numberOfMovies = numberOfMovies;
	}


	public int getNumberOfUsers() {
		return numberOfUsers;
	}
	public void setNumberOfUsers(int numberOfUsers) {
		this.numberOfUsers = numberOfUsers;
	}
	public int getNumberOfMovies() {
		return numberOfMovies;
	}
	public void setNumberOfMovies(int numberOfMovies) {
		this.numberOfMovies = numberOfMovies;
	}
	
	
}

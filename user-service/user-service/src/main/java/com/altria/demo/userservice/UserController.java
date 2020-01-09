package com.altria.demo.userservice;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	private Logger logger  = Logger.getLogger(UserController.class.getName());
	@Autowired
	private UserPropertiesConfig propConfig;
	@Autowired
	private UserService userService;
	@Autowired
	private Environment env;
	
	@GetMapping(value="/getDetails")
	public String getDetails(){
		logger.info("REquest Received....!");//1b27e6b9b01921a5
		return "Number of Movies = "+propConfig.getNumberOfMovies()+" "+"Number of Users = "+propConfig.getNumberOfUsers();
	}
	
	@GetMapping(value="/getMovieRatings")
	public UserBean getMovieRatings(@RequestParam("userid") int userId ){
		logger.info("Server port hit is---->"+env.getProperty("local.server.port"));
		return userService.getMovieRatings(userId);
	}

}

package com.altria.demo.movieservice;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MovieServiceController {
	
	private Logger logger  = Logger.getLogger(MovieServiceController.class.getName());
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping(value="/getMovie")
	public MovieBean getMovie(@RequestParam("movieId") int movieId){
		logger.info("Get Movie Service Called.....!");
		return movieService.getMovie(movieId);
	}

}

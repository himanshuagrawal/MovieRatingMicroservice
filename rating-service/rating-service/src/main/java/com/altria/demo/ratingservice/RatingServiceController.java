package com.altria.demo.ratingservice;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RatingServiceController {
	
	private Logger logger  = Logger.getLogger(RatingServiceController.class.getName());
	
	@Autowired
	private RatingService ratingService;
	
	@GetMapping(value="/getRatings")
	public RatingPortBean getRatings(@RequestParam("userId") int userId){
		logger.info("Rating Service Called....!");
		return ratingService.getratings(userId);
	}
}

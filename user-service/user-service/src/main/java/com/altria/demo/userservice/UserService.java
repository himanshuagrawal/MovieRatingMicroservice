package com.altria.demo.userservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	private static Map<Integer,String> map;
	static{
		map = new HashMap<>();
		map.put(101, "Aman");
		map.put(102, "Raj");
		map.put(103, "Bobby");
	}
	
	public UserBean getMovieRatings(int userId){
		RatingPortBean ratingPortBean = restTemplate.getForObject("http://rating-service/getRatings?userId="+userId,RatingPortBean.class);
		UserBean userBean = new UserBean(userId,map.get(userId));
		List<MovieRatingsBean> list = new ArrayList<>();
		for(RatingBean bean:ratingPortBean.getListRatingBeans()){
			MovieBean movieBean = restTemplate.getForObject("http://movie-service/getMovie?movieId="+bean.getMovieId(), MovieBean.class);
			list.add(new MovieRatingsBean(bean.getMovieId(),movieBean.getMovieName(),bean.getRating(),movieBean.getPort()));
		}
		userBean.setRatingsPort(ratingPortBean.getPort());
		userBean.setMovieRatings(list);
		return userBean;
	}

}

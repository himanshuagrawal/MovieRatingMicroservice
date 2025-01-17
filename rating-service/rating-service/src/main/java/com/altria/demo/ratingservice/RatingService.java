package com.altria.demo.ratingservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class RatingService {

	private static Map<Integer, List<RatingBean>> map;
	@Autowired
	private Environment env;
	
	static {
		map = new HashMap<>();
		map.put(101, new ArrayList<>(Arrays.asList(new RatingBean(1001, 4), new RatingBean(1002, 2),
				new RatingBean(1004, 5))));
		map.put(102, new ArrayList<>(Arrays.asList(new RatingBean(1003, 4), new RatingBean(1002, 4),
				new RatingBean(1005, 5))));
		map.put(103, new ArrayList<>(Arrays.asList(new RatingBean(1002, 1), new RatingBean(1003, 1),
				new RatingBean(1001, 5))));
	}

	public RatingPortBean getratings(int userId) {
		return new RatingPortBean(userId, map.get(userId), env.getProperty("local.server.port"));
	}

}

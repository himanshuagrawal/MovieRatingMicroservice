package com.altria.demo.movieservice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	
	@Autowired
	private Environment env;
	private static Map<Integer,String> map;
	static{
		map = new HashMap<>();
		map.put(1001, "Jumanji");
		map.put(1002, "Dracula");
		map.put(1003, "Transformer");
		map.put(1004, "IronMan");
		map.put(1005, "Batman");
	}
	public MovieBean getMovie(int movieId) {
		return new MovieBean(movieId,map.get(movieId),env.getProperty("local.server.port"));
	}

	
}

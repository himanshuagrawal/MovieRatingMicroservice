package com.altria.demo.movieservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;

@EnableEurekaClient
@SpringBootApplication
public class MovieServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieServiceApplication.class, args);
	}
	
	@Bean 
	public Sampler defaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}
	
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

}

package com.briz.springboo_discovery_client1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
@RequestMapping("/service1")
public class SpringbooDiscoveryClient1Application 
{

	@Autowired
	RestTemplate resttemplate;
	
	public static void main(String[] args)
	{
		SpringApplication.run(SpringbooDiscoveryClient1Application.class, args);
	}
	@RequestMapping("/kanchan")
	public String test()
	{
		return "This is service1 calling";
	}
	/*
	@Bean   // this can also be done in seperate configuration file with @Configuration 
	public RestTemplate rest()
	{
		return new RestTemplate();
	}
	*/
@RequestMapping("/hello")
public String resting()// return type must be of second service i.e String 
{
	String url = "http://localhost:7575/service2/one";// proper port number and IP address given 
	return resttemplate.getForObject(url, String.class);
}
}

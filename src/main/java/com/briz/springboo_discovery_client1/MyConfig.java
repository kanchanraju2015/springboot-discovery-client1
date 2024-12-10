package com.briz.springboo_discovery_client1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyConfig 
{
@Bean
public RestTemplate rest()
{
	return new RestTemplate();
}
}

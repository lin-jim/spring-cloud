package com.udcloud.jim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {

	@Autowired
	private RestTemplate template;
	
	@HystrixCommand(fallbackMethod="helloError")
	public String hiService() {
        return template.getForObject("http://spring-cloud-client/hello",String.class);
    }

	public String helloError(){
		return "server error,sorry!";
	}
	
}
